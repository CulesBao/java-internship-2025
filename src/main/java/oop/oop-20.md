# Dependency Injection và Inversion of Control (IoC) trong Java
## Dependency Injection (DI)
Dependency Injection (DI) là một mẫu thiết kế phần mềm giúp giảm sự phụ thuộc giữa các thành phần trong hệ thống bằng cách "tiêm" các phụ thuộc từ bên ngoài thay vì để các thành phần tự tạo hoặc quản lý chúng. Điều này giúp tăng tính linh hoạt, khả năng mở rộng và dễ dàng kiểm thử mã nguồn.
```java
public class EmailService {
    public void sendEmail(String message, String receiver){
        System.out.println("Email sent to "+receiver+"with Message="+message);
    }
    
}
public class MyApplication {
    private EmailService email = new EmailService();

    public void processMessages(String msg, String receiver){
        // Thực hiện validate nội dung thư
        this.email.sendEmail(msg,receiver);
    }
}
public class ApplicationTest {
    public static void main(String[] args){
        MyApplication app = new MyApplication();
        app.processMessages("Hi Framgia", "framgia@framgia.com");
    }
}
```
Trong ví dụ trên, lớp `MyApplication` phụ thuộc vào lớp `EmailService`. Điều này tạo ra sự phụ thuộc chặt chẽ giữa hai lớp, làm cho việc thay đổi hoặc kiểm thử trở nên khó khăn.

Bên cạnh đó, khi ta muốn thay đổi cách gửi email (ví dụ: sử dụng SMS thay vì email), ta phải sửa đổi mã nguồn của `MyApplication`, điều này vi phạm nguyên tắc mở/đóng (Open/Closed Principle).

Để giải quyết vấn đề này, ta có thể sử dụng Dependency Injection để "tiêm" phụ thuộc từ bên ngoài:
```java
// Service
public interface MessageService {
    void sendMessage(String msg, String receiver);
}
public class EmailService implements MessageService {
    public void sendMessage(String msg, String receiver){
        System.out.println("Email sent to "+receiver+" with Message="+msg);
    }
}
public class SMSService implements MessageService {
    public void sendMessage(String msg, String receiver){
        System.out.println("SMS sent to "+receiver+" with Message="+msg);
    }
}
```

```java
// Consumer
public interface Consumer {
    public void processMessages(String msg, String receiver);
}
public class MyDIApplication implements Consumer {
    private MessageService service;

    public MyDIApplication(MessageService svc){
        this.service = svc;
    }

    public void processMessages(String msg, String receiver){
        // Thực hiện validate msg
        this.service.sendMessage(msg,receiver);
    }
}
```
```java
// Injector
public interface MessageServiceInjector {
    public Consumer getConsumer();
}
public class EmailServiceInjector implements MessageServiceInjector {

	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}
}
public class SMSServiceInjector implements MessageServiceInjector {

	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}
}
```

```java
// Client
public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hi Pankaj";
		String email = "pankaj@abc.com";
		String phone = "4088888888";
		MessageServiceInjector injector = null;
		Consumer app = null;

		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);

		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}
}
```
Trong ví dụ trên, ta đã tạo ra một giao diện `MessageService` và hai lớp triển khai `EmailService` và `SMSService`. Lớp `MyDIApplication` nhận một đối tượng `MessageService` thông qua constructor, giúp tách rời sự phụ thuộc giữa các lớp.

Trong Spring Framework, DI được hỗ trợ mạnh mẽ thông qua việc sử dụng các annotation như `@Autowired`, `@Component`, và `@Configuration`. Spring sẽ tự động quản lý việc tiêm phụ thuộc cho các bean trong ứng dụng. Phần này sẽ liên quan đến Inversion of Control (IoC) mà ta sẽ thảo luận tiếp theo.

## Inversion of Control (IoC)
Inversion of Control (IoC) là một nguyên tắc thiết kế trong đó việc kiểm soát luồng chương trình được đảo ngược. Thay vì các thành phần trong hệ thống tự quản lý và tạo ra các phụ thuộc của mình, IoC cho phép một framework hoặc container bên ngoài chịu trách nhiệm quản lý vòng đời và phụ thuộc của các thành phần đó. Điều này giúp giảm sự phụ thuộc chặt chẽ giữa các thành phần và tăng tính linh hoạt của hệ thống.

Trong ví dụ về Dependency Injection ở trên, ta đã thấy cách IoC hoạt động thông qua việc sử dụng một injector để tạo và cung cấp các phụ thuộc cho lớp `MyDIApplication`.

Trong Spring Framework, IoC được thực hiện thông qua một container IoC (thường được gọi là ApplicationContext). Container này chịu trách nhiệm tạo, cấu hình và quản lý vòng đời của các bean trong ứng dụng. Khi một bean cần một phụ thuộc, container sẽ tự động tiêm phụ thuộc đó vào bean thông qua các phương thức như constructor injection, setter injection hoặc field injection.

Dưới đây là phiên bản đơn giản của ví dụ trên sử dụng Spring Framework để minh họa IoC và DI:
```java
// Service Interface
public interface MessageService {
    void sendMessage(String msg, String receiver);
}
// Email Service Implementation
@Service
public class EmailService implements MessageService {
    public void sendMessage(String msg, String receiver){
        System.out.println("Email sent to "+receiver+" with Message="+msg);
    }
}
// SMS Service Implementation
@Service
public class SMSService implements MessageService {
    public void sendMessage(String msg, String receiver){
        System.out.println("SMS sent to "+receiver+" with Message="+msg);
    }
}
// Consumer
@Component
public class MyDIApplication {
    private MessageService service; 
    @Autowired
    public MyDIApplication(MessageService svc){
        this.service = svc;
    }
    public void processMessages(String msg, String receiver){
        // Thực hiện validate msg
        this.service.sendMessage(msg,receiver);
    }
}
// Main Application
@SpringBootApplication
public class MySpringApp {
    public static void main(String[] args) {
        ApplicationContext context =
            SpringApplication.run(MySpringApp.class, args);
    }
}
```
Trong ví dụ trên, ta sử dụng các annotation của Spring như `@Service` để đánh dấu các lớp dịch vụ và `@Component` để đánh dấu lớp tiêu thụ. Annotation `@Autowired` được sử dụng để tự động tiêm phụ thuộc `MessageService` vào `MyDIApplication`. Spring IoC container sẽ quản lý việc tạo và tiêm các bean này, giúp giảm sự phụ thuộc chặt chẽ giữa các thành phần và tăng tính linh hoạt của ứng dụng.
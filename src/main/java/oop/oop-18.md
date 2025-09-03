# Design pattern là gì
Design pattern (mẫu thiết kế) là các giải pháp tái sử dụng được cho các vấn đề phổ biến trong phát triển phần mềm. Chúng cung cấp các cách tiếp cận đã được kiểm chứng để giải quyết các vấn đề thiết kế phần mềm, giúp cải thiện tính tái sử dụng, bảo trì và mở rộng của mã nguồn.
## Các loại design pattern phổ biến
1. **Creational Patterns**: Tập trung vào việc tạo đối tượng một cách hiệu quả.
2. **Structural Patterns**: Tập trung vào việc tổ chức các lớp và đối tượng để tạo thành các cấu trúc lớn hơn.
3. **Behavioral Patterns**: Tập trung vào việc giao tiếp giữa các đối tượng.
## Ví dụ về một số design pattern phổ biến
### Singleton Pattern
Đảm bảo rằng một lớp chỉ có một thể hiện duy nhất và cung cấp một điểm truy cập toàn cục đến thể hiện đó.
```java
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```
- **Ưu điểm**: Đảm bảo rằng chỉ có một thể hiện của lớp, tiết kiệm tài nguyên. Dễ dàng truy cập từ bất kỳ đâu trong ứng dụng.
- **Nhược điểm**: Khó khăn trong việc kiểm thử (unit testing) do tính toàn cục của thể hiện. Vi phạm nguyên tắc Single Responsibility vì lớp chịu trách nhiệm cả về việc quản lý thể hiện và logic nghiệp vụ.
### Factory Pattern
Cung cấp một giao diện để tạo các đối tượng trong một siêu lớp, nhưng cho phép các lớp con quyết định lớp nào sẽ được khởi tạo.
```java
public interface Shape {
    void draw();
}
public class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
public class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
```
- **Ưu điểm**: Giảm sự phụ thuộc vào các lớp cụ thể, dễ dàng mở rộng và bảo trì mã nguồn. Tuân thủ nguyên tắc Open/Closed, SRP.
- **Nhược điểm**: Tăng độ phức tạp của mã nguồn do việc thêm các lớp và giao diện mới.
### Adapter Pattern
Cho phép các lớp với giao diện không tương thích làm việc cùng nhau bằng cách chuyển đổi giao diện của một lớp thành giao diện mà khách hàng mong đợi.
```java
public interface Target {
    void request();
}
public class Adaptee { 
    public void specificRequest() {
        System.out.println("Specific request");
    }
}
public class Adapter implements Target {
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    public void request() {
        adaptee.specificRequest();
    }
}
```
- **Ưu điểm**: Cho phép tích hợp các lớp không tương thích mà không cần thay đổi mã nguồn gốc. Tăng tính linh hoạt và tái sử dụng mã nguồn. Tuân thủ nguyên tắc Open/Closed, SRP.
- **Nhược điểm**: Tăng độ phức tạp của mã nguồn do việc thêm các lớp trung gian.
### Observer Pattern
Định nghĩa một phụ thuộc một-nhiều giữa các đối tượng sao cho khi một đối tượng thay đổi trạng thái, tất cả các đối tượng phụ thuộc của nó sẽ được thông báo và cập nhật tự động.
```java
import java.util.ArrayList;
import java.util.List;
public interface Observer {
    void update(String message);
}
public class ConcreteObserver implements Observer {
    private String name;
    public ConcreteObserver(String name) {
        this.name = name;
    }
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    public void subscribe(Observer observer) {
        observers.add(observer);
    }
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
```
- **Ưu điểm**: Giảm sự phụ thuộc giữa các đối tượng, tăng tính linh hoạt và mở rộng. Tuân thủ nguyên tắc Open/Closed, SRP.
- **Nhược điểm**: Có thể dẫn đến hiệu suất kém nếu có quá nhiều đối tượng quan sát. Khó khăn trong việc quản lý vòng đời của các đối tượng quan sát.
## Lợi ích của việc sử dụng design pattern
1. **Tái sử dụng mã nguồn**: Giúp giảm thiểu việc viết lại mã nguồn cho các vấn đề phổ biến.
2. **Cải thiện tính bảo trì**: Mã nguồn trở nên dễ hiểu và dễ bảo trì hơn.
3. **Tăng tính linh hoạt**: Dễ dàng mở rộng và thay đổi mã nguồn mà không ảnh hưởng đến các phần khác.
4. **Cải thiện giao tiếp**: Giúp các nhà phát triển hiểu rõ hơn về cấu trúc và thiết kế của hệ thống
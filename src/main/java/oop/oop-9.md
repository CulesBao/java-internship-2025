# Annotation là gì?

Annotation trong Java là một dạng siêu dữ liệu (metadata) cung cấp thông tin bổ sung về chương trình mà không ảnh hưởng
trực tiếp đến logic của chương trình. Annotation được sử dụng để cung cấp thông tin cho trình biên dịch, công cụ phát
triển, hoặc các framework trong quá trình chạy ứng dụng.

Cách tạo Annotation:

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Annotation sẽ được giữ lại trong thời gian chạy
@Target(ElementType.METHOD) // Annotation này có thể áp dụng cho phương thức
public @interface MyAnnotation {
    String value() default "default value"; // Một thuộc tính của annotation với giá trị mặc định
}
```

Sử dụng Annotation:

```java
public class MyClass {
    @MyAnnotation(value = "custom value")
    public void myMethod() {
    }
}
```

Các loại Annotation phổ biến:

1. **Built-in Annotations**: Java cung cấp một số annotation tích hợp sẵn như `@Override`, `@Deprecated`, và
   `@SuppressWarnings`.
2. **Custom Annotations**: Bạn có thể tạo các annotation tùy chỉnh như ví dụ ở trên.
3. **Meta-Annotations**: Các annotation được sử dụng để chú thích các annotation khác, như `@Retention`, `@Target`,
   `@Documented`, và `@Inherited`.

# Ý nghĩa của 2 annotation `@Override` và `@Deprecated`

1. `@Override`:
    - Ý nghĩa: Annotation này được sử dụng để chỉ định rằng một phương thức trong lớp con đang ghi đè (override) một
    phương thức trong lớp cha. Nó giúp trình biên dịch kiểm tra xem phương thức có thực sự ghi đè đúng cách hay không.
    - Lợi ích: Nếu phương thức không ghi đè đúng cách (ví dụ: do sai tên hoặc sai kiểu tham số), trình biên dịch sẽ báo
    lỗi, giúp tránh các lỗi tiềm ẩn trong mã nguồn.
    - Ví dụ:
    ```java
    class Parent {
     void display() {
         System.out.println("Parent display");
     }
    }
    
    class Child extends Parent {
     @Override
     void display() { // Ghi đè phương thức của lớp cha
         System.out.println("Child display");
     }
    }
    ```
2. `@Deprecated`:
    - Ý nghĩa: Annotation này được sử dụng để đánh dấu một phần của mã nguồn (phương thức, lớp, hoặc trường) là lỗi
      thời và không nên sử dụng nữa. Nó thường được sử dụng khi có một phiên bản mới hơn hoặc tốt hơn của phần mã
      đó.
    - Lợi ích: Khi một phần mã được đánh dấu là `@Deprecated`, trình biên dịch sẽ cảnh báo người dùng khi họ cố gắng
      sử dụng phần mã đó, giúp họ biết rằng nên tìm kiếm giải pháp thay thế.
    - Ví dụ:
   ```java
   class MyClass {
       @Deprecated
       void oldMethod() {
           System.out.println("This method is deprecated"); 
         }
         void newMethod() {
             System.out.println("This method is the preferred one");
         }
     }
     ```
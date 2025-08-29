# Generic là gì
Generics là một tính năng trong lập trình hướng đối tượng, đặc biệt phổ biến trong các ngôn ngữ như Java, C#, và C++. Generics cho phép bạn định nghĩa các lớp, giao diện, và phương thức với các tham số kiểu (type parameters), giúp bạn tạo ra các cấu trúc dữ liệu và thuật toán mà có thể hoạt động với nhiều loại dữ liệu khác nhau mà không cần phải viết lại mã cho từng loại cụ thể.

## Lợi ích của Generics
1. **Kiểm tra kiểu tại thời gian biên dịch**: Generics giúp phát hiện lỗi kiểu sớm hơn trong quá trình biên dịch thay vì khi chạy chương trình, giảm thiểu lỗi thời gian chạy.
2. **Loại bỏ việc ép kiểu (casting)**: Khi sử dụng Generics, bạn không cần phải ép kiểu khi lấy dữ liệu từ các cấu trúc dữ liệu như danh sách hay bản đồ.
3. **Tái sử dụng mã**: Bạn có thể viết mã một lần và sử dụng nó với nhiều loại dữ liệu khác nhau, giúp giảm thiểu sự trùng lặp mã.
4. **Dễ dàng bảo trì**: Mã sử dụng Generics thường dễ đọc và bảo trì hơn vì nó rõ ràng về loại dữ liệu mà nó làm việc.
5. **Hạn chế lỗi thời gian chạy**: Bằng cách sử dụng Generics, bạn có thể tránh các lỗi liên quan đến kiểu dữ liệu không mong muốn trong quá trình chạy chương trình.

## Ví dụ về Generics trong Java
```java
import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println("Box contains: " + intBox.getItem());
        
        Box<String> strBox = new Box<>();
        strBox.setItem("Hello Generics");
        System.out.println("Box contains: " + strBox.getItem());
    }
}
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
```

## Wildcards trong Generics
Wildcards là một tính năng trong Generics cho phép bạn sử dụng các tham số kiểu không xác định. Có ba loại wildcards chính:
1. **Unbounded Wildcard (`<?>`)**: Đại diện cho bất kỳ kiểu nào.
   ```java
   List<?> list = new ArrayList<String>();
   ```
2. **Upper Bounded Wildcard (`<? extends T>`)**: Đại diện cho kiểu T hoặc bất kỳ kiểu con nào của T.
   ```java
   List<? extends Number> list = new ArrayList<Integer>(); // Type Integer, Double, Float đều hợp lệ
   ```
3. **Lower Bounded Wildcard (`<? super T>`)**: Đại diện cho kiểu T hoặc bất kỳ kiểu cha nào của T.
   ```java
   List<? super Integer> list = new ArrayList<Number>(); // Type Number, Object đều hợp lệ
   ```
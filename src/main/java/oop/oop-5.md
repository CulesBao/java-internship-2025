# Interface là gì?

Interface (giao diện) trong lập trình hướng đối tượng (OOP) là một tập hợp các phương thức trừu tượng mà một lớp có thể triển khai. Interface định nghĩa các hành vi mà một lớp phải thực hiện mà không cung cấp bất kỳ cài đặt cụ thể nào cho các phương thức đó. Điều này cho phép các lớp khác nhau có thể chia sẻ cùng một giao diện mà không cần phải kế thừa từ cùng một lớp cha.

## Đặc điểm của Interface
- **Phương thức trừu tượng**: Tất cả các phương thức trong một interface đều là trừu tượng (không có thân phương thức) và mặc định là public.
- **Không có biến thể hiện**: Interface không thể chứa biến thể hiện (instance variables), nhưng có thể chứa hằng số (static final variables).
- **Kế thừa đa kế**: Một lớp có thể triển khai nhiều interface, giúp vượt qua hạn chế của việc kế thừa đơn trong Java.
- **Không có khởi tạo**: Interface không thể được khởi tạo trực tiếp, mà phải được triển khai bởi một lớp cụ thể.
- **Từ khóa `implements`**: Lớp sử dụng từ khóa `implements` để triển khai một hoặc nhiều interface.

## Ví dụ về Interface trong Java

```java
interface printable{
    void print();
}
interface printable2{
    void show();
}
public class Temp implements printable, printable2 {
    public static void main(String[] args) {
        Temp t = new Temp();
        t.print();
        t.show();
    }

    @Override
    public void print() {
        System.out.println("Hello World");
    }

    @Override
    public void show() {
        System.out.println("Another Hello World");
    }
}
```
# Từ khóa Instanceof trong Java
Trong Java, từ khóa `instanceof` được sử dụng để kiểm tra xem một đối tượng có phải là một thể hiện (instance) của một lớp cụ thể hoặc một lớp con của nó hay không. Đây là một toán tử nhị phân, có nghĩa là nó hoạt động trên hai toán hạng: một đối tượng và một kiểu dữ liệu.
# Mục đích sử dụng
- Kiểm tra kiểu đối tượng trước khi thực hiện ép kiểu (casting).
- Đảm bảo an toàn khi làm việc với các đối tượng trong các cấu trúc dữ liệu phức tạp như danh sách, tập hợp, v.v.
# Cú pháp
```java
object instanceof ClassName
```
- `object`: Đối tượng cần kiểm tra.
- `ClassName`: Tên của lớp hoặc giao diện mà bạn muốn kiểm tra.
# Ví dụ
```java
class Animal {}
class Dog extends Animal {}
public class InstanceofExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();

        if (myDog instanceof Dog) {
            System.out.println("myDog is an instance of Dog");
        }

        if (myDog instanceof Animal) {
            System.out.println("myDog is an instance of Animal");
        }
    }
}
```
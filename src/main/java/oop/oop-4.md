# Abstract class là gì?

Abstract class (lớp trừu tượng) là một khái niệm trong lập trình hướng đối tượng (OOP) dùng để định nghĩa một lớp mà không thể tạo đối tượng trực tiếp từ nó. Thay vào đó, abstract class được sử dụng làm khuôn mẫu cho các lớp con (subclass) kế thừa và triển khai các phương thức trừu tượng (abstract methods) mà nó định nghĩa.
## Đặc điểm của Abstract Class
1. **Không thể tạo đối tượng trực tiếp**: Bạn không thể tạo một instance từ một abstract class
2. **Có thể chứa phương thức trừu tượng**: Abstract class có thể chứa các phương thức trừu tượng (không có phần thân) mà các lớp con phải triển khai.
3. **Có thể chứa phương thức cụ thể**: Ngoài các phương thức trừu tượng, abstract class cũng có thể chứa các phương thức cụ thể (có phần thân) mà các lớp con có thể sử dụng hoặc ghi đè (override).
4. **Có thể chứa thuộc tính**: Abstract class có thể chứa các thuộc tính (fields) giống như các lớp thông thường.
5. **Kế thừa**: Một lớp con có thể kế thừa chỉ từ một abstract class duy nhất (trong Java), nhưng có thể triển khai nhiều giao diện (interfaces).
## Khi nào sử dụng Abstract Class?
- Khi bạn muốn định nghĩa một khung chung cho các lớp con mà không muốn cho phép việc tạo đối tượng từ lớp cha.
- Khi bạn có một số phương thức chung mà các lớp con có thể sử dụng hoặc ghi đè.
- Khi bạn muốn đảm bảo rằng tất cả các lớp con phải triển khai một số phương thức cụ thể.
## Ví dụ về Abstract Class trong Java
```java
abstract class Animal {
    abstract void makeSound();

    void eat() {
        System.out.println("This animal is eating.");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}
```
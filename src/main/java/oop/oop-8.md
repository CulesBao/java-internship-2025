# Tại sao Java không cho phép đa kế thừa
Xem xét ví dụ sau đây, ví dụ này bị lỗi cú pháp trong Java:
```java
abstract class A {
    void foo() {
        System.out.println("Foo của A");
    }
}
abstract class B {
    void foo() {
        System.out.println("Foo của B");
    }
}
class C extends A, B { // Lỗi cú pháp
    public static void main(String[] args) {
        C obj = new C();
        obj.foo(); // Foo của A hay Foo của B?
    }
}
```
Trong ví dụ trên, lớp `C` kế thừa từ cả hai lớp `A` và `B`, và cả hai lớp này đều có phương thức `foo()`. Khi gọi `obj.foo()`, trình biên dịch không thể xác định được nên gọi phương thức `foo()` của lớp nào, dẫn đến sự mơ hồ (ambiguity).

Để tránh sự mơ hồ này, Java không cho phép đa kế thừa giữa các lớp. Thay vào đó, Java sử dụng giao diện (interface) để cung cấp khả năng đa kế thừa về kiểu dữ liệu mà không gặp phải vấn đề về sự mơ hồ.
```java
interface A {
    void foo();
}
interface B {
    void foo();
}
class C implements A, B {
    public void foo() {
        System.out.println("Foo của C");
    }
    public static void main(String[] args) {
        C obj = new C();
        obj.foo(); // Foo của C
    }
}
```
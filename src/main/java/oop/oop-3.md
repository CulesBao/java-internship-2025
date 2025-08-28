# Kế thừa là gì?

Kế thừa (Inheritance) là một trong những tính năng quan trọng nhất của lập trình hướng đối tượng (OOP). Nó cho phép một lớp (class) mới kế thừa các thuộc tính và phương thức từ một lớp hiện có, giúp tái sử dụng mã nguồn và tạo ra các cấu trúc phân cấp giữa các lớp.
- Lớp cha (Base class): Lớp mà các lớp khác kế thừa từ nó.
- Lớp con (Derived class): Lớp kế thừa từ lớp cha.

## Ví dụ về kế thừa trong Java

```java
// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}
```
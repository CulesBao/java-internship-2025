# Class là gì, Object là gì? Giải thích mối quan hệ giữa chúng.

Trong lập trình hướng đối tượng (OOP), "Class" và "Object" là hai khái niệm cơ bản và quan trọng.
- **Class (Lớp)**: Class là một khuôn mẫu hoặc bản thiết kế để tạo ra các đối tượng. Nó định nghĩa các thuộc tính (properties) và phương thức (methods) mà các đối tượng của lớp đó sẽ có. Class giống như một bản vẽ kỹ thuật, mô tả cấu trúc và hành vi của các đối tượng.
- **Object (Đối tượng)**: Object là một thể hiện cụ thể của một class. Khi bạn tạo một object từ một class, bạn đang tạo ra một thực thể cụ thể với các giá trị cụ thể cho các thuộc tính được định nghĩa trong class. Mỗi object có thể có trạng thái và hành vi riêng, dựa trên class mà nó được tạo ra.

Nói cách khác, class được ví như là một bản thiết kế, còn object là ngôi nhà được xây dựng dựa trên bản thiết kế đó.

Ví dụ sau đây minh họa mối quan hệ giữa class và object:

```java
class Car {
    // Attributes (fields) of the class
    private String color;
    private String model;
    private int year;

    // Constructor to initialize the object
    Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
    }
    void run() {
        System.out.println("The car is running.");
    }
}
public class Main {
    public static void main(String[] args) {
        // This is how we create objects from the Car class
        Car car1 = new Car("Red", "Toyota", 2020);
        Car car2 = new Car("Blue", "Honda", 2019);

        // Running methods on the objects
        car1.displayDetails();
        car2.displayDetails();
        car1.run();
        car2.run();
    }
}
```
# Hướng đối tượng là gì
Hướng đối tượng (Object-Oriented Programming - OOP) là một phương pháp lập trình dựa trên khái niệm "đối tượng" (object), nơi dữ liệu và các phương thức (hàm) được đóng gói lại với nhau. Mục tiêu của OOP là tạo ra các chương trình dễ bảo trì, mở rộng và tái sử dụng.

Ví dụ sau minh họa cách tạo một lớp (class) và một đối tượng (object) trong Java:

```java
// Define a class named Car
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
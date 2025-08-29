# Từ khoá `static` trong Java

Từ khoá `static` dùng để khai báo thành phần (biến, phương thức, block, class lồng) là thành phần tĩnh của class, không phụ thuộc vào đối tượng cụ thể.

## 1. Tác dụng của `static`
- **Static field (biến tĩnh):** Biến dùng chung cho tất cả các đối tượng của class, chỉ có một bản sao duy nhất.
- **Static method (phương thức tĩnh):** Phương thức có thể gọi mà không cần tạo đối tượng, chỉ truy cập được các thành phần static khác.
- **Static block:** Khối lệnh tĩnh, chạy một lần khi class được nạp vào bộ nhớ.
- **Static class (class lồng tĩnh):** Class lồng bên trong class khác, chỉ truy cập được các thành phần static của class bên ngoài.

## 2. Ví dụ minh hoạ
```java
class Example {
    static int count = 0; // Biến static
    int value;
    Example(int v) {
        value = v;
        count++;
    }
    static void printCount() { // Phương thức static
        System.out.println(count);
    }
    void printValue() { // Phương thức non-static
        System.out.println(value);
    }
}
```

## 3. Tại sao static method không truy cập được non-static method?
- **Static method** không gắn với bất kỳ đối tượng nào, chỉ thuộc về class.
- **Non-static method** cần đối tượng cụ thể để thực thi (vì có thể truy cập field non-static).
- Do đó, trong static method, không thể truy cập trực tiếp non-static method hoặc field, vì không có đối tượng cụ thể để tham chiếu.

Ví dụ lỗi:
```java
class Example {
    void show() {
        System.out.println("Hello");
    }
    static void test() {
        show(); // Lỗi: Không thể gọi non-static method từ static method
    }
}
```

Muốn gọi non-static method từ static method, cần tạo đối tượng:
```java
static void test() {
    Example e = new Example();
    e.show(); // Đúng
}
```

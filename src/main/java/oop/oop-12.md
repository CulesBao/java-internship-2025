# Từ khoá `final` trong Java

Từ khoá `final` dùng để giới hạn khả năng thay đổi hoặc kế thừa của các thành phần trong Java. Dưới đây là tác dụng của `final` khi áp dụng lên từng đối tượng:

## 1. Biến (Local Variable)
Khi khai báo biến với `final`, giá trị của biến đó không thể thay đổi sau khi đã gán lần đầu tiên.

```java
final int x = 10;
x = 20; // Lỗi: Không thể gán lại giá trị cho biến final
```

## 2. Field (Thuộc tính của class)
Field được khai báo với `final` chỉ được gán giá trị một lần (thường là khi khai báo hoặc trong constructor). Sau đó, giá trị không thể thay đổi.

```java
class Example {
    final int value;
    Example(int v) {
        value = v; // Chỉ gán được một lần
    }
    void setValue(int v) {
        value = v; // Lỗi: Không thể gán lại
    }
}
```

## 3. Parameter của hàm
Tham số truyền vào hàm nếu khai báo là `final` thì không thể thay đổi giá trị bên trong hàm.

```java
void doSomething(final int a) {
    a = 5; // Lỗi: Không thể gán lại giá trị cho tham số final
}
```

## 4. Method
Phương thức được khai báo với `final` thì không thể bị override (ghi đè) ở lớp con.

```java
class Parent {
    public final void show() {
        System.out.println("Hello");
    }
}
class Child extends Parent {
    public void show() { // Lỗi: Không thể override phương thức final
        System.out.println("Hi");
    }
}
```

## 5. Class
Lớp được khai báo với `final` thì không thể bị kế thừa.

```java
final class Animal {
    // ...
}
class Dog extends Animal { // Lỗi: Không thể kế thừa lớp final
    // ...
}
```
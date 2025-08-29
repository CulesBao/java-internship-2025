# Từ khoá `this` trong Java

Từ khoá `this` dùng để tham chiếu đến đối tượng hiện tại (đối tượng đang thực thi phương thức) trong class.

Các trường hợp sử dụng `this`:
## 1. Tham chiếu đến field hoặc method của đối tượng hiện tại
Khi tên biến tham số trùng với tên field của class, dùng `this` để phân biệt field với tham số.

```java
class Person {
    String name;
    Person(String name) {
        this.name = name; // this.name là field, name là tham số
    }
}
```

## 2. Truyền đối tượng hiện tại vào method hoặc constructor
Có thể dùng `this` để truyền chính đối tượng hiện tại vào method hoặc constructor khác.

```java
class Person {
    void print(Person p) {
        System.out.println(p.name);
    }
    void show() {
        print(this); // Truyền đối tượng hiện tại
    }
}
```

## 3. Gọi constructor khác trong cùng class
Dùng `this(...)` để gọi constructor khác trong cùng class (constructor chaining). Lệnh này phải nằm ở dòng đầu tiên trong constructor.

```java
class Person {
    String name;
    int age;
    Person(String name) {
        this(name, 0); // Gọi constructor khác
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```
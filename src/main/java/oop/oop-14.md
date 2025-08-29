# Từ khoá `super` trong Java

Từ khoá `super` dùng để tham chiếu đến lớp cha (superclass) của một lớp kế thừa.

## 1. Truy cập field hoặc method của lớp cha
Khi lớp con có field hoặc method trùng tên với lớp cha, dùng `super` để truy cập field/method của lớp cha.

```java
class Parent {
    int value = 10;
    void show() {
        System.out.println("Parent show");
    }
}
class Child extends Parent {
    int value = 20;
    void show() {
        System.out.println("Child show");
    }
    void print() {
        System.out.println(super.value); // In ra 10
        super.show(); // Gọi phương thức show của lớp cha
    }
}
```

## 2. Gọi constructor của lớp cha
Dùng `super(...)` trong constructor của lớp con để gọi constructor của lớp cha. Nếu lớp cha không có constructor mặc định (không tham số), bạn bắt buộc phải dùng `super(...)` để truyền tham số cho constructor lớp cha.

```java
class Parent {
    int value;
    Parent(int v) {
        value = v;
    }
}
class Child extends Parent {
    Child(int v) {
        super(v);
    }
}
```

## 3. Khi nào bắt buộc phải dùng `super`
- Khi lớp cha chỉ có constructor có tham số, lớp con phải gọi `super(...)` trong constructor để khởi tạo lớp cha.
- Khi muốn truy cập field/method bị che khuất (shadowed) bởi lớp con.

## 4. Lưu ý
- `super` chỉ dùng được trong lớp kế thừa (extends).
- `super()` phải là lệnh đầu tiên trong constructor lớp con nếu được sử dụng.
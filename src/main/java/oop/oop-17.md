# Solid principles

SOLID là một tập hợp các nguyên tắc thiết kế phần mềm nhằm giúp các nhà phát triển tạo ra các hệ thống dễ bảo trì, mở
rộng và hiểu rõ hơn. SOLID là viết tắt của năm nguyên tắc chính:

1. **Single Responsibility Principle (SRP)** - Nguyên tắc trách nhiệm đơn: Mỗi lớp nên có một và chỉ một lý do để thay
   đổi, nghĩa là mỗi lớp nên chỉ có một trách nhiệm duy nhất.
   Vi dụ:
    ```java
    class Invoice {
        private List<Item> items;   
        private Customer customer;
        public void addItem(Item item) {
            items.add(item);
        }
        public double calculateTotal() {
            return items.stream().mapToDouble(Item::getPrice).sum();
        }
        
        public void printInvoice() {
            // In hóa đơn
        }
    }
    ```
   Ở ví dụ trên, lớp `Invoice` có hai trách nhiệm: quản lý các mục và in hóa đơn. Để tuân theo SRP, chúng ta nên tách
   việc in hóa đơn ra thành một lớp riêng.
    ```java
    class InvoicePrinter {
        public void print(Invoice invoice) {
            // In hóa đơn
        }
    }
    ```
2. **Open/Closed Principle (OCP)** - Nguyên tắc mở/đóng: Các thực thể phần mềm (lớp, mô-đun, hàm, v.v.) nên được mở để
   mở rộng nhưng đóng để sửa đổi. Điều này có nghĩa là bạn nên có thể thêm chức năng mới mà không cần thay đổi mã hiện
   có.
   Ví dụ:
    ```java
    abstract class Shape {
        abstract double area();
    }
    class Circle extends Shape {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }
    class Rectangle extends Shape {
        private double width;
        private double height;
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        @Override
        double area() {
            return width * height;
        }
    }
    class AreaCalculator {
        public double calculateArea(List<Shape> shapes) {
            return shapes.stream().mapToDouble(Shape::area).sum();
        }
    }
    ```
   Ở ví dụ trên, nếu bạn muốn thêm một hình dạng mới, bạn chỉ cần tạo một lớp mới kế thừa từ `Shape` mà không cần thay
   đổi mã trong `AreaCalculator`.
3. **Liskov Substitution Principle (LSP)** - Nguyên tắc thay thế Liskov: Các đối tượng của một lớp con nên có thể thay
   thế các đối tượng của lớp cha mà không làm thay đổi tính đúng đắn của chương trình. Nói cách khác, nếu S là một kiểu
   con của T, thì các đối tượng của T có thể được thay thế bằng các đối tượng của S mà không làm thay đổi các thuộc tính
   mong muốn của chương trình.
   Ví dụ:
    ```java
    class Rectangle {
        protected int width;
        protected int height;
        public void setWidth(int width) {
            this.width = width;
        }
        public void setHeight(int height) {
            this.height = height;
        }
        public int getArea() {
            return width * height;
        }
    }
    class Square extends Rectangle {
        @Override
        public void setWidth(int width) {
            this.width = width;
            this.height = width;
        }
        @Override
        public void setHeight(int height) {
            this.height = height;
            this.width = height;
        }
    }
    ```
   Ở ví dụ trên, lớp `Square` không tuân theo LSP vì việc thay đổi chiều rộng hoặc chiều cao của một hình vuông sẽ ảnh
   hưởng đến cả hai thuộc tính, điều này không đúng với hành vi của lớp cha `Rectangle`.
4. **Interface Segregation Principle (ISP)** - Nguyên tắc phân tách giao diện: Các khách hàng không nên bị buộc phải phụ
   thuộc vào các giao diện mà họ không sử dụng. Thay vì có một giao diện lớn, nên chia nhỏ thành các giao diện cụ thể
   hơn.
   Ví dụ:
    ```java
    interface Worker {
        void work();
        void eat();
    }
    class HumanWorker implements Worker {
        @Override
        public void work() {
            // Làm việc
        }
        @Override
        public void eat() {
            // Ăn uống
        }
    }
    class RobotWorker implements Worker {
        @Override
        public void work() {
            // Làm việc
        }
        @Override
        public void eat() {
            // Robot không ăn
        }
    }
   ```
   Ở ví dụ trên, lớp `RobotWorker` bị buộc phải triển khai phương thức `eat()` mà nó không sử dụng. Để tuân theo ISP,
   chúng ta nên tách giao diện `Worker` thành hai giao diện riêng biệt:
    ```java
    interface Workable {
        void work();
    }
    interface Eatable {
        void eat();
    }
    class HumanWorker implements Workable, Eatable {
        @Override
        public void work() {
            // Làm việc
        }
        @Override
        public void eat() {
            // Ăn uống
        }
    }
    class RobotWorker implements Workable {
        @Override
        public void work() {
            // Làm việc
        }
    }
    ```
5. **Dependency Inversion Principle (DIP)** - Nguyên tắc đảo ngược phụ thuộc: Các mô-đun cấp cao không nên phụ thuộc vào
   các mô-đun cấp thấp. Cả hai nên phụ thuộc vào các trừu tượng (giao diện hoặc lớp trừu tượng). Ngoài ra, các trừu
   tượng không nên phụ thuộc vào các chi tiết. Các chi tiết nên phụ thuộc vào các trừu tượng.
   Ví dụ:
    ```java
    class Light {
        public void turnOn() {
            // Bật đèn
        }
        public void turnOff() {
            // Tắt đèn
        }
    }
    class Switch {
        private Light light;
        public Switch(Light light) {
            this.light = light;
        }
        public void operate() {
            // Điều khiển đèn
            light.turnOn();
        }
    }
    ```
   Ở ví dụ trên, lớp `Switch` phụ thuộc trực tiếp vào lớp `Light`. Để tuân theo DIP, chúng ta nên sử dụng một giao diện
   trừu tượng:
    ```java
    interface Switchable {
        void turnOn();
        void turnOff();
    }
    class Light implements Switchable {
        @Override
        public void turnOn() {
            // Bật đèn
        }
        @Override
        public void turnOff() {
            // Tắt đèn
        }
    }
    class Fan implements Switchable {
        @Override
        public void turnOn() {
            // Bật quạt
        }
        @Override
        public void turnOff() {
            // Tắt quạt
        }
    }
    class Switch {
        private Switchable device;
        public Switch(Switchable device) {
            this.device = device;
        }
        public void operate() {
            // Điều khiển thiết bị
            device.turnOn();
        }
    }
    ```
   Bây giờ, lớp `Switch` phụ thuộc vào giao diện `Switchable`, cho phép nó làm việc với bất kỳ thiết bị nào triển khai
   giao diện này, không chỉ riêng `Light`.
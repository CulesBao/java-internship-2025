# Try-catch và try-with-resources trong Java
Trong Java, việc xử lý ngoại lệ (exception handling) là một phần quan trọng để đảm bảo chương trình hoạt động ổn định và không bị gián đoạn khi gặp lỗi. Hai cấu trúc phổ biến để xử lý ngoại lệ trong Java là `try-catch` và `try-with-resources`.
## 1. Try-Catch-Finally
Cấu trúc `try-catch` được sử dụng để bao quanh mã có thể xảy ra ngoại lệ. Nếu một ngoại lệ xảy ra trong khối `try`, nó sẽ được bắt bởi khối `catch` tương ứng. Khối `finally` (nếu có) sẽ luôn được thực thi sau khối `try` và `catch`, bất kể có ngoại lệ hay không.

```java
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
```
Trong ví dụ trên, khi thực hiện phép chia cho 0, một `ArithmeticException` sẽ được ném ra và bắt bởi khối `catch`, sau đó thông báo lỗi sẽ được in ra. Khối `finally` sẽ luôn được thực thi cuối cùng.
## 2. Try-With-Resources
Vấn đề: Khi làm việc với các tài nguyên như file, kết nối mạng, hoặc cơ sở dữ liệu, bạn cần đảm bảo rằng các tài nguyên này được đóng đúng cách để tránh rò rỉ tài nguyên. Trước Java 7, bạn phải đóng tài nguyên trong khối `finally`, điều này có thể dẫn đến mã phức tạp và dễ bị lỗi.
```java
BufferedReader reader = null;
try {
    reader = new BufferedReader(new FileReader("data.txt"));
    String line = reader.readLine(); 
    System.out.println(line);
} finally {
    if (reader != null) {
        reader.close(); 
    }
}
```
Nếu `readLine()` ném exception (ví dụ `FileNotFoundException`) và `close()` cũng ném exception (ví dụ `IOException: Broken pipe`), thì exception từ `close()` sẽ che mất exception quan trọng trong `try`.
Kết quả, bạn mất đi thông tin quan trọng về lỗi thật sự xảy ra khi đọc file → gọi là exception masking.

Giải pháp: Từ Java 7, bạn có thể sử dụng cấu trúc `try-with-resources` để tự động đóng tài nguyên. Bất kỳ tài nguyên nào được khai báo trong dấu ngoặc đơn của `try` sẽ tự động được đóng khi khối `try` kết thúc, bất kể có ngoại lệ hay không.
```java
try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
    String line = reader.readLine();
    System.out.println(line);
}
```
Trong ví dụ trên, `BufferedReader` sẽ tự động được đóng sau khi khối `try` kết thúc, ngay cả khi có ngoại lệ xảy ra trong quá trình đọc file. Điều này giúp mã trở nên sạch sẽ và dễ quản lý hơn.
## Ý nghĩa của việc sử dụng try-with-resources
1. **Tự động đóng tài nguyên**: Giảm thiểu rủi ro rò rỉ tài nguyên bằng cách đảm bảo rằng tất cả các tài nguyên được đóng đúng cách.
2. **Mã sạch hơn**: Giảm bớt mã boilerplate (mã lặp lại) và làm cho mã dễ đọc hơn.
3. **Quản lý ngoại lệ tốt hơn**: Giúp tránh việc che mất ngoại lệ quan trọng khi đóng tài nguyên.
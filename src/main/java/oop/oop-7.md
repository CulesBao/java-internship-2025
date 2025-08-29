# Ưu điểm của Class so với Abstract class và Interface
- Class có thể khởi tạo đối tượng trực tiếp, trong khi Abstract class và Interface không thể.
- Class có constructor để khởi tạo các biến thành viên, trong khi Abstract class và Interface không có constructor.
- Thuộc tính và phương thức trong class có thể được đánh dấu final, trong khi trong Interface, tất cả các phương thức mặc định là trừu tượng và không thể đánh dấu final.

# Ưu điểm của Abstract class so với Class và Interface
- Abstract class có thể chứa cả phương thức trừu tượng và phương thức đã được triển khai, trong khi Interface chỉ chứa phương thức trừu tượng (trừ khi sử dụng default methods), còn Class thì không thể có phương thức trừu tượng.
- Abstract class có thể có biến thành viên với các mức độ truy cập khác nhau (private, protected, public), trong khi Interface chỉ có biến hằng (constant) với mức độ truy cập public static final.

# Ưu điểm của Interface so với Class và Abstract class
- Interface hỗ trợ đa kế thừa, cho phép một lớp triển khai nhiều interface, trong khi Java không hỗ trợ đa kế thừa cho các lớp (class).
- Interface giúp tách rời định nghĩa hành vi (behavior) khỏi việc triển khai, giúp tăng tính linh hoạt và khả năng mở rộng của mã nguồn.
- Interface có thể được sử dụng để định nghĩa các hợp đồng (contract) giữa các lớp khác nhau, giúp đảm bảo rằng các lớp tuân thủ các quy tắc nhất định.
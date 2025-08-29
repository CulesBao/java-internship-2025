# Anonymous class trong Java
Anonymous class (lớp vô danh) trong Java là một lớp không có tên được định nghĩa và khởi tạo trong cùng một biểu thức. Chúng thường được sử dụng để tạo các đối tượng từ các lớp trừu tượng hoặc giao diện mà không cần phải tạo một lớp con riêng biệt.

Có một số đặc điểm chính của anonymous class:
1. **Không có tên**: Anonymous class không có tên, vì vậy bạn không thể tham chiếu đến nó bằng tên.
2. **Được định nghĩa trong biểu thức**: Anonymous class được định nghĩa và khởi tạo trong cùng một biểu thức, thường là khi bạn cần tạo một đối tượng ngay lập tức.
3. **Kế thừa hoặc triển khai**: Anonymous class thường kế thừa từ một lớp cụ thể hoặc triển khai một giao diện.
4. **Có thể truy cập biến ngoài**: Anonymous class có thể truy cập các biến từ phạm vi bên ngoài, nhưng các biến này phải được khai báo là final hoặc effectively final (không thay đổi sau khi khởi tạo).

Anonymous class thường được sử dụng dưới 3 hình thức:
1. **Local class**: Được định nghĩa bên trong một lớp khác.
```java
abstract class Person{
    abstract void eat();
}
public class TestAnonymousInner{
    public static void main(String args[]){
        Person p=new Person(){
            void eat(){System.out.println("nice fruits");}
        };
        p.eat();
    }
}
```
Decode sau khi biên dịch:
```java
static class TestAnonymousInner$1 extends Person
{
    TestAnonymousInner$1(){}
    void eat()
    {
        System.out.println("nice fruits");
    }
}
```
2. **Inner class**: Được định nghĩa bên trong một phương thức.
```java
public class localInner1{
    private int data=30;//instance variable
    
    public static void main(String args[]){
        localInner1 obj=new localInner1();
        obj.display();
    }
    
    void display(){
        class Local{
            void msg(){System.out.println(data);}
        }
        Local l=new Local();
        l.msg();
    }
}
```
3. **Interface**: Được sử dụng để triển khai một giao diện.
```java
interface Eatable{
    void eat();
}
class TestAnnonymousInner1{
    public static void main(String args[]){
         Eatable e=new Eatable(){
          public void eat(){
              System.out.println("nice fruits");}
          };
         e.eat();
     }
}
```

## Ưu điểm
Thay vì sử dụng extends class, Anonymous Class có ưu điểm riêng. Trong các trường hợp trên, lớp Anonymous được viết ngay trong method của class khác, sử dụng ngay lúc định nghĩa xong. Do vậy nên sử dụng Anonymous Class khi đối tượng chỉ được dùng một lần.

Thêm nữa Anonymous phù hợp trong trường hợp cần tạo đối tượng con, trong đó method viết lại từ lớp cha là ít, và đơn giản. Lúc đó code sẽ đơn giản hơn.
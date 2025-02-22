# Biến và hằng trong Java

## Tổng quan bài học
- Hiểu khái niệm, các cách khai báo và sử dụng hiệu quả biến và hằng.

## Nội dung bài học

### Mục lục
**1. Biến**

**2. Hằng**

**3. Tổng hợp những điểm cần nhớ**

**4. Bài tập**


## 1. Biến
- Biến: Tên định danh đại diện cho một vùng nhớ
- Biến: Giúp lưu trữ các giá trị có thể thay đổi

### Quy tắc đặt tên biến
![Example Image](../images/02_variable.png)

### Đặt tên biến hiệu quả
![Example Image](../images/02_naming_rule.png)

```java
// Ví dụ hợp lệ
int age = 25;
// Hợp lệ nhưng không khuyến khích
String first_name = "John"; 
String $salary = "5000";

// Ví dụ không hợp lệ
int 2days;    // Không được bắt đầu bằng số
int first-name; // Không được chứa ký tự "-"
```

### **Bảng Từ Khóa Trong Java**

| **Nhóm**                     | **Từ khóa**                                                                 |
|------------------------------|----------------------------------------------------------------------------|
| **Kiểu dữ liệu (Data Types)** | `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`      |
| **Điều kiện & Vòng lặp**      | `if`, `else`, `switch`, `case`, `default`, `while`, `do`, `for`, `break`, `continue` |
| **Xử lý ngoại lệ**            | `try`, `catch`, `finally`, `throw`, `throws`                              |
| **Lập trình hướng đối tượng** | `class`, `interface`, `extends`, `implements`, `this`, `super`            |
| **Truy cập & Phạm vi**        | `public`, `private`, `protected`, `static`, `final`, `abstract`, `synchronized`, `transient`, `volatile` |
| **Đa luồng (Concurrency)**    | `synchronized`, `volatile`                                                |
| **Gán giá trị & Tham chiếu**  | `new`, `return`, `instanceof`                                             |
| **Bộ nhớ & Garbage Collection** | `null`, `super`, `this`, `new`                                           |
| **Từ khóa đặc biệt**          | `import`, `package`, `native`, `strictfp`, `assert`, `default`            |
| **Từ khóa bị loại bỏ**        | `goto`, `const` (Không sử dụng trong Java)                              |

## 2. Hằng
- Hằng là biến có giá trị không thể thay đổi sau khi gán
- Biểu diễn các giá trị cố định
- Giúp source code dễ đọc và bảo trì hơn

### Cách khai báo và sử dụng hằng
- `final`
- Tên hằng: Chuẩn UPPER_CASE

**Ví dụ:**
```java
final double PI = 3.14159;
final int MAX_USERS = 100;
```

### Lưu ý khi sử dụng hằng
- Khai báo hằng với `final`, gán giá trị ngay khi khai báo
- Đặt tên hằng theo chuẩn UPPER_CASE
- Không thể gán lại giá trị

## 3. Tổng hợp những điểm cần nhớ
![Example Image](../images/02_summary.png)

---

## 4. Bài tập

### 4.1. Bài tập trắc nghiệm
1. Tên biến nào dưới đây là không hợp lệ?
   - a. `age`
   - b. `2days`
   - c. `_salary`
   - d. `$value`

### 4.2. Bài tập thực hành
1. Khai báo các biến để lưu trữ thông tin cá nhân (tên, tuổi, chiều cao).
2. Sử dụng từ khóa `final` để định nghĩa một hằng số đại diện cho số Pi.
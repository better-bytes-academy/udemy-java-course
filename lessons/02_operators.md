# Toán tử trong Java

## Tổng quan bài học
✅ Hiểu **các loại toán tử** trong Java và cách sử dụng  
✅ Biết cách **thực hiện phép toán số học, logic, gán giá trị, so sánh, tăng giảm, và điều kiện**

## Nội dung bài học

### Mục lục

**1. Giới thiệu chung**

**2. Các loại toán tử**

**3. Những thực hành tốt nhất**

**4. Tổng hợp những điểm cần nhớ**

**5. Bài tập**

## 1. Giới thiệu chung
- Toán tử: Các ký hiệu đặc biệt dùng để thực hiện **các phép toán trên biến và giá trị**. 
- Toán tử: Giúp thực hiện các phép tính và xử lý dữ liệu linh hoạt 

## 2. Các loại toán tử
Có nhiều loại toán tử để thực hiện các phép toán số học, logic, gán giá trị, so sánh, tăng giảm, và điều kiện 

| **Loại toán tử**         | **Phép toán**                   | **Mô tả**                                  |
|--------------------------|-----------------------------|--------------------------------------------|
| **Toán tử số học**           | `+`, `-`, `*`, `/`, `%`    | Thực hiện các phép tính số học.            |
| **Toán tử gán**              | `=`, `+=`, `-=`, `*=`, `/=`, `%=`      | Gán giá trị cho biến.                      |
| **Toán tử so sánh**          | `==`, `!=`, `>`, `<`, `>=`, `<=`       | So sánh hai giá trị.                       |
| **Toán tử logic**            | `&&`, `\|\|`, `!`          | Thực hiện các phép logic (và, hoặc, phủ định). |
| **Toán tử tăng/giảm**        | `++`, `--`                 | Tăng hoặc giảm giá trị biến lên 1 đơn vị.  |
| **Toán tử điều kiện (Ternary)** | `condition ? value1 : value2` | Rút gọn `if-else` |

## 3. Những thực hành tốt nhất
### Toán tử số học 
- Chia số nguyên (`/`) sẽ **bỏ phần thập phân** 
- Dùng **ép kiểu** nếu muốn kết quả chính xác hơn.
```java
int a = 5, b = 2;
System.out.println(a / b); // ❌ Output: 2 (Không có phần thập phân)
System.out.println((double) a / b); // ✅ Output: 2.5
```
### Toán tử so sánh
- Chỉ nên dùng `==` để so sánh giá trị kiểu nguyên thủy (`int`, `double`, `char`...)
- Tránh bị nhầm `==` với `=`
- với biến boolean thì không cần so sánh tường minh với `true`, `false`
```java
boolean isStudent = true;
// ❌ Nhầm = với == 
// ❌ So sánh tường minh cho biến boolean
if (isStudent=false) {
}

// ✅ Biến boolean thì không cần so sánh tường minh
if (isStudent) {
}
```

### Toán tử gán
- **x += y;** tương đương **x = x + y;** nhưng ngắn gọn hơn.
- Khi dùng với kiểu dữ liệu nhỏ (`byte`, `short`), cần cẩn thận **ép kiểu không tường minh**.
- Java chỉ ép kiểu không tường minh với toán tử gán kết hợp (+=, -=, *=, /=, %=)
```java
byte x = 10;
// ✅ Hợp lệ - Java ngầm ép kiểu từ kiểu int về byte: x = (byte) (x + 5);
x += 5; 
// ❌ Lỗi biên dịch (do `x + 5` là int, không thể gán cho byte)
// ❌ x + 5 là phép toán giữa byte và int: Java tự động nâng cấp kiểu byte -> int
x = x + 5; 
```

### Toán tử logic
Toán tử `&&` và `||` có tính chất **short-circuiting** (nếu vế trái đã đủ quyết định kết quả, vế phải không được đánh giá).
```java
int x = 10;
if (x > 5 || checkCondition()) { 
    System.out.println("Điều kiện đúng!");
}

// Hàm này sẽ KHÔNG chạy nếu `x > 5` đã là true
boolean checkCondition() {
    System.out.println("Hàm này được gọi!");
    return true;
}
```

### Toán tử tăng/x++
- **x++ (hậu tố):** Trả về giá trị ban đầu, sau đó tăng.
- **++x (tiền tố):** Tăng giá trị trước, sau đó trả về giá trị mới.
```java
int x = 5;
System.out.println(x++); // Output: 5 (in trước, tăng sau)
System.out.println(++x); // Output: 7 (tăng trước, in sau)
```

### Toán tử điều kiện
Rút gọn if-else, nhưng tránh lạm dụng để không làm code khó đọc.
```java
// ❌ Lạm dụng toán tử điều kiến
String category = (age < 13) ? "Trẻ em" : (age < 18) ? "Thiếu niên" : "Người lớn";

// ✅ Cách tốt hơn
String category;
if (age < 13) {
    category = "Trẻ em";
} else if (age < 18) {
    category = "Thiếu niên";
} else {
    category = "Người lớn";
}
```

## 4. Tổng hợp những điểm cần nhớ
![Example Image](../images/02_operator-summary.png)


## 5. Bài tập

### 10 Câu hỏi trắc nghiệm
**Câu 1:** Kết quả của biểu thức `10 % 3` là gì?  
- A. `3`  
- B. `1`  
- C. `0`  
- D. `10`

**Câu 2:** Toán tử nào sau đây thuộc nhóm `toán tử số học` trong Java?**  
- A. `==`  
- B. `%`  
- C. `&&`  
- D. `++`

**Câu 3:** Giá trị của `x` sau đoạn code sau là bao nhiêu?  
```java
int x = 5;
x += 3;
```
- A. `5`
- B. `3`
- C. `8`
- D. `15`

**Câu 4:** Toán tử nào được sử dụng để `so sánh` xem hai giá trị có bằng nhau không?**  
- A. `=`  
- B. `==`  
- C. `!=`  
- D. `>=`

**Câu 5:** Toán tử logic `&&` trong Java có ý nghĩa gì?
- A. `Hoặc`
- B. `Và`
- C. `Phủ định`
- D. `So sánh`

**Câu 6:** Kết quả của đoạn code sau là gì?
```java
int x = 10;
x++;
System.out.println(x);
```
- A. `10`
- B. `11`
- C. `9`
- D. `Lỗi biên dịch`

**Câu 7:** Toán tử nào sau đây là toán tử điều kiện (ternary)?
- A. `&&`
- B. `?:`
- C. `+=`
- D. `!=`

**Câu 8:** Kết quả của đoạn code sau là gì?
- A. `3`
- B. `1`
- C. `3.5`
- D. `0`

**Câu 9:** Đoạn code sau in ra giá trị gì?
```java
boolean x = true;
boolean y = false;
System.out.println(x || y);
```
- A. `true`
- B. `false`
- C. `1`
- D. `Lỗi biên dịch`

**Câu 10:** Toán tử nào dưới đây không thuộc nhóm toán tử gán?
- A. `=`
- B. `+=`
- C. `*=`
- D. `>`


### Bài tập thực hành

**Bài 1** Giải thích sự khác biệt giữa toán tử = và == trong Java. Đưa ra ví dụ minh họa cho từng toán tử.
**Gợi ý:** Tập trung vào chức năng gán giá trị và so sánh.

**Bài 2:** Viết một chương trình Java sử dụng toán tử số học (+, -, *, /, %) để tính tổng, hiệu, tích, thương và phần dư của hai số nguyên bất kỳ. In kết quả ra màn hình.
**Gợi ý:** Có thể sử dụng hai biến cố định hoặc cho phép người dùng nhập từ bàn phím.

**Bài 3:** Phân tích đoạn code sau và giải thích kết quả đầu ra:
```java
int a = 5;
int b = a++ + --a;
System.out.println("a = " + a);
System.out.println("b = " + b);
```
**Gợi ý:** Chú ý thứ tự thực hiện của **toán tử tăng/giảm** (`++`, `--`).

**Bài 4:** Viết một chương trình Java sử dụng **toán tử điều kiện (ternary)** để kiểm tra một số nhập từ bàn phím là số chẵn hay lẻ. In kết quả dạng: "Số X là số [chẵn/lẻ]".
**Gợi ý:** Sử dụng Scanner để lấy đầu vào và toán tử % để kiểm tra chẵn/lẻ.

**Bài 5:** Viết một đoạn code Java sử dụng các **toán tử logic** (`&&`, `||`, `!`) để kiểm tra xem một số có nằm trong khoảng từ 10 đến 20 hay không. In ra kết quả dạng "true" hoặc "false".
**Gợi ý:** Dùng một biến số nguyên và kiểm tra điều kiện bằng cách kết hợp các toán tử logic.

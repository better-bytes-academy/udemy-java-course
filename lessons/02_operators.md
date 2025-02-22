# Toán tử trong Java

## Tổng quan bài học
✅ Hiểu **các loại toán tử** trong Java và cách sử dụng  
✅ Biết cách **thực hiện phép toán số học, logic, gán giá trị, so sánh, tăng giảm, và điều kiện**

## Nội dung bài học

### Mục lục

**1. Giới thiệu chung**

**2. Các loại toán tử**

**3. Tổng hợp những điểm cần nhớ**

**4. Bài tập**

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

## 3. Tổng hợp những điểm cần nhớ
![Example Image](../images/02_operator-summary.png)

---

## 4. Bài tập

### Bài tập trắc nghiệm
**Câu 1:** Kết quả của biểu thức `10 % 3` là gì?  
- A. `3`  
- B. `1`  
- C. `0`  
- D. `10`

**Câu 2:** Toán tử nào được sử dụng để so sánh hai giá trị trong Java?  
- A. `=`  
- B. `==`  
- C. `===`  
- D. `!=`

**Câu 3:** Giá trị của `x` sau đoạn code sau là bao nhiêu?  
```java
int x = 5;
x += 3;
```
- A. `5`
- B. `3`
- C. `8`
- D. `15`

### Bài tập thực hành

**Bài 1:** Viết chương trình với 2 biến int `a` và `b`, gán giá trị, sau đó in ra:  
- Tổng (`a + b`)  
- Hiệu (`a - b`)  
- Tích (`a * b`)  
- Thương (`a / b`)  
- Số dư (`a % b`)

**Bài 2:** Viết chương trình với 1 biến int `number`, gán giá trị, kiểm tra xem có lớn hơn 10 và là số chẵn không.

**Bài 3:** Viết chương trình với 1 biến `age` - tuổi của một người và kiểm tra xem họ có đủ tuổi bầu cử (>= 18 tuổi) hay không bằng toán tử `? :`
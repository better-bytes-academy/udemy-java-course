package lesson02;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class InOutSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner

        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt(); // Đọc số nguyên

        System.out.print("Nhập điểm trung bình: ");
        double score = scanner.nextDouble(); // Đọc số thực
        scanner.nextLine();

        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine(); // Đọc cả dòng

        System.out.println("Xin chào, " + name + "! Bạn " + age + " tuổi, điểm trung bình: " + score);

        scanner.close(); // Đóng Scanner để giải phóng tài nguyên

//        try {
//            // Tạo file log cho error
//            File errorLog = new File("error.log");
//            PrintStream errorStream = new PrintStream(errorLog);
//
//            // Chuyển hướng System.err vào file
//            System.setErr(errorStream);
//
//            // In ra console (stdout)
//            System.out.println("Đây là thông báo thông thường (System.out)");
//
//            // In lỗi ra file (stderr)
//            System.err.println("Đây là thông báo lỗi (System.err)");
//
//            // Đóng stream sau khi sử dụng
//            errorStream.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Không thể tạo file log: " + e.getMessage());
//        }
    }
}

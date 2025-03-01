package lesson02;

import java.util.Scanner;

public class InOutSample {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.println(" World");
        System.out.println("-----");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ten:");
        String name = scanner.nextLine();

        System.out.println("Nhap tuoi:");
        int age = scanner.nextInt();

        System.out.println("Nhap diem trung binh:");
        double score = scanner.nextDouble();

        System.out.println("Nhap dia chi:");
        scanner.nextLine();
        String address = scanner.nextLine();
        System.out.println(address);

        System.out.println("Ten: " + name + "; tuoi: " + age + "; Diem: " + score);
        System.out.printf("Ten: %s; Tuoi: %d; Diem: %f %n", name, age, score);
        System.out.printf("Ten: %-15s; Tuoi: %-10d; Diem: %-5.1f", name, age, score);
        scanner.close();
    }
}

package lesson02;

public class OperatorSample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        System.out.println(num1 + num2); // 13
        System.out.println(num1 - num2); // 7
        System.out.println(num1 * num2); // 30
        System.out.println(num1 / num2); // 3
        System.out.println((double)num1 / num2); // 3.33333
        System.out.println(num1 % num2); // 1

        int num3 = 3;
        System.out.println(num3 += 2); // 5
        System.out.println(num3 -= 2); // 3
        System.out.println(num3 *= 2); // 6
        System.out.println(num3 /= 2); // 3
        System.out.println(num3 %= 2); // 1

        int num4 = 4;
        int num5 = 5;
        System.out.println(num4 == num5); // false
        System.out.println(num4 != num5); // true
        System.out.println(num4 > num5); // false
        System.out.println(num4 < num5); // true

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1 && bool2); // false
        System.out.println(bool1 || bool2); // true
        System.out.println(!bool1); // false

        int num6 = 6;
        System.out.println(num6++); // 6
        System.out.println(num6); // 7
        System.out.println(++num6); // 8
        System.out.println(--num6); // 7

        System.out.println(bool2 ? "True" : "False");
    }
}

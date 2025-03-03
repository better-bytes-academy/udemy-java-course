package lesson02;

public class StringSample {
    public static void main(String[] args) {
        String myName = "Nguyen Van A";
        String myName1 = new String("Nguyen Van A");
        System.out.println(myName);
        System.out.println(myName1);

        System.out.println(myName.length()); //12
        System.out.println(myName.charAt(0)); // N
        System.out.println(myName.substring(0, 7)); // Nguyen
        System.out.println(myName.indexOf("Van")); // 7
        System.out.println(myName.replace("A", "An"));
        System.out.println(myName.toLowerCase()); // nguyen van a
        System.out.println(myName.toUpperCase()); // NGUYEN VAN A

        System.out.println(myName == myName1); // false
        System.out.println(myName.equals(myName1)); // true

        System.out.println("My name: " + myName);
        System.out.println("My name: ".concat(myName));
        StringBuilder builder = new StringBuilder("My name: ");
        builder.append(myName);

        System.out.println(builder.toString());

        System.out.println(String.valueOf(123));
        System.out.println(123 + "");

        System.out.println(myName.concat("123"));
        System.out.println(myName);

        String unicode = "こんにちは"; // Chuỗi tiếng Nhật - xin chào
        System.out.println(unicode); // Output: こんにちは

        System.out.println(" Java    ".trim());
    }
}

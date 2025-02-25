package lesson02;

public class DataTypesSample {
    public static void main(String[] args) {
        byte myByte = 127;
        short myShort = 10_000;
        int myInt = 10_000_000;
        long myLong = 10_000_000_000_000L;

        float myFloat = 3.123456789012345f;
        double myDouble = 3.123456789012345;

        System.out.println(myFloat);
        System.out.println(myDouble);

        char myChar = 'A';
        boolean myBoolean = true;

        double pi = 3.14;
        int intPi = (int) pi;
        System.out.println(intPi);

        byte byte1 = 127;
        byte1 += 1;
        System.out.println(byte1);

        short short1;
        //System.out.println(short1);
    }
}

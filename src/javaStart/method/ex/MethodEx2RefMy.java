package javaStart.method.ex;

// * 내가 푼 방식 -> 잘못됨 *

public class MethodEx2RefMy {
    public static void main(String[] args) {
        System.out.println(HW(3));
        System.out.println(HW(5));
        System.out.println(HW(7));
    }

    public static String HW(int a) {
        String message = "Hello World!";
        for (int i = 0; i < a; i++) {
            System.out.println(message);
        }
        return message;
    }
}

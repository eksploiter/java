package javaStart.loop.ex;

public class ForEx1 {
    public static void main(String[] args) {
        int count = 1;

        for (int i = 1; i <= 10; i++) {
            count += i;
            System.out.println(i);
        }
    }
}

// 김영한 쌤의 풀이
// public class ForEx1 {
//     public static void main(String[] args) {
//         for (int count = 1; count <= 10; count++) {
//             System.out.println(i);
//         }
//     }
// }

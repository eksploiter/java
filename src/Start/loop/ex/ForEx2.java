package Start.loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        int num = 2;

        for (int i = 1; i <= 10; i++) {
            System.out.println(num);
            num += 2;
        }
    }
}

// for 문 안에 한 번에 여러게 선언해도 된다.
// for (int num = 2, count = 1; count <= 10; num += 2, count++) {

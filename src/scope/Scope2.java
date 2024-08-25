// ㅣ렇게 변수의 접근 가능한 범위를 스코프(Scope)라 한다. 참고로 Scope 를 번역하면 범위라는 뜻이다.

package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) { //블록 내부, for 문 내
            System.out.println("for m = " + m); // 블록 외부에서 내부론ㄴ 접근 가능
            System.out.println("for i = " + i);
        } // i 생존 종료

        // System.out.println("main i = " + i); // 오류, i에 접근 불가
        System.out.println("main m = " + m);
    }
}

package javaStart.cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);
    }
}

// 실행 결과 분석
// String status = (age >= 18) ? "성인" : "미성년자"; // age = 18
// String status = (true) ? "성인" : "미성년자";      // 조건이 참이므로 참 표현식 부분이 선택된다.
// String status = "성인"                            // 결과

// 삼항연산자
// (조건) ? 참_표현식 : 거짓_표현식
// - 삼항 연산자는 항이 3개라는 뜻이다. 조건, 참_표현식, 거짓_표현식 이렇게 항이 3개이다.
// 자바에서 유일하게 항이 3개인 연산자라서 삼항 연산자라 한다. 특정 조건에 따라 결과가 나오기 때문에 조건 연산자라고도 한다.
// - 조건에 만족하면 참_표현식 이 실행되고, 조건에 만족하지 않으면 거짓_표현식 이 살행된다. 앞의 if, else 문과 유사하다.
// - if 문 처럼 코드 블럭을 넣을 수 있는 것이 아니라 단순한 표현식만 넣을 수 있다.

// 삼항 연산자 없이 if 문만 사용해도 된다. 하지만 단순히 참과 거짓에 따라서 특정 값을 구하는 삼항 연산자를 사용하면 if문 보다 간결한 코드를 작성할 수 있다.

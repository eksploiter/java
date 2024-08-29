// 배열의 선언과 생성
// 배열은 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것이다. 이전 예제를 배열을 사용하도록 변경해보자.
// 참고로 단계적으로 구조를 변경해 나갈 것이다.

package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int [] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성, int 형이 5개 있는

        // 변수 값 대입, 배열은 0번 부터 시작
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}

// 지금부터는 아주 간단해보이는 다음 두 줄을 아주 자세히 설명하겠다.
// int [] students; // 배열 변수 선언
// students = new int[5]; 배열 생성

// 1. 배열 변수 선언
// - 배열을 사용하려면 int[] students; 와 같이 배열 변수를 선언해야 한다.
// - 일반적인 변수와 차이점은 int[] 처럼 타입 다음음에 []가 들어간다는 점이다.
// - 배열 면수를 선언한다고해서 아직 사용할 수 있는 배열이 만들어진 것은 아니다!
//      - int a에는 정수를, double b에는 실수를 담을 수 있다.
//      - int[] students 와 깉은 배열 변수에는 배열을 담을 수 있다. (배열 변수에는 10, 20 같은 값이 아니라 배열이라는 것을 담을 수 있다.)

// 2. 배열 생성
// - 배열을 사용하려면 배열을 생성해야 한다.
// - new int[5]라고 입력하면 총 5개의 int 형 변수가 만들어진다.
// - new 는 새로 생성한다는 뜻이고, int[5]는 int 형 변수 5개라는 뜻이다. 따라서 int 형 변수 5개를 다룰 수 있는 배열을 새로 만든다는 뜻이다.
// - int student1, student2 ... student5 까지 총 5개의 변수를 직접 선언했다. 배열을 사용하면 이런 과정을 한 번에 깔끔하게 처리할 수 있다.

// 배열 초기화
// - new int [5]라고 하면 총 5개의 int 형 변수가 만들어진다. 자바는 배열을 생성할 때 그 내부값을 자동으로 초기화한다.
// - 숫자는 0, boolean 은 false, String 은 null(없다는 뜻이다.)로 초기화된다.

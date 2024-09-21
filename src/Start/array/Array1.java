// 배열 시작
// 배열이 필요한 이유
// 학생의 점수를 출력하는 간단한 프로그램을 작성해보자

package Start.array;

public class Array1 {
    public static void main(String[] args) {
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        System.out.println("학생1 점수: " + student1);
        System.out.println("학생2 점수: " + student2);
        System.out.println("학생3 점수: " + student3);
        System.out.println("학생4 점수: " + student4);
        System.out.println("학생5 점수: " + student5);
    }
}

// - 학생을 몇 명 더 추가해야 한다면 변수를 선언하는 부분과 점수를 출력하는 부분의 코드도 추가해야한다.
// 학생을 몇 명 더 추가하는 것은 개발자가 코딩으로 해결할 수 있겠지만,
// 학생을 수백 명 이상 추가해야 한다면 코드가 상당히 많이 늘어날 것이다.
// 결국 학생 수가 증가함에 따라 코딩 양이 비례해서 증가하는 문제가 발생한다.

// - 변수를 선언하는 부분을 보면 학생 수가 증가함에 따라 int 형 변수를 계속해서 추가해야한다.
// 학생 수가 5명이면 int 형 변수를 5개 선언해야하고, 학생 수가 100명이라면 int 형 변수를 100개 선언해야 한다.
// 결국 비슷한 변수를 반복해서 선언하는 문제가 발생한다.

// - 반복문으로 해결할 수 있을 것 같지만, 점수를 출력하는 부분을 보면 변수의 이름이 다르기 때문에 반복문도 적용할 수 없다.

// 이렇게 같은 타입의 변수를 반복해서 선언하고 반복해서 사용하는 문제를 해결하는 것이 바로 배열이다.

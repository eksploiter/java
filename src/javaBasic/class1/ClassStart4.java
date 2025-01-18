// 배열 도입 - 시작
// 클래스와 객체 덕분에 학생 데이터를 구조적으로 이해하기 쉽세 변경할 수 있다.
// 마치 실제 학생이 있고, 그 안에 각 학생의 정보가 있는 것 같다. 따라서 이해하기도 편리하다.
// 이제 각각의 학생 별로 객체를 생성하고, 해당 객체에 학생의 데이처를 관리하면 된다.

// 하지만 코드를 보면 아쉬운 부분이 있는데, 바로 학생을 출력하는 부분이다.
// System.out.println("이름:" + student1.name + " 나이:" + student1.age + ...);
// System.out.println("이름:" + student2.name + " 나이:" + student2.age + ...);
// 새로운 학생이 추가될 때 마다 출력하는 부분도 함께 추가해야 한다.

// 배열을 사용하면 특정 타입을 연속한 데이터 구조로 묶어서 편리하게 관리할 수 있다.
// Student 클래스를 사용한 변수들고 Student 타입이기 때문에 학생도 배열을 사용해서 하나의 데이터 구조로 묶어서 관리할 수 있다.

// Student 타입을 사용하는 배열을 도입하자.

package javaBasic.class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.score = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.score = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].score);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].score);
    }
}

// Students 클래스를 기반으로 student1, student2 인스턴스를 생성한다. 그리고 필요한 값을 채워둔다.

// 배열에 참조값 대입 이번에는 Student 를 담을 수 있는 배열을 생성하고, 해당 배열에 student1, student2 인스턴스를 보관하자.
// Student[] students = new Student[2];
// - Student 변수를 2개 보관할 수 있는 사이즈 2릐 배열을 만든다.
// - Student 타입의 변수는 Student 인스턴스의 참조값을 보관한다.
//   Student 배열의 각각의 항복도 Student 타입의 변수일 뿐이다. 따라서 Student 타입의 참조값을 보낸다.
// - 배열에는 아직 참조값을 대입하지 않았기 때문에 참조값이 없다는 의미의 null 값으로 초기화 된다.

// 이제 배열에 객체를 보관하자.
// students[0] = student1;
// students[1] = student2;

// **자바에서 대입은 항상 변수에 들어있는 값을 복사한다.**
// students[0] = x001;
// students[1] = x002;

// **자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.**
// - student1, student2 에는 참조값이 보관된어 있다. 따라서 이 참조값이 배열에 저장된다.
//   또는 student1, student2에 보관괸 참조값을 읽고 복사해서 배열에 대입한다고 표현한다.

// 주의!
// 변수에는 인스턴스 자체가 들어있는 것이 아니다!
// 인스턴스의 위치를 가리키는 참조값이 들어있는 것이다. 그래서 결국 접근할 수 있는 변수만 두개가 되는 것이다.
// 따라서 대입(=)시에 인스턴스가 복사되는 것이 아니라 참조값(변수에 들어있는 값)만 복사된다.

// 배열에 들어있는 객체 사용
// 배열에 들어있는 객체를 사용하려면 먼저 배열에 접근하고, 그 다음에 객체에 접근하면 된다.
// 이전에 설명한 그림과 코드를 보면 쉽게 이해가 된다.

// 학생1 예제
// System.out.println(students[0].name); // 배열 접근 시작
// System.out.println(x005[0].name); // [0]를 사용해서 x005 배열의 0번 요소에 접근
// System.out.println(x001.name); // .(dot)을 사용해서 참조값으로 접근
// System.out.println("학생1");

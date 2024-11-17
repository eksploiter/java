package javaBasic.class1;

public class ClassStart3 {
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

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.score);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.score);
    }
}

// 클래스와 사용자 정의 타입
// - 타입은 데이터의 종류나 형태를 나타낸다.
// - int 라고 하면 정수 타입, String 이라고 하면 문자 타입이다.
// - 학생(Student)이라는 타입을 만들면 되지 않을까?
// - 클래스를 사용하면 int, String 과 같은 타입을 직접 만들 수 있다.
// - 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하다. 이 설계도가 바로 클래스이다.
// - 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다.
// - 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.

// 용어: 클래스, 객체, 인스턴스
// 클래스는 설계도이고, 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다.
// 둘 다 같은 의미로 사용된다.
// 여기서는 학생(Student) 클래스 기반으로 학생1(student1), 학생2(student2) 객체 또는 인스턴스를 만들었다.

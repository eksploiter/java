///  메서드 객체 변환
// 조금 더 나아가보자. 다음 코드에도 중복이 있다.

/// Student student1 = new Student();
/// initStudent(Student1, "학생1", 15, 90);
/// Student student2 = new Student();
/// initStudent(Student2, "학생2", 16 80);
// 바로 객체를 생성하고, 코기 값을 설정하는 부분이다. 이렇게 2번 반복되는 부분을 하나로 합쳐보자.

package javaBasic.ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println("student1 의 참조값:" + student1);
        Student student2 = createStudent("학생2", 16, 80);
        System.out.println("student2 의 참조값:" + student2);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student(); // x001
        System.out.println("student 의 참조값:" + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // x001 -> Student student1으로 값을 보내준다
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " , 나이: " + student.age + " , 성적: " + student.grade);
    }
}

// createStudent()라는 메서드를 만들고 객체를 생성하는 부분도 이 메서드 안에 함께 포함했다.
// 이제 메서드 하나로 객체의 생성과 초기값 설정을 모두 처리한다.
// 그런데 메서드 안에서 객체를 생성했기 때문에 객체를 밖에서 사용할 수 있게 돌려주어야 한다.
// 그래야 메서드 밖에서 이 객체를 사용할 수 있다.
// 메서드는 호출 결과를 반환(return)을 할 수 있다.
// 메서드의 변환 기능을 사용해서 만들어진 객체의 참조값을 메서드 밖으로 반환하면 된다.

// 메서드 내부에서 인스턴스를 생성한 후에 참조값을 메서드 외부로 반환했다.
// 이 참조값만 있으면 해당 인스턴스에 접근할 수 있다. 여기서는 student1에 참조값을 보관하고 사용한다.

// 진행과정
// Student student1 = createStudent("학생1", 15, 90); // 메서드 호출 후 결과 반환
// Student student1 = student(x001); // 참조형인 student 를 반환
// Student student1 = x001; // student1의 참조값 복사 후 대입
// student1 = x001;

// createStudent()는 생성한 Student 인스턴스의 참조값을 반환한다. 이렇게 반환된 참조값을 student1 변수에 저장했다.
// 앞으로는 student1 을 통해 Student 인스턴스를 사용할 수 있다.

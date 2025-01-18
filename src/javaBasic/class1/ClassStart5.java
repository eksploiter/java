// 배열 도입 - 리팩토링
// 배열을 사용한 덕분에 출력에서 다음과 같이 for 문을 도입할 수 있게 되었다.

package javaBasic.class1;

public class ClassStart5 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.score = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.score = 80;

        Student[] students = new Student[]{student1, student2};
        // Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].score);
        }
//        for (int i = 0; i < students.length; i++) { // 너무 길어지므로
//            Student s = students[i];
//            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.score);
//        }
        for (Student s : students) { // 향상된 for 문 -> 단축키 iter
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.score);
        }
    }
}

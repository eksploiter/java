// static 변수2

package javaBasic.static1;

public class Data3 {
    public String name;
    public static int count; // static
    // 이렇게 멤버 변수에 static 을 붙이게 되면 static 변수, 정적 변수 또는 클래스 변수라 한다.
    // 객체가 생성되면 생성자에서 정적 변수 count 의 값을 하나 증가시킨다.

    public Data3(String name) {
        this.name = name;
        count++;
        // = Data3.count
    }
}

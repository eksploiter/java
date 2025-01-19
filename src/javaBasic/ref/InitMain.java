package javaBasic.ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
    }
}

// value1은 초기값을 지정하지 않았지만 멤버 변수는 자동으로 초기화 된다. 숫자는 0으로 초기화 된다.
// value2는 10으로 초기값을 지정해두었기 때문에 객체를 생성할 때 10으로 초기화 된다.

package javaBasic.oop1;

public class ValueObjectMain {

    public static void main(String[] args) {

        ValueObject vo = new ValueObject();
        vo.add();
        vo.add();
        vo.add();
        System.out.println("최종 숫자 = " + vo.value);
    }
}

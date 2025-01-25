// 정답

// 객체 지향은 객체한테 물어보는 것!
package javaBasic.oop1.ex;

public class RectangleOopMain {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 5;
        r.height = 8;

        int area = r.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = r.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = r.isSquare();
        System.out.println("장시긱형 여부: " + square);
    }
}

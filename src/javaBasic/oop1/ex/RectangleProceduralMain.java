// 문제와 풀이
// 문제1 - 절차 지향 직사각형 프로그램을 객체 지향으로 변경하기
// 다음은 직사각형의 넓이(Area), 둘레 길이(Perimeter), 정사각형 여부(square)를 구하는 프로그램이다.

// - 절차 지향 프로그래밍 방식으로 되어 있는 코드를 객체 지향 프로그래밍 방식으로 변경해라
// - Rectangle 클래스를 만들어라
// - RectangleOopMain 에 해당 클래스를 사용하는 main() 코드를 만들어라

// 절차 지향 코드
package javaBasic.oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;

        int area = calculateArea(width, height);
        System.out.println("넓이: " + area);

        int perimeter = calculatePerimeter(width, height);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = isSquare(width, height);
        System.out.println("정사각형 여부: " + square);
    }

    static int calculateArea(int width,int height)  {
        return width * height;
    }

    static int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    static boolean isSquare (int width, int height) {
        return width == height;
    }
}

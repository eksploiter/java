/// 멤버 변수와 null
// 앞선 예제와 같이 지역 변수의 경우에는 null 문제를 파악하는 것이 어렵지 않다.
// 다음과 같이 멤버 변수가 null 인 경우에는 주의가 필요하다.

package javaBasic.ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        // 예외를 없애고 싶다면
        bigData.data = new Data(); // 참조값 지정
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value);
        // 참조값(주소값)이ㅣ null 이므로 그 이상 갈 수 없다.
    }
}

/// 정리
// NullPointerException 이 발생하면 null 값에 .(dot)을 찍었다고 생각하면 문제를 쉽게 찾을 수 있다.

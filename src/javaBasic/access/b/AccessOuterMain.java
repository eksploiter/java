package javaBasic.access.b;

import javaBasic.access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        // 나머지는 안 된다.
        // 다른 패키지 default 호출 불가

        data.innerAccess();
    }
}

// 참고로 생성자도 접근 제어자 관점에서 메서드와 같다.

package javaBasic.pack;

import javaBasic.pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        javaBasic.pack.b.User userB = new javaBasic.pack.b.User();
        // 같은 클래스명의 import 인 경우 둘 중 하나면 임포트 가능
    }
}

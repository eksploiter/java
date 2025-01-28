// 패키지 - import
// 이전에 본 코드와 같이 패키지가 다르다고 pack.a.User 와 같이 항상 전체 경로를 적어주는 것은 불편하다.
// 이때는 import 를 사용하면 된다.

package javaBasic.pack;

// import javaBasic.pack.a.User;
import javaBasic.pack.a.*;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        User2 user2 = new User2();
    }
}

// 코드에서 첫줄에는 package 를 사용하고, 다음 줄에는 import 를 사용할 수 있다.
// import 를 사용하면 다른 패키지에 있는 클래스를 가져와서 사용할 수 있다.
// import 를 사용한 덕분에 코드에서는 패키지 명을 생략하고 클래스 이름만 적을 수 있다.
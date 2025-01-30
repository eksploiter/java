package javaBasic.static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count); // Data3? 클래스명에 직접 접근

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 이거 된다 -> 가봤는데 static? 그럼 정적
        // 권장하지 않는다 -> 이걸 보면 count 를 인스턴스 변수로 착각할 수 있게 만든다. (오해의 소지)
        // 가져다 사용하는 입장을 생각해야 한다.

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}

// static 이 붙은 멤버 변수는 메서드 영역에서 관리한다.
// - static 이 붙은 멤버 변수 count 는 인스턴스 영역에 생성되지 않는다. 대신에 메서드 영역에서 이 변수를 관리한다.

// 정리
// static 변수는 쉽게 이야기 해서 클래스인 붕어빵 틀이 특별히 관리하는 변수이다.
// 붕어빵 틀은 1개 이므로 클래스 변수도 하나만 존재한다.
// 반면에 인스턴스 변수는 붕어빵인 인스턴스 수 만큼 존재한다.
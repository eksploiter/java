package javaBasic.pack;

public class Data {
    public Data() {
        System.out.println("패키지 pack Data 생성");
    }
}

// 패키지를 사용하는 경우 항상 코드 첫줄에 package pack 과 같이 패키지 이름을 적어주어야 한다,
// 여기서는 pack 패키지에 Data 클래스를 만들었다.
// 이후에 Data 인스턴스가 생성되는 생성자를 통해 정보를 출력한다.
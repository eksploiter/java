// static 변수1

// 인스턴스 내부 변수에 카운트 저장
// 먼저 생성할 인스턴스 내부에 카운트를 저장하겠다.

package javaBasic.static1;

public class Data1 {
    public String name;
    public int count;

    public Data1(String name) {
        this.name = name;
        count++;
    }
}

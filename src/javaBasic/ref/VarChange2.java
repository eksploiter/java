// 다음 코드를 보고 어떤 결과가 나올지 먼저 생각해보자.
// 꼭 먼저 생각해보고 이후에 실행해서 정답을 맞춰보자.

package javaBasic.ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // 같은 주소를 가리킴

        System.out.println("dataA 참조값 = " + dataA); // 주소값을 나타냄
        System.out.println("dataB 참조값 = " + dataB); // 주소값을 나타냄
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // dataB 변경
        dataB.value = 30; // 참조값이 같은 곳을 가리키고, 인스턴스는 하나이므로 둘 다 30
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
    }
}

// 변수의 대입은 변수에 들어있는 값을 복사해서 대입한다.
// 변수 dataA 에는 참조값 x001 이 들어있다.
// 여기서 변수 dataA 에 들어있는 참조값 x001 을 복사해서 변수 dataB 에 대입한다.
// 참고로 변수 dataA가 가르키는 인스턴스를 복사하는 것이 아니다! 변수에 들어있는 참조값만 복사하는 것이다.
// 이제 dataA와 dataB에 들어있는 참조값은 같다. 따라서 둘 다 같은 x001 Data 인스턴스를 가리킨다.

// dataB.value = 30 코드를 실행하면 dataB가 가리키는 x001 인스턴스의 value 값을 20에서 30으로 변경한다.
/// 그런데 dataA와 dataB는 같은 x001 인스턴스를 참조하기 때문에 dataA.value 와 dataB.value 는 같은 값인 30을 출력한다.

// 여기서 핵심은 Data dataB = dataA 라고 했을 때 변수에 들어있는 값을 복사해서 사용한다는 점이다.
// 그런데 그 값이 참조값이다.
// 따라서 dataA와 dataB는 같은 참조값을 가지게 되고, 두 변수는 같은 객체 인스턴스를 참조하게 된다.

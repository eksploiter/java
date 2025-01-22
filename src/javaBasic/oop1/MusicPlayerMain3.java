// 절차 지향 프로그래밍3 - 메서드 추출
// 이 전의 코드를 보면 종복되는 부분들이 있다.

// 그리고 각각의 기능들은 이후에 재사용 될 가능성이 높다.
// - 음악 플레이어 켜기, 끄기
// - 볼륨 증가, 감소
// - 음악 플레이어 상태 출력

// 메서드를 사용해서 각각의 기능을 구분해보자.

// 절차 지향 음악 플레이어3 - 메서드 추출
package javaBasic.oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        on(data); // 음악 플레이어 켜기

        volumeUp(data); // 볼륨 증가

        volumeUp(data); // 볼륨 증가

        volumeDown(data); // 볼륨 감소

        showStatus(data); // 음악 플레이어 상태

        off(data); // 음악 플레이어 끄기
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}

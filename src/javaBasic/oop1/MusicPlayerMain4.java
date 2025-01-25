package javaBasic.oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();

        // 음악 플레이어 켜기
        mp.on();

        // 볼륨 증가
        mp.volumeUp();
        mp.volumeUp();

        // 볼륨 감소
        mp.volumeDown();

        // 음악 플레이어 상태
        mp.showStatus();

        // 음악 플레이어 끄기
        mp.off();
    }
}

// MusicPlayer 를 사용하는 코드를 보자.
// MusicPlayer 객체응 생성하고 필요한 기능(메서드)을 호출하기만 하면 된다. 필요한 모든 것은 MusicPlayer 안에 있다!
// - MusicPlayer 를 사용하는 입장에서는 MusicPlayer 의 데이터인 volume, isOn 같은 데이터는 전혀 사용하지 않는다.
// - MusicPlayer 를 사용하는 입장에서는 이제 MusicPlayer 내부에 어떤 속성(데이터)이 있는지 전혀 몰라도 된다.
// MusicPlayer 를 사용하는 입장에서는 단순하게 MusicPlayer 가 제공하는 기능 중에 필요한 기능을 호출해서 사용하기만 하면 된다.

/// 캡슐화
// MusicPlayer 를 보면 음악 플레이어를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것 같다.
// 이렇게 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화 라고 한다.

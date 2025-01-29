package javaBasic.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200;
        speaker.showVolume();
    }
}

// 좋은 프로그램은 무한한 자유도가 주어지는 프로그램이 아니라 적절한 제약을 제공하는 프로그램이다.

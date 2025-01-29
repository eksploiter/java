package javaBasic.access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // 검증 로직
        if (count >= max) {
            System.out.println("최댓값을 초과할 수 없습니다.");
            return;
        }
        // 실행 로직
        count++;
    }
    // if - else 방식도 가능하나 return 으로 날리는게 더 장점이 있다. -> 명확성

    public int getCount(){
        return count;
    }
}

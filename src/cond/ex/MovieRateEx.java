// 문제: "평점에 따른 영화 추천하기"
// 요청한 평점 이상의 영화를 찾아서 추천하는 프로그램을 작성하자.
// - 어바웃 타임 - 평점 9
// - 토이 스토리 - 평점 8
// - 고질라 - 평점 7

// 평점 점수는 double rating 을 사용하세요. if 문을 활용해서 문제를 풀자.

package cond.ex;

//public class MovieRateEx {
//    public static void main(String[] args) {
//        double rating = 7;
//
//        if (rating > 8) {
//            System.out.println("'어바웃 타임'을 추천합니다.");
//        } else if (rating > 7) {
//            System.out.println("'어바웃 타임'을 추천합니다.");
//            System.out.println("'토이 스토리'을 추천합니다.");
//        } else {
//            System.out.println("'어바웃 타임'을 추천합니다.");
//            System.out.println("'토이 스토리'을 추천합니다.");
//            System.out.println("'고질라'을 추천합니다.");
//        }
//    }
//} // * 상황에 따라 else if 가 쓰이지 않는다는 것을 명심하자! *
// 여러개가 출력돼야하기 때문에 다른 if 문을 사용해야합니다.

public class MovieRateEx {
    public static void main(String[] args) {
        double rating = 7.1;

        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }

        if (rating <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }

        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}

// shift 키 + 방향키: 범위 지정
// 문제: 영화 리뷰 관리하기1

// 문제 설명
// 당신은 영화 리뷰 정보를 관리하려고 한다. 먼저 양화리뷰 정보를 담을 수 있는 MovieReview 클래스를 만들어보자.

package javaBasic.class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        // 영화 리뷰 정보 출력
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "월터의 상상은 현실이 된다.";
        movieReview1.review = "공감이 되는 감동적인 영화!";


        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "인터스텔라";
        movieReview2.review = "부녀 상봉";

         //MovieReview[] movieReviews = new MovieReview[]{movieReview1, movieReview2};
        MovieReview[] movieReviews = {movieReview1, movieReview2};

        for (MovieReview movieReview : movieReviews) { // 향상된 for 문 사용
            System.out.println("영화 제목: " +  movieReview.title + ", 리뷰 내용: " +  movieReview.review);
        }
    }
}

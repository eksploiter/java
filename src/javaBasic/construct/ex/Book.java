package javaBasic.construct.ex;

public class Book {
    String title;
    String author;
    int page;

    // 기본 생성자
    Book() {
        this("", "", 0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() { // 인수를 받지 않는 형태로 설계 () 안에 아무 것도 넣지 않는 것이 맞다
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}

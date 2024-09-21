// 문제와 풀이3
// 상품 관리 프로그램 만들기
// 자바를 이용하여 상품관리 프로그램을 만들어보자. 이 프로그램은 다음의 기능이 필요하다.
// - 상품 등록: 상품 이름과 가격을 입력받아 저장한다.
// - 상품 목록: 지금까지 등록한 모든 상품의 목록을 출력한다.

// 다음과 같이 동작해야 한다.
// - 척 화면에서 사용자에게 세 가지 선택을 제시한다.: "1. 상품등록", "2. 상품 목록", "3. 종료"
// - 1. 상품 등록을 선택하면, 사용자로부터 상품 이름과 가격을 입력받아 배열에 저장한다.
// - 2. 상품 목록을 선택하면, 배열에 저장된 모든 상품을 출력한다.
// - 3. 종료를 선택하면 프로그램을 종료한다.

// 제약조건
// 상품은 최대 10개까지 등록할 수 있다.

// 다음은 사용해야하는 변수 및 구조이다.
// - Scanner Start.scanner: 사용자 입력을 받기 위한 Scanner 객체
// - String[] productName: 상품 이름을 저장할 String 배열
// - int[] productPrice: 상품 가격을 저장할 int 배열
// - int productCount: 현재 등록된 상품의 개수를 저장할 int 변수

package Start.array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProducts = 10;
        String[] productName = new String[maxProducts];
        int[] productPrice = new int[maxProducts];

        int productCount = 0;

        while (true) {
            System.out.println("1, 상품 등록 | 2. 상품 목록 | 3. 종료");
            // System.out.print(""1, 상품 등록 | 2. 상품 목록 | 3. 종료\n 메뉴를 입력하세요: "); 이렇게 해도 된다.
            System.out.print("메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // 개행 해줘야 한다.

            if (menu == 1) {
                if (productCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요: ");
                productName[productCount] = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요: ");
                productPrice[productCount] = scanner.nextInt();

                productCount++;
            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productName[i] + " : " + productPrice[i]);
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}

package chap08.verify.exam03;

/**
 * packageName : chap08.verify.exam03
 * fileName : CustomerApplication
 * author : GGG
 * date : 2024-02-08
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class CustomerApplication {
    public static void main(String[] args) {
//        TODO : 연습문제) 아래 결과를 Customer 클래스를 완성하세요.
//          결과 :
//               구매하기
//               판매하기
//               고객 판매 주문
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();             // 구매하기

        Sell seller = customer;
        seller.sell();           // 판매하기

//        Customer 클래스인지 체크
        if(seller instanceof Customer) {
            Customer customer2 = (Customer) seller; // 클래스 원복
            customer2.order(); // 고객 판매 주문 (고유함수)
        }
    }
}

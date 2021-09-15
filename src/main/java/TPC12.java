import kr.tpc.BookVO;

public class TPC12 {
    public static void main(String[] args) {
        // 생성자 -> 생성+초기화 -> 중복정의
        BookVO b1 = new BookVO();

        // BookVO b1 = new BookVO("자바", 4800,""...);
        // 매개변수로 직접 초기화 해주는 방식. 생성자는 만들어줘야함
        System.out.println(b1.price);

        BookVO b2 = new BookVO();
        System.out.println(b2.price);
        // 초기화의 작업은 생성자 하나에서 한거라 같음 똑같은 객체가 두개 만들어진거거
        // 초기화는 원하는 값으로 마음대로 할수 있어야 한다.

        BookVO b3 = new BookVO("파이썬",18000,"대림",645);
        System.out.println(b3.price);

    }}

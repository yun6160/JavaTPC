import kr.tpc.BookVO;

public class TPC11 {
    public static void main(String[] args) {
        //책 한권을 저장하기 위해서 객체를 생성하시오
        BookVO b = new BookVO();
        b.title="파이썬";
        b.price=45000;
        b.company="에이콘";
        b.page=455;

        System.out.println(b.title);
        System.out.println(b.price);
        System.out.println(b.page);
        System.out.println(b.company);

        BookVO b1 = new BookVO();
        b1.title="오라클";
        b1.price=4400;
        b1.company="날다";
        b1.page=422;

        System.out.println(b1.title);
        System.out.println(b1.price);
        System.out.println(b1.page);
        System.out.println(b1.company);
    }
}

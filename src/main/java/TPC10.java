import kr.tpc.BookDTO;

public class TPC10 {
    public static void main(String[] args) {
        // int, float, char, boolean -> PDT
        int a;
        a=10;
        // 책이라는 자료형을 만들자 --> class
        // 객체생성
        BookDTO b= new BookDTO();
        b.title="자바";
        b.price=17000;
        b.company="회사명";
        b.page=55;

        System.out.println(b.title);
        System.out.println(b.price);
        System.out.println(b.company);
        System.out.println(b.page);

    }
}

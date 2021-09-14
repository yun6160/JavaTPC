import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
    public static void main(String[] args) {
        // 관계를 이해하라! PDT vs UDDT
        // 정수 1개를 저장하기위한 변수를 선언하시오
        int a;
        a=10;

        // 책 한권을 저장하기위한 변수를 선언하시오.
        Book b;
        b=new Book(); // 메모리 어딘가에 객체를 생성함
        // 객체 생성 : 번지를 생성. 재개발해서 100호가 났어요
        // = 으로 대입하는 것 : 생성된 번지를 b에게 넘김 100호를 b에게 배정.
        b.title="자바";
        b.price=15000;
        b.company="한빛 미디어";
        b.page=700;

        System.out.print(b.title);
        System.out.print(b.price);
        System.out.print(b.company);
        System.out.print(b.page);
        System.out.println();

        PersonVO p;
        p=new PersonVO();
        p.name="윤정현";
        p.age=7;
        p.height=153.0f;
        p.weight=53f;

        System.out.println(p.name);

    }
}

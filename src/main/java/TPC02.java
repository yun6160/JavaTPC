public class TPC02 {
    public static void main(String[] args) {
        // 프로그래밍의 3대 요소 : 변수, 자료명(DataType), 할당(=)
        // 1+1 = 2

        int a,b,c;

        a=1;
        b=1;
        c=a+b; // 2
        System.out.println(c);

        float f; // float, double
        f=34.5f;
        System.out.println(f);
        // 기본적으로 실수는 double로 인식해서 float를 쓰려면 마지막에 f를 붙여야한다.

        char d;
        d='A'; // 문자 하나 char 는 홑따옴표
        // 문자열 => String 겹따옴표
        System.out.println(d);

        boolean g;
        g=true; // false(거짓), true(참)
        System.out.println(g);
        
        //Book bk; // 기본 자료형이 아니다. Book이란 자료형을 제공해주지 않으니까 설계를 하면 됨 클래스로
        // 책은 제목이 있고, 저자가 있고, 등등 뭐가 많음
        

    }
}

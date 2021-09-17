import kr.tpc.MemberVO;

public class TPC15 {
    public static void main(String[] args) {
        MemberVO m = new MemberVO("홍길동", 40, "010-5303-2698", "서울");
        // setter methode - X
        // 생성자 메소드에 바로 넣엇기 때문

        System.out.println(m.toString());
        // 한꺼번에 String 문자열 형식으로 보여줌 toString 메소드

        MemberVO m1 = new MemberVO();
        m1.setName("dd");
        m1.setTel("01010");
        m1.setAge(34);
        m1.setAddr("wtwt");
        System.out.println(m1.getName());
        System.out.println(m1.getTel());
        System.out.println(m1.getAge());
        System.out.println(m1.getAddr());

        System.out.println(m1.toString());
        System.out.println(m1); // 자동으로 toString 나옴

    }
}

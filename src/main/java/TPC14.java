import kr.tpc.MemberVO;

public class TPC14 {
    public static void main(String[] args) {
        MemberVO m = new MemberVO();
//        m.name="홍길동";
//        m.age=50;
//        m.tel="01053032698";
//        m.addr="우리집";
//
//        System.out.println(m.name);
//        System.out.println(m.addr);
//        System.out.println(m.age);
//        System.out.println(m.tel);

        m.setName("홍길동");
        m.setAddr("fkffkf");
        m.setAge(50);
        m.setTel("01053295929");

        System.out.println(m.getAddr());
        System.out.println(m.getAge());
        System.out.println(m.getTel());
        System.out.println(m.getName());
    }
}

//import java.lang.*;

import com.google.gson.Gson;
import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {
    public static void main(String[] args) {
        // 1. 자바에서 제공해주는 클래스들...API
        // 문자열(String)
        java.lang.String str = new String("APPLE");
        System.out.println(str.toLowerCase()); //소문자로 바꿔서 출력하라는 메소드
        // 자바 랭 패키지 안에 들어있음

        // 2. 직접 만들어서 사용하는 class 들...DTO/VO, DAO, Utility .. API
        MyUtil my = new MyUtil();
        int sum = my.hap();
        System.out.println(sum);

        // 3. 다른 회사에서 만들어 놓은 class 들 ... API
        // Gson -> json
        Gson g = new Gson();
        BookVO vo = new BookVO("자바", 13000, "영진", 800);
        String json = g.toJson(vo);
        System.out.println(json);
        // 별도의 타입인 스트링으로 변환해줌
        // 제이슨 포맷으로 바꿔줌

    }
}

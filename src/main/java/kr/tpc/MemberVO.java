package kr.tpc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO {
    private String name;
    private int age;
    private String tel;
    private String addr;
    public MemberVO(){} //기존의 생성자가 있기때문에 디폴트 생성자는 자동으로 만들어지지않는다 그러니까 밑에 생성자를 만들면 디폴트 하나 만들어줘야함
//    // 세터 게터
//    public void setName(String name){
//        this.name=name;
//    }
//    public String getName(){
//        return name;
//    }

    public MemberVO(String name, int age, String tel, String addr) {
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    } //모든 필드를 하나의 스트링으로 바꿔줌
    // 한꺼번에 String 문자열 형식으로 보여줌 toString 메소드
}

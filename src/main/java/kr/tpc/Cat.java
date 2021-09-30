package kr.tpc;

public class Cat extends Animal {

    public void night(){
        System.out.println("고양이는 밤에 잠을 자지 않는다");
    }

    @Override
    public void eat() {
        System.out.println("고양이처럼 밥먹음");
    }
}

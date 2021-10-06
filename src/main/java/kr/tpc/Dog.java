package kr.tpc;

public class Dog extends Animal {
    // 이름, 나이, 종: 상태정보
    // 재정의 오버라이드
    public void eat() {
        System.out.println("개처럼 먹다");
    }
    public Dog() {
        super(); // 애니멀의 생성자를 호출함
        // 애니멀 생성한 다음 도그 생성
        // 자식이 부모에 있는 생성자를 내부적으로 호출
        // new Animal();
    }
}

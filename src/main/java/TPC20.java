
import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
    public static void main(String[] args) {
        // Animal 부모 클래스를 사용하지 않음
        Dog d=new Dog();
        // 서로 상속관계기 때문에 부모 = 자식 관계라 자식이 부모밑으로 들어가기 때문 Dog의 eat을 불러옴.
        // Animal 의 eat과 Dog의 eat 둘다 있는데 부모의 eat이 안맞기 때문에 dog eat만 나옴
        d.eat();
        // ? -> 개처럼 먹다.
        // 메모리에 애니멀에 잇는 eat이 불러와졌는데 재정의 후 dog의 개처럼먹다가 나옴

        Cat c = new Cat();
        c.eat();
        c.night();
        
        Animal ani = new Dog(); // upcasting 자동형변환
        ani.eat(); // ? 가 아니라 개처럼 먹다가 나옴
        ani=new Cat();
        ani.eat(); // 자식꺼 가져옴 재정의 했으니까

        //ani.night();
        ((Cat)ani).night(); // 다운 캐스팅 강제형 변환
        // 자식 욕심 못꺾듯 자식이 재정의 했으면 그대로 나오는데 부모가 자식 클래스에 있는 메소드는 못씀
    }
}

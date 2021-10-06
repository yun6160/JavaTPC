import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // 자식객체를 그냥 생성해서 씀

        Cat c = new Cat();
        c.eat();
        c.night();

        // Dog.class, Cat.class

        Animal ani = new Dog(); // upcasting 상속관계여야만 만들 수 있다
        ani.eat(); // 개처럼 먹다
        // 부모가 개한테 먹어라 해서 개처럼 먹다

        ani = new Cat();
        ani.eat(); // 냥처럼 먹음
        // 부모가 고양이한테 먹어라해서 냥처럼 먹음

        // ani.night(); -> 안됨 캣타입의 고유한 기능이기 때문에
        // 부모가 고양이한테 명령해야하는데
        // 고양이한텐 night 명령이 남아있지만 부모는 모름
        // 재정의한 애들만 나온다!

        ((Cat) ani).night(); // downcasting

        // 다형성 : 상위 클래스가 같은 명령을 내렸을때 하위 클래스가 서로 다르게 반응하는것것
    }

}


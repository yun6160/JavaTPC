import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
    public static void main(String[] args) {
        // upcasting
        // Cat ani = new Cat();
        // Object ani = new Cat();
        Animal ani = new Cat();
        ani.eat(); // 컴파일시점-> Animal, 실행시점-> Cat

        //ani.night();
        Cat c = (Cat)ani; // downcasting
        c.night();

        ani = new Dog();
        ani.eat();

        // 다형성
        // 상위클래스가 하위클래스에게 동일한 메세지로 서로 다르게 동작시키는 원리

        Object o = new Dog();
        //o.eat(); o엔 eat가 없어
        ((Dog)o).eat(); //downcasting
    }
}

public class TPC08 {
    public static void main(String[] args) {
        int a=30;
        int b=50;
        int v=add(a,b); // static method call 스태틱 메소드이면 메소드가 기운다

        System.out.println(v);
    }

    public static int add(int a, int b){
        int sum=a+b;
        return sum;
    }
}

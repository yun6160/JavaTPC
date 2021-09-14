public class TPC07 {
    public static void main(String[] args) {
        int a = 20;
        float b=56.7f;
        // a+b=?
        float v = sum(a,b); // call by value
        System.out.println(v);

        int[] arr = {1,2,3,4,5};
        // 배열의 총합= ?
        int vv= arrSum(arr);
        System.out.println(vv); // call by reference
    }
    private static int arrSum(int[] x){
        int hap=0;
        for(int i=0; i<x.length; i++){
            hap+=x[i];
        }
        return hap;
    }
    public static float sum(int a, float b){
        float v=a+b;
        return v;

    }
}

// 접근제어자: 한 클래스안에 있을때 호출할떄는 private 가능, 다만 밖에서 다른 클래스에서 호출은 불가능하다

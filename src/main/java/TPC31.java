import kr.tpc.Inflearn;

public class TPC31 {
    public static void main(String[] args) {
        Inflearn inf = new Inflearn(); // 생성자를 프라이빗으로 만들면 못함 Inflearn()' has private access in 'kr.tpc.Inflearn'
        inf.tpc();
        Inflearn.java();

        // java API 생성자 private
        //System sys = new System();
        //Math m = new Math();
        int v = Math.max(10, 20);
    }
}

import kr.tpc.OverLoad;

public class TPC16 {
    public static void main(String[] args) {
        // 1+1
        OverLoad ov=new OverLoad();
        ov.hap(20,30); // hap_int_int(20,50)
        ov.hap(50f, 20);
        ov.hap(20f,30f);

    }
}

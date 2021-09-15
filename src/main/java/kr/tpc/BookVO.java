package kr.tpc;

public class BookVO {
    public String title;
    public int price;
    public String company;
    public int page;
    // 디폴트 생성자 메서드(생략)

    public BookVO(){
        // 초기화 작업
        this.title = "자바";
        this.price = 14000;
        this.company = "이지스";
        this.page = 780;
    }
    // 생성자 메서드의 중복정의(overloading) 매개변수 타입이나 갯수가 달라야함
    public BookVO(String title, int price, String company, int page){
        this.title = title;
        this.price = price;
        this.company = company;
        this.page = page;

    }
}

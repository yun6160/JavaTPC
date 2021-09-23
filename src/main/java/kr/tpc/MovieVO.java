package kr.tpc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieVO {
    private String title;
    private int price;
    private String author;
    private int level;
    private float time;
    public MovieVO(){};

    public MovieVO(String title, int price, String author, int level, float time) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.level = level;
        this.time = time;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", level=" + level +
                ", time=" + time +
                '}';
    }
}

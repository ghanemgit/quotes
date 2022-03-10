package quotes;


public class Quotes {
    String author;
    String likes;
    String text;

    public Quotes() {
    }

    public Quotes(String author, String likes, String text) {
        this.author = author;
        this.likes = likes;
        this.text = text;
    }



    @Override
    public String toString() {
        return "Quotes{" +
                ", author='" + author + '\'' +
                ", likes=" + likes +
                ", text='" + text + '\'' +
                '}';
    }
}

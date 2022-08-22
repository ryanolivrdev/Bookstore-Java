public class Book {
    private String author;
    private String nameBook;
    private int yearPublication;

    public int getYearPublication() {
        return yearPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getnameBook() {
        return nameBook;
    }

    public String getBook() {
        return author + " " + nameBook + " " + String.valueOf(yearPublication);
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setnameBook(String nameBook) {
        this.nameBook = nameBook;
    }

}

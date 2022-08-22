public class Review {
    private double valueBook;
    private double bookReview;

    public double getReview() {
        return bookReview;
    }

    public String getValue() {
        return String.valueOf(valueBook) + " " + String.valueOf(bookReview);
    }

    public void setBookReview(double bookReview) {
        this.bookReview = bookReview;
    }

    public void setValue(double valueBook) {
        this.valueBook = valueBook;
    }
}
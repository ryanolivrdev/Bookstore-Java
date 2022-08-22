public class App {
    public static void main(String[] args) throws Exception {

        String AuthorChoice = System.console().readLine("Qual o nome do Autor: ");
        String nameBook = System.console().readLine("Qual o nome da obra: ");
        String yearPublicationChoice = System.console().readLine("Qual a data de publicação: ");

        Double valueChoice = Double.parseDouble(System.console().readLine("Qual o valor do livro: "));
        Double reviewChoice = Double.parseDouble(System.console().readLine("Qual a avaliacao: "));

        Book Book = new Book();
        Book.setAuthor(AuthorChoice);
        Book.setnameBook(nameBook);
        Book.setYearPublication(Integer.parseInt(yearPublicationChoice));

        System.out.println(Book.getBook());

        Review BookReview = new Review();
        BookReview.setValue(valueChoice);
        BookReview.setBookReview(reviewChoice);

    }
}
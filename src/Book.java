public class Book {
    private final String bookTitle;
    private final Author author;
    private int bookYearPublishing;
    public Book(String bookTitle, Author author, int bookYearPublishing) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.bookYearPublishing = bookYearPublishing;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return author.getAuthorFirstname() + " " + author.getAuthorLastname();
    }

    public int getBookYearPublishing() {
        return bookYearPublishing;
    }

    public void setBookYearPublishing(int bookYearPublishing) {
        this.bookYearPublishing = bookYearPublishing;
    }
}

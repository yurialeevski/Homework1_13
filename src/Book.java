import java.util.Objects;

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

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", author=" + author +
                ", bookYearPublishing=" + bookYearPublishing +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookYearPublishing == book.bookYearPublishing && bookTitle.equals(book.bookTitle) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, bookYearPublishing);
    }
}

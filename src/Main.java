public class Main {
    public static void main(String[] args) {
        Author author_1 = new Author("Иван", "Тургенев");
        System.out.println(author_1.getAuthorFirstname() + " " + author_1.getAuthorLastname());
        Author author_2 = new Author("Александр", "Пушкин");
        System.out.println(author_2.getAuthorFirstname() + " " + author_2.getAuthorLastname());

        Book book_1 = new Book("Записки охотника", author_1, 2014);
        System.out.println(book_1.getBookAuthor() + " " + book_1.getBookTitle() + " " + book_1.getBookYearPublishing());

        book_1.setBookYearPublishing(2010);
        System.out.println(book_1.getBookAuthor() + " " + book_1.getBookTitle() + " " + book_1.getBookYearPublishing());

        Book book_2 = new Book("Лицейская лирика", author_2,1993);
        System.out.println(book_2.getBookAuthor() + " " + book_2.getBookTitle() + " " + book_2.getBookYearPublishing());
    }
}
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
        System.out.println();

        System.out.println(author_1);
        System.out.println(book_1);
        System.out.println();

        Author author_3 = new Author("Александр", "Пушкин");
        if(author_1.equals(author_2)) {
            System.out.println(author_1 + " и " + author_2 + " - это один и тот же автор");
        } else {
            System.out.println(author_1.getAuthorLastname() + " и " + author_2.getAuthorLastname() + " - это разные авторы");
        }
        if(author_2.equals(author_3)) {
            System.out.println(author_2.getAuthorLastname() + " и " + author_3.getAuthorLastname() + " - это один и тот же автор");
        } else {
            System.out.println(author_2.getAuthorLastname() + " и " + author_3.getAuthorLastname() + " - это разные авторы");
        }
        System.out.println();

        Book book_3 = new Book("Лицейская лирика", author_2,1993);
        if(book_1.equals(book_2)) {
            System.out.println(book_1.getBookTitle() + " и " + book_2.getBookTitle() + " - это одинаковые книги");
        } else {
            System.out.println(book_1.getBookTitle() + " и " + book_2.getBookTitle() + " - это разные книги");
        }
        if(book_2.equals(book_3)) {
            System.out.println(book_2.getBookTitle() + " и " + book_3.getBookTitle() + " - это одинаковые книги");
        } else {
            System.out.println(book_2.getBookTitle() + " и " + book_3.getBookTitle() + " - это разные книги");
        }
    }
}
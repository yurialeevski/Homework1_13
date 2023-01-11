import java.util.Objects;

public class Author {
    private final String authorFirstname;
    private final String authorLastname;

    public Author(String authorFirstname, String authorLastname) {
        this.authorFirstname = authorFirstname;
        this.authorLastname = authorLastname;
    }

    public String getAuthorFirstname() {
        return authorFirstname;
    }
    public String getAuthorLastname() {
        return authorLastname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorFirstname='" + authorFirstname + '\'' +
                ", authorLastname='" + authorLastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorFirstname.equals(author.authorFirstname) && authorLastname.equals(author.authorLastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstname, authorLastname);
    }
}

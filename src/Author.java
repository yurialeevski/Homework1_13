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
}

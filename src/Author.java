import java.util.Objects;

public class Author {
    private final String name;
    private final String firstname;

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }


    public Author(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;

    }

    @Override
    public String toString() {
        return firstname + " " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return name.equals(author.name) && firstname.equals(author.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstname);
    }
}
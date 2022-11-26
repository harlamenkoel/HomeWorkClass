import java.util.Objects;

public class Book {
    private final String titleName;
    private final Author author;
    private int publicationDate;

    public String getTitleName() {
        return titleName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Book(String titleName, Author author, int publicationDate) {
        this.titleName = titleName;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "\"" + titleName + "\"" + " " + publicationDate + " " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publicationDate == book.publicationDate
                && titleName.equals(book.titleName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleName, author, publicationDate);
    }
}
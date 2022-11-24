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
}
public class HomeWorkClass {
    public static void main(String[] args) {
        Author vasiliev = new Author("Борис", "Васильев");
        Author tolstoy = new Author("Лев", "Толстой");
        Author tolstoy2 = new Author("Лев", "Толстой");

        Book dawnsHereAreQuiet = new Book(" А зори здесь тихие... ", vasiliev, 0);
        Book warAndPiece = new Book(" <<Война и мир>> ", tolstoy, 1867);

        dawnsHereAreQuiet.setPublicationDate(1969);

        System.out.println(dawnsHereAreQuiet.getAuthor().getName() + " " + dawnsHereAreQuiet.getAuthor().getFirstname()
                + " " + dawnsHereAreQuiet.getTitleName() + " Дата публикации: " + dawnsHereAreQuiet.getPublicationDate());
        System.out.println(warAndPiece.getAuthor().getName() + " " + warAndPiece.getAuthor().getFirstname() + " "
                + warAndPiece.getTitleName() + " Дата публикации: " + warAndPiece.getPublicationDate());

        System.out.println();
        System.out.println(dawnsHereAreQuiet);

        System.out.println(tolstoy == tolstoy2);
        System.out.println(tolstoy.equals(tolstoy2));

        System.out.println(tolstoy.hashCode());
        System.out.println(tolstoy2.hashCode());
        System.out.println(warAndPiece.hashCode());
        System.out.println(vasiliev.hashCode());
    }
}
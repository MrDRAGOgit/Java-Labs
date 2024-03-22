import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author bradbury = new Author("R.Bradbury");
        Book book3 = new Book("451 Fharengeit", 327, bradbury);
        Book book1 = new Book("Dandelion Wine", 251, bradbury);
        Author tolkien = new Author("J.R.R.Tolkien");
        Book book2 = new Book("Silmarileon", 1241, tolkien);
        Book[] books = new Book[]{book1, book2, book3};
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
    }
}
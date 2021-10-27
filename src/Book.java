import java.util.LinkedList;
import java.util.List;

public class Book extends Section {
    private List<Author> authors;

    public Book(String title) {
        super(title);
        this.authors = new LinkedList<>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }


    public void print() {
        System.out.println("Authors: ");
        for(Author a: authors) {
            a.print();
        }
        System.out.println();
        super.print();
    }
}

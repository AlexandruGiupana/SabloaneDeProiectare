import java.util.LinkedList;
import java.util.List;

public class Book {

    private String title;
    private List<String> images;
    private List<String> paragraphs;
    private List<String> tables;

    public Book(String title) {
        this.title = title;
        this.images = new LinkedList<>();
        this.paragraphs = new LinkedList<>();
        this.tables = new LinkedList<>();
    }

    public void createNewParagraph(String paragraph) {
        this.paragraphs.add(paragraph);
    }

    public void createNewImage(String image) {
        this.images.add(image);
    }

    public void createNewTable(String table) {
        this.tables.add(table);
    }

    public void print() {
         System.out.println(
                 "title: " + title +
                "\nimages: " + images +
                "\nparagraphs: " + paragraphs +
                "\ntables: " + tables);
    }
}

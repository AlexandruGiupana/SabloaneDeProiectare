import java.util.LinkedList;
import java.util.List;

public class SubChapter {
    private String name;
    private static int index;
    private List<Element> elements;

    public SubChapter(String name) {
        this.name = name;
        index += 1;
        this.elements = new LinkedList<>();
    }

    public int getIndex() {
        return index;
    }

    public void createNewParagraph(String text) {
        this.elements.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        this.elements.add(new Image(imageName));
    }

    public void createNewTable(String title) {
        this.elements.add(new Table(title));
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);
        for(Element e: elements) {
            e.print();
        }
    }
}

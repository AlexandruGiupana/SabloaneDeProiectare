import java.util.LinkedList;
import java.util.List;

public class TableOfContent implements Element {

    private List<String> bookTableOfContentElements;

    public TableOfContent() {
        this.bookTableOfContentElements = new LinkedList<>();
    }

    public void addElement(String bookTableOfContentElement) {
        bookTableOfContentElements.add(bookTableOfContentElement);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Element get(int i) {
        return null;
    }

    public void render() {
        for(String bookTableOfContentElement: bookTableOfContentElements) {
            System.out.println(bookTableOfContentElement);
        }
    }
}

import java.util.LinkedList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> elements = new LinkedList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);
        for(Element el: elements) {
            el.print();
        }
    }

    @Override
    public void add(Element e) {
        elements.add(e);
    }

    @Override
    public void remove(Element e) {
        elements.remove(e);
    }

    @Override
    public Element get(int i) {
        return elements.get(i);
    }
}

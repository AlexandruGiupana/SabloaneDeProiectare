import java.util.LinkedList;
import java.util.List;

public class Section implements Element {
    private String title;
    protected List<Element> elements = new LinkedList<>();

    public Section(String title) {
        this.title = title;
    }

    public void render() {
        System.out.println(title);
//        for(Element el: elements) {
//            el.render();
//        }
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
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for(Element el: elements) {
            el.accept(visitor);
        }
    }

    @Override
    public Element get(int i) {
        return elements.get(i);
    }

    public String getTitle() {
        return title;
    }
}

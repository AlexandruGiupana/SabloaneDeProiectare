public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void render() {
        System.out.println("Table: " + title);
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

    public String getTitle() {
        return title;
    }
}

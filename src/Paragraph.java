public class Paragraph implements Element{
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = null;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    public void render() {
        if(alignStrategy == null) {
            System.out.println("Paragraph: " + text);
        } else {
            alignStrategy.render(text);
        }
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

}

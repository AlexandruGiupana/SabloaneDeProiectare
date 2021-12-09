public interface Element {
    void add(Element e);
    void remove(Element e);
    void accept(Visitor visitor);
    Element get(int i);
}

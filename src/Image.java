public class Image implements Element {
    public String url;

    public Image(String name) {
        this.url = name;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + url);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int i) {
        return null;
    }
}

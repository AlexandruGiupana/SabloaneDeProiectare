import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String url;

    public Image(String name) {
        this.url = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void render() {
        System.out.println("Image with name: " + url);
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

    public String getUrl() {
        return url;
    }
}

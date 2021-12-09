public class ImageProxy implements Element {
    private String url;
    private Image image;

    public ImageProxy(String url) {
        this.url = url;
    }

    private void loadImage() {
        if(this.image == null) {
            this.image = new Image(this.url);
        }
    }

    public void render() {
        loadImage();
        this.image.render();
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

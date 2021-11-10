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

    @Override
    public void print() {
        loadImage();
        this.image.print();
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

public class Image implements Element{
    public String imageName;

    public Image(String name) {
        this.imageName = name;
    }

    @Override
    public void print() {
        System.out.println("Image with title: " + this.imageName);
    }
}

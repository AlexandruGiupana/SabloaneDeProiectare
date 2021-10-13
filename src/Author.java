public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void print() {
        System.out.println(name);
    }
}

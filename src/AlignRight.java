public class AlignRight implements AlignStrategy {

    @Override
    public void render(String p) {
        System.out.println(p + "##");
    }
}

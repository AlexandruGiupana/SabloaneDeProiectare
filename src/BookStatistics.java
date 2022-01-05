public class BookStatistics implements Visitor {

    private int paragraphCounter = 0;
    private int imageCounter = 0;
    private int tableCounter = 0;

    @Override
    public void visit(Book book) {
    }

    @Override
    public void visit(Section section) {
    }

    @Override
    public void visit(TableOfContent tableOfContent) {
    }

    @Override
    public void visit(Paragraph paragraph) {
        paragraphCounter += 1;
    }

    @Override
    public void visit(ImageProxy imageProxy) {
    }

    @Override
    public void visit(Image image) {
        imageCounter += 1;
    }

    @Override
    public void visit(Table table) {
        tableCounter += 1;
    }

    public void printStatistics() {
        System.out.println("Number of paragraphs: " + paragraphCounter);
        System.out.println("Number of images: " + imageCounter);
        System.out.println("Number of tables: " + tableCounter);
    }
}

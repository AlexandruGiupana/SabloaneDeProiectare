public class BookStatistics implements Visitor {

    private int bookCounter = 0;
    private int sectionCounter = 0;
    private int tableOfContentCounter = 0;
    private int paragraphCounter = 0;
    private int imageProxyCounter = 0;
    private int imageCounter = 0;
    private int tableCounter = 0;

    @Override
    public void visit(Book book) {
        bookCounter += 1;
    }

    @Override
    public void visit(Section section) {
        sectionCounter += 1;
    }

    @Override
    public void visit(TableOfContent tableOfContent) {
        tableOfContentCounter += 1;
    }

    @Override
    public void visit(Paragraph paragraph) {
        paragraphCounter += 1;
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        imageProxyCounter += 1;
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
        System.out.println("Number of books: " + bookCounter);
        System.out.println("Number of sections: " + sectionCounter);
        System.out.println("Number of tables of content: " + tableOfContentCounter);
        System.out.println("Number of paragraphs: " + paragraphCounter);
        System.out.println("Number of image proxies: " + imageProxyCounter);
        System.out.println("Number of images: " + imageCounter);
        System.out.println("Number of tables: " + tableCounter);
    }
}

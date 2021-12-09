public class GenerateToC implements Visitor {

    private TableOfContent tableOfContent = new TableOfContent();

    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(Section section) {
        tableOfContent.addElement(section.getTitle());
    }

    @Override
    public void visit(TableOfContent tableOfContent) {
    }

    @Override
    public void visit(Paragraph paragraph) {
    }

    @Override
    public void visit(ImageProxy imageProxy) {
    }

    @Override
    public void visit(Image image) {
        tableOfContent.addElement(image.getUrl());
    }

    @Override
    public void visit(Table table) {
        tableOfContent.addElement(table.getTitle());
    }

    public TableOfContent getToC() {
        return tableOfContent;
    }
}

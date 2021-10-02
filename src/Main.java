public class Main {

    public static void main(String []args) {
        Book discoTitanic = new Book("Disco Titanic");
        discoTitanic.createNewParagraph("Paragraph 1");
        discoTitanic.createNewParagraph("Paragraph 2");
        discoTitanic.createNewParagraph("Paragraph 3");
        discoTitanic.createNewImage("Image 1");
        discoTitanic.createNewParagraph("Paragraph4");
        discoTitanic.createNewParagraph("Paragraph5");
        discoTitanic.createNewTable("Table1");
        discoTitanic.print();
    }
}

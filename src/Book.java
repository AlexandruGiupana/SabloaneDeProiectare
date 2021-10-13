import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Book {
    private String title;
    private List<Author> authors;
    private List<Chapter> chapters;

    public Book(String title) {
        this.title = title;
        this.authors = new LinkedList<>();
        this.chapters = new LinkedList<>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public int createChapter(String chapterName) {
        Chapter newChapter = new Chapter(chapterName);
        this.chapters.add(newChapter);
        return newChapter.getIndex();
    }

    public Chapter getChapter(int index) {
        return this.chapters.stream().filter(chapter -> chapter.getIndex() == index).collect(Collectors.toList()).get(0);
    }
}

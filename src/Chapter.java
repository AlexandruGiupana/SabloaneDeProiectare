import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter {
    private String name;
    private static int index;
    private List<SubChapter> subChapters;

    public Chapter(String name) {
        this.name = name;
        index += 1;
        this.subChapters = new LinkedList<>();
    }

    public int getIndex() {
        return index;
    }

    public int createSubChapter(String name) {
        SubChapter subChapter = new SubChapter(name);
        subChapters.add(subChapter);
        return subChapter.getIndex();
    }

    public SubChapter getSubChapter(int index) {
        return subChapters.stream().filter(subChapter -> subChapter.getIndex() == index).collect(Collectors.toList()).get(0);
    }

    public void print() {
        System.out.println(name + " " + subChapters);
    }
}

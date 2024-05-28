import java.util.ArrayList;

public class Book extends Media{
    private int id;
    private String title;
    private String category;
    private float cost;
    private ArrayList<String> authors = new ArrayList<String>();

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).equals(authorName)) {
                System.out.println("The author is already in the list.");
                return;
            }
            else {
                authors.add(authorName);
                System.out.println("The author has been added.");
                return;
            }
        }
    }

    public void removeAuthor(String authorName) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).equals(authorName)) {
                authors.remove(i);
                System.out.println("The author has been removed.");
                return;
            }
        }
        System.out.println("The author is not in the list.");
    }
}
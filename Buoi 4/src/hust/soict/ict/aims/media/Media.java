package hust.soict.ict.aims.media;

import java.util.Comparator;

public abstract class Media {
    protected int id;
    protected String title = " ";
    protected String category;
    protected float cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        Media media = (Media) obj;
        if (media == null) return false;
        return title.equals(media.getTitle());
    }

    @Override
    public String toString() {
        String res = "Media: ";
        if (getTitle() != null) res += ", Title: " + getTitle();
        if (getCategory() != null) res += ", Category: " + getCategory();
        if (getCost() > 0) res += ", Cost: " + getCost();
        return res;
    }

    Comparator<Media> mediaComparatorByCostTitle = new MediaComparatorByCostTitle();
    Comparator<Media> mediaComparatorByTitleCost = new MediaComparatorByTitleCost();
}
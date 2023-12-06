package Models;

public class Model {
    private String id = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String authors = "authors";

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        if (authors.trim() != null) {
            this.authors = authors;
        }
    }

    private String title = "title";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        }
    }

    private String publisher = "publisher";

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher != null && !publisher.isEmpty()) {
            this.publisher = publisher;
        }
    }

    private int publishedQuantity = 0;

    public int getPublishedQuantity() {
        return publishedQuantity;
    }

    public void setPublishedQuantity(int publishedQuantity) {
        if (publishedQuantity >= 0) {
            this.publishedQuantity = publishedQuantity;
        }
    }
}

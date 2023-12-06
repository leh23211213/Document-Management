package Models;

public class Book extends Model {
    public Book(String id, String authors, String title, String publisher, int publishedQuantity,
            int numOfPages) {
        super();
        this.numOfPages = numOfPages;
    }

    private int numOfPages = 1;

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        if (numOfPages >= 1)
            this.numOfPages = numOfPages;
    }
}

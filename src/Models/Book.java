package Models;

public class Book extends Model {
  public Book() {}
  public Book(String id, String authors, String title, String publisher,
              int publishedQuantity, int numOfPages) {
    super(id, authors, title, publisher, publishedQuantity);
    this.numOfPages = numOfPages;
  }

  private int numOfPages = 1;

  public int getNumOfPages() { return numOfPages; }

  public void setNumOfPages(int numOfPages) {
    if (numOfPages >= 1)
      this.numOfPages = numOfPages;
  }
  @Override
  public String toString() {
    return "Book [Id:" + getId() + ", authors: " + getAuthors() +
        ", title: " + getTitle() + ", publisher: " + getPublisher() +
        ", publishedQuantity: " + getPublishedQuantity() +
        ", issueNumber: " + getNumOfPages() + "]";
  }
}

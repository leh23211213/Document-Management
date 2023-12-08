package Models;

public class Newspaper extends Model {
  public Newspaper(String id, String authors, String title, String publisher,
                   int publishedQuantity, int issueDay) {
    super(id, authors, title, publisher, publishedQuantity);
    this.issueDay = issueDay;
  }

  private int issueDay;

  public int getIssueDay() { return issueDay; }

  public void setIssueDay(int issueDay) {
    if (issueDay >= 0 && issueDay <= 31)
      this.issueDay = issueDay;
  }
  @Override
  public String toString() {
    return "Newspaper [Id:" + getId() + ", authors: " + getAuthors() +
        ", title: " + getTitle() + ", publisher: " + getPublisher() +
        ", publishedQuantity: " + getPublishedQuantity() +
        ", issueDay: " + getIssueDay() + "]";
  }
}

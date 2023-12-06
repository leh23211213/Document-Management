package Models;

public class Megazine extends Model {
    public Megazine(String id, String authors, String title, String publisher, int publishedQuantity,
            int issueNumber, int issueMonth) {
        super();
        this.issueNumber = issueNumber;
        this.issueMonth = issueMonth;
    }

    private int issueNumber = 0;

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if (issueNumber >= 0)
            this.issueNumber = issueNumber;
    }

    private int issueMonth;

    public int getIssueMonth() {
        return issueMonth;
    }

    public void setIssueMonth(int issueMonth) {
        if (issueMonth >= 0 && issueMonth <= 12) {
            this.issueMonth = issueMonth;
        }
    }
}

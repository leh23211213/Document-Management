package Framework;

public class DateParsing {
    private int day;

    public int getDay() {
        return day;
    }

    private int month;

    public int getMonth() {
        return month;
    }

    private int year;

    public int getYear() {
        return year;
    }

    public DateParsing() {
    }

    public DateParsing(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public DateParsing(String dateStr) {
        String[] dateParts = dateStr.split("/");
        if (dateParts.length == 3) {
            this.day = Integer.parseInt(dateParts[0]);
            this.month = Integer.parseInt(dateParts[1]);
            this.year = Integer.parseInt(dateParts[2]);
        }
    }
}
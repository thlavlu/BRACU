//Created By THLAVLU18301190
package lab01p02t08;

public class Date {

    public int date;
    public int month;
    public int year;

    public Date() {
        date = 5;
        month = 6;
        year = 7;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int d) {

        date = d;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int m) {
        month = m;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        year = y;
    }

    public void displayDate() {
        System.out.println(getDate() + "/" + getMonth() + "/" + getYear());
    }
}

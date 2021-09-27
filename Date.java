package practice;

public class Date {


    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year= year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        }
    }
    public void setDay(int day) {
        if (day > 0 && day <= 31)
        if ( month == 2 && day < 30){
            this.day = day;
        }
    }
    public void setYear(int year) {
        if (year > 1900) {
            this.year = year;
        }
    }
    public String displayDate() {
        return month + "/" + day + "/" + year;
    }



}

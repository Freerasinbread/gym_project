import java.util.ArrayList;

public class Schedule{
    private ArrayList<String> days;
    private double hoursPerDay;
    private String timeStart, timeEnd;

    public Schedule(ArrayList<String> days, double hpd, String start, String end) {
        this.days = days;
        hoursPerDay = hpd;
        timeStart = start;
        timeEnd = end;
    }

    public ArrayList<String> getDays() {
        return days;
    }

    public double getHours() {
        return hoursPerDay;
    }

    public String getTimes() {
        return timeStart + " " + timeEnd;
    }

    public void setDays(ArrayList<String> days) {
        this.days = days;
    }

    public void setHours(double hours) {
        hoursPerDay = hours;
    }

    public void setTimes(String start, String end) {
        timeStart = start;
        timeEnd = end;
    }
}

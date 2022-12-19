import java.util.ArrayList;

public class Schedule{
    private ArrayList<String> days;
    private double hoursPerDay;
    private int ID;
    private Trainer t;

    public Schedule(ArrayList<String> days, double hpd, int ID, Trainer t) {
        this.days = days;
        hoursPerDay = hpd;
        this.ID = ID;
        this.t = t;
    }

    public ArrayList<String> getDays() {
        return days;
    }

    public double getHours() {
        return hoursPerDay;
    }

    public void setDays(ArrayList<String> days) {
        this.days = days;
    }

    public void setHours(double hours) {
        hoursPerDay = hours;
    }
}

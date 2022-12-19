public class Payment {
    private boolean isMonthly;
    private double rate;
    private int id;

    public Payment(int id) {
        this.id = id;
        this.isMonthly = false;
        this.rate = 0;
    }

    public boolean isMonthly() {
        return isMonthly;
    }

    public void setMonthly(boolean isMonthly) {
        this.isMonthly = isMonthly;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String toString() {
        if (isMonthly) {
            return "ID: " + id + "\t" + rate + " per month";
        }
        return "ID: " + id + "\t" + rate + " once";
    }
}

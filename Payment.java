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

    public boolean addMembership(boolean isMonthly, Trainer getTrainer) {
        if (rate != 0 || isMonthly) {
            return false;
        }
        rate = 30;
        isMonthly = true;
        if (getTrainer != null) {
            rate += getTrainer.getRate();
        }
        return true;
    }
}

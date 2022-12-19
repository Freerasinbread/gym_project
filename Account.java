public class Account extends Person {
    static int uid;
    private int id;
    private boolean isPaying, hasTrainer;

    public Account(String name, String phone, String email) {
        super(name, phone, email);
        id = uid;
        uid++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPaying() {
        return isPaying;
    }

    public void setPaying(boolean isPaying) {
        this.isPaying = isPaying;
    }

    public void getTrainer(Trainer a) {
        hasTrainer = true;
    }

    public void cancelTrainer() {
        hasTrainer = false;
    }
    
}

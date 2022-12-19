public class Account extends Person {
    static int uid;
    private int id;

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
}

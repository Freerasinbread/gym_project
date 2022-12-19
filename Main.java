import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Person> personList = new ArrayList<Person>();
    static ArrayList<Account> accountList = new ArrayList<Account>();
    static ArrayList<Trainer> trainerList = new ArrayList<Trainer>();
    static ArrayList<Schedule> scheduleList = new ArrayList<Schedule>();
    public static void main(String[] args) {
        int ans = -1;
        while (ans != 0) {
            System.out.println("1. Create new person: ");
            System.out.println("2. Create new account: ");
            System.out.println("3. Get Amount Due: ");
            System.out.println("4. Create new trainer: ");
            System.out.println("5. Add personal trainer to account: ");



            ans = sc.nextInt();
            sc.nextLine();

            if (ans == 1) {
                System.out.println("Name: ");
                String strName = sc.nextLine();
                System.out.println("Phone");
                String strPhone = sc.nextLine();
                System.out.println("Email");
                String strEmail = sc.nextLine();

                Person newPerson = new Person(strName, strPhone, strEmail);
                personList.add(newPerson);
                System.out.println("Successful");
            }
            if (ans == 2) {
                System.out.println("Choose person: ");
                for (int i = 0; i < personList.size(); i++) {
                    System.out.println(i + ". " + personList.get(i).getName());
                }
                int intPerson = sc.nextInt();
                if (0 <= intPerson && intPerson <= personList.size()) {
                    Person p = personList.get(intPerson);
                    Account newAccount = new Account(p.getName(), p.getPhone(), p.getEmail());
                    accountList.add(newAccount);
                    System.out.println("Successful - ID: " + newAccount.getId());
                }
            }
            if (ans == 3) {
                System.out.println("Choose account: ");
                for (int i = 0; i < accountList.size(); i++) {
                    System.out.println(i + ". " + accountList.get(i).getName());
                }
                int intAccount = sc.nextInt();
                if (0 <= intAccount && intAccount <= personList.size()) {
                    Account a = accountList.get(intAccount);
                    Payment p = new Payment(a.getId());
                    System.out.println(p);
                }
            }
            if (ans == 4) {
                System.out.println("Name: ");
                String strName = sc.nextLine();
                System.out.println("Rate: ");
                int intRate = sc.nextInt();

                Trainer newTrainer = new Trainer(strName, intRate);
                trainerList.add(newTrainer);
                System.out.println("Successful");
            }
            if (ans == 5) {
                System.out.println("Account ID: ");
                int intAccID = sc.nextInt();
                System.out.println("Trainer name: ");
                String strTrainer = sc.nextLine();
                System.out.println("Weekends or Weekdays");
                String strSchedule = sc.nextLine();

                for (int i = 0; i < trainerList.size(); i++) {
                    if (trainerList.get(i).getName().equals(strTrainer)) {
                        if (strSchedule.equals("Weekends")) {
                            ArrayList<String> days = new ArrayList<String>();
                            days.add("Saturday");
                            days.add("Sunday");
                            Schedule s = new Schedule(days, 2, intAccID, trainerList.get(i));
                        }
                        else if (strSchedule.equals("Weekdays")) {
                            ArrayList<String> days = new ArrayList<String>();
                            days.add("Monday");
                            days.add("Tuesday");
                            days.add("Wednesday");
                            days.add("Thursday");
                            days.add("Friday");
                            Schedule s = new Schedule(days, 2, intAccID, trainerList.get(i));
                        }
                    }
                }
            }
        }
    }
}

package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Reporter reporterU = new Reporter(user);
        reporterU.report();
        Persister persisterU = new Persister(user);
        persisterU.save();
        Customer customer = new Customer("Jay");
        Reporter reporterC = new Reporter(customer);
        reporterC.report();
        Persister persisterC = new Persister(customer);
        persisterC.save();
    }
}
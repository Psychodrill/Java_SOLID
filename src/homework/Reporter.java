package homework;

public class Reporter{
    private final Nameable user;
    public Reporter(Nameable user){
        this.user=user;
    }
    public void report(){
        System.out.println("Report for user: " + user.getName());
    }

}
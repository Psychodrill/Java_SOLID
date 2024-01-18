package homework;

public class Persister{
    private final Nameable user;

    public Persister(Nameable user){
        this.user = user;
    }

    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}

package homework;

public class User implements Nameable{
    private final String name;

    public User(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }

    // public void save(){
    //     Persister persister = new Persister(this);
    //     persister.save();
    // }


}

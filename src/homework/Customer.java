package homework;

public class Customer implements Nameable {

    private final String name;

    public Customer(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
        
    }
    
}

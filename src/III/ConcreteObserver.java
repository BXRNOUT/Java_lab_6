package III;

public class ConcreteObserver implements Observer
{
    private String name;

    public ConcreteObserver(String name)
    {
        this.name = name;
    }

    public void update(String message)
    {
        System.out.println("Observer " + name + " ---> " + message);
    }
}

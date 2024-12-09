package II;

public class AnimalFactory
{
    public AnimalFactory() {}
    public Animal createNewAnimal(String type)
    {
        if(type.equalsIgnoreCase("cat"))
            return new Cat();
        if(type.equalsIgnoreCase("dog"))
            return new Dog();
        return null;
    }
}

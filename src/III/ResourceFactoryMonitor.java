package III;

import java.util.ArrayList;

public class ResourceFactoryMonitor
{
    private ArrayList<Observer> observers = new ArrayList<>();
    private ArrayList<String> batchOfGoods = new ArrayList<>();

    public ResourceFactoryMonitor() {}

    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }
    private void update(String message)
    {
        for(Observer observer : observers)
            observer.update(message);
    }
    public void addBatchOfGoods(String batch)
    {
        batchOfGoods.add(batch);
        update("Партия товара: " + batch + ". Производство завершено!");
    }
}

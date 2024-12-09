import I.Configuration;
import II.AnimalFactory;
import III.*;
import IV.*;
import V.*;

public class Main
{
    public static void main(String[] args)
    {
        Configuration config1 = Configuration.getInstance();
        config1.loadConfig("src/I/config.txt");
        System.out.println(config1.get("fjjd"));
        System.out.println(config1.get("99FG"));

        AnimalFactory factory = new AnimalFactory();
        factory.createNewAnimal("dog").play();
        factory.createNewAnimal("cat").play();

        Observer observer1 = new ConcreteObserver("observer1");
        Observer observer2 = new ConcreteObserver("observer2");
        ResourceFactoryMonitor resourceFactoryMonitor = new ResourceFactoryMonitor();
        resourceFactoryMonitor.addObserver(observer1);
        resourceFactoryMonitor.addObserver(observer2);
        resourceFactoryMonitor.addBatchOfGoods("Мука");
        resourceFactoryMonitor.addBatchOfGoods("Макароны");

        Drone drone = new Drone();
        Command commandScanArea = new ScanArea(drone);
        Command commandMoveToTarget = new MoveToTarget(drone, "Танк");
        Command commandFireWeapon = new FireWeapon(drone);
        DroneController droneController = new DroneController();
        droneController.pressButton();
        droneController.addCommand(commandScanArea);
        droneController.pressButton();
        droneController.addCommand(commandMoveToTarget);
        droneController.pressButton();
        droneController.addCommand(commandFireWeapon);
        droneController.pressButton();

        Particle particle1 = ParticalFactory.getParticle("black", 2, 4);
        System.out.println(particle1.toString());
        Particle particle2 = ParticalFactory.getParticle("black", 2, 0);
        System.out.println(particle2.toString());
        Particle particle3 = ParticalFactory.getParticle("black", 2, 4);
        System.out.println(particle3.toString());
    }
}


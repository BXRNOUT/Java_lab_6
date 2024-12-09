package IV;

public class FireWeapon implements Command
{
    private Drone drone;

    public FireWeapon(Drone drone)
    {
        this.drone = drone;
    }

    public void execute()
    {
        drone.fireWeapon();
    }
}

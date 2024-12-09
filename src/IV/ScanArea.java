package IV;

public class ScanArea implements Command
{
    private Drone drone;

    public ScanArea(Drone drone)
    {
        this.drone = drone;
    }

    public void execute()
    {
        drone.scanArea();
    }
}

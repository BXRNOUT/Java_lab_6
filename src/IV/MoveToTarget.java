package IV;

public class MoveToTarget implements Command
{
    private Drone drone;
    private String target;


    public MoveToTarget(Drone drone, String target)
    {
        this.drone = drone;
        this.target = target;
    }

    public void execute()
    {
        drone.moveToTarget(target);
    }
}

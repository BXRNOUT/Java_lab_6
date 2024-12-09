package IV;

public class DroneController
{
    private Command command;

    public DroneController(){}

    public void addCommand(Command command)
    {
            this.command = command;
    }
    public void pressButton()
    {
        if(command != null)
            command.execute();
        else
            System.out.println("Отсутствует команда!");
    }
}

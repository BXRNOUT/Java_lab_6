package IV;

public class Drone
{
    public void scanArea()
    {
        System.out.println("Идёт сканирование територии . . .\n--Сканирование завершено--");
    }
    public void moveToTarget(String target)
    {
        System.out.println("Движение к объекту: " + target + " . . .\n--Завершено--");
    }
    public void fireWeapon()
    {
        System.out.println("--Выстрел из оружия--");
    }
}

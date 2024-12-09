package V;

public class ConcreteParticle implements Particle
{
    private final String color;
    private final int size;
    private final int intensity;

    public ConcreteParticle(String color, int size, int intensity)
    {
        this.color = color;
        this.size = size < 0 ? 0 : Math.min(size, 999);
        this.intensity = intensity < 0 ? 0 : Math.min(intensity, 100);
    }

    public String toString()
    {
        return ("-----Отображение частицы-----\n" +
                "Размер        ---> " + size + ";\n" +
                "Интенсивность ---> " + intensity + ";\n" +
                "Цвет          ---> " + color + ".\n" +
                "-----------------------------");
    }
}

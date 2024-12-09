package V;

import java.util.HashMap;
import java.util.Map;

public class ParticalFactory
{
    private static final Map<String, ConcreteParticle> particlesColor = new HashMap<>();

    public static ConcreteParticle getParticle(String color, int size, int intensity)
    {
        String key = color + size + intensity;
        ConcreteParticle concreteParticle = particlesColor.get(key);
        if(concreteParticle == null)
        {
            concreteParticle = new ConcreteParticle(color, size, intensity);
            particlesColor.put(key, concreteParticle);
            System.out.println("New particle created!!!");
        }
        return concreteParticle;
    }
}

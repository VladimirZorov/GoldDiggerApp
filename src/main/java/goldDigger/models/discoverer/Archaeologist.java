package goldDigger.models.discoverer;

public class Archaeologist extends BaseDiscoverer{
    private static final double ARCHEOLOGIST_DISCOVERER_ENERGY = 60;
    public Archaeologist(String name) {
        super(name, ARCHEOLOGIST_DISCOVERER_ENERGY);
    }
}

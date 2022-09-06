package goldDigger.models.discoverer;

import goldDigger.models.museum.Museum;

public abstract class BaseDiscovere implements Discoverer{
    private String name;
    private double energy;
    private Museum

    protected BaseDiscovere(String name, double energy) {
        setName(name);
        setEnergy(energy);
    }

    public void setName(String name) {
        if (name==null || name.trim().isEmpty()){
            throw new NullPointerException
                    ("Discoverer name cannot be null or empty.");
        }
        this.name = name;
    }

    public void setEnergy(double energy) {
        if (energy < 0) {
            throw new IllegalArgumentException
                    ("Cannot create Discoverer with negative energy.");
        }
        this.energy = energy;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getEnergy() {
        return 0;
    }

    @Override
    public boolean canDig() {
        return false;
    }

    @Override
    public Museum getMuseum() {
        return null;
    }

    @Override
    public void dig() {

    }
}

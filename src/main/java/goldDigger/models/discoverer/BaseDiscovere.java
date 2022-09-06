package goldDigger.models.discoverer;

import goldDigger.models.museum.Museum;

public abstract class BaseDiscovere implements Discoverer{
    private String name;
    private double energy;

    public BaseDiscovere(String name, double energy) {
        setName(name);
        this.energy = energy;
    }

    public void setName(String name) {
        if (name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException
                    ("Discoverer name cannot be null or empty.");
        }
        this.name = name;
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

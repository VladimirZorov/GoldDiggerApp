package goldDigger.repositories;

import goldDigger.models.discoverer.Discoverer;

import java.util.Collection;

public class DiscovererRepository implements Repository<Discoverer>{

    @Override
    public Collection<Discoverer> getCollection() {
        return null;
    }

    @Override
    public void add(Discoverer entity) {

    }

    @Override
    public boolean remove(Discoverer entity) {
        return false;
    }

    @Override
    public Discoverer byName(String name) {
        return null;
    }
}

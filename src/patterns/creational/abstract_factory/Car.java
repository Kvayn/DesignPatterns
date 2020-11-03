package patterns.creational.abstract_factory;

public abstract class Car {
    private Model model;
    private Location location;

    public Car(Model model, Location location) {
        this.model = model;
        this.location = location;
    }

    public Model getModel() {
        return model;
    }

    public Location getLocation() {
        return location;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    protected abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", location=" + location +
                '}';
    }
}

package patterns.creational.abstract_factory;

public class SmallCar extends Car {

    public SmallCar(Location location) {
        super(Model.SMALL, location);
    }

    @Override
    protected void construct() {
        System.out.println("Building a small car");
    }
}

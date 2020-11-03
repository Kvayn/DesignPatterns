package patterns.creational.abstract_factory;

public class SedanCar extends Car {

    public SedanCar(Location location) {
        super(Model.SEDAN, location);
    }

    @Override
    protected void construct() {
        System.out.println("Building sedan car");
    }
}

package patterns.creational.abstract_factory;

public class LuxuryCar extends Car {
    public LuxuryCar(Location location) {
        super(Model.LUXURY, location);
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
    }
}

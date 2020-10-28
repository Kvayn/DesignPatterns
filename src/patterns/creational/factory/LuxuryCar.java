package patterns.creational.factory;

public class LuxuryCar extends Car{

    public LuxuryCar(){
        super(CarType.LUXURY);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building luxury car");
        // Add accessories
    }
}


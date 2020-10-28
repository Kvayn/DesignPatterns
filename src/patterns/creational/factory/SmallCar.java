package patterns.creational.factory;

public class SmallCar extends Car {

    public SmallCar(){
        super(CarType.SMALL);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building small car");
    }
}

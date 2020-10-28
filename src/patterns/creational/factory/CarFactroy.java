package patterns.creational.factory;

public class CarFactroy {
    public static Car buildcar(CarType model){
        Car car = null;
        switch (model){
            case SMALL:
                car = new SmallCar();
                break;
            case SEDAN:
                car = new SedanCar();
                break;
            case LUXURY:
                car = new LuxuryCar();
                break;
            default:
                // Throw some exception
                break;
        }
        return car;
    }
}

package patterns.creational.abstract_factory;

public class CarFactory {
    public static Car buildCar(Model model){
        // Getting location from external source here, let's pretend
        Location location = Location.DEFAULT;
        Car car = null;
        switch (location){
            case ASIA:
                car = AsiaCarFactory.buildCar(model);
                break;
            case EUROPE:
                car = EuropeCarFactory.buildCar(model);
                break;
            case DEFAULT:
                car = DefaultCarFactory.buildCar(model);
                break;
            default:
                // throw some exception
                break;
        }
        return car;
    }
}

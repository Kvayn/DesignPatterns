package patterns.creational.abstract_factory;

public class EuropeCarFactory {
    public static Car buildCar(Model model){
        Car car = null;
        switch (model){
            case SMALL:
                car = new SmallCar(Location.EUROPE);
                break;
            case SEDAN:
                car = new SedanCar(Location.EUROPE);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.EUROPE);
                break;
            default:
                // throw some exception
                break;
        }
        return car;
    }
}

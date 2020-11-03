package patterns.creational.abstract_factory;

public class Main {
    public static void main(String[] args){
        System.out.println(CarFactory.buildCar(Model.SMALL));
        System.out.println(CarFactory.buildCar(Model.SEDAN));
        System.out.println(CarFactory.buildCar(Model.LUXURY));
    }
}

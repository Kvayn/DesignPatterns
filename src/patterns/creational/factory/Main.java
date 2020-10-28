package patterns.creational.factory;

public class Main {
    public static void main(String[] args){
        System.out.println(CarFactroy.buildcar(CarType.SEDAN));
        System.out.println(CarFactroy.buildcar(CarType.SMALL));
        System.out.println(CarFactroy.buildcar(CarType.LUXURY));
    }
}

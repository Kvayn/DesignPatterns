package patterns.creational.builder_gof;

public class Main {
    public static void main(String[] args){
        // Construct wooden house
        System.out.println(new HouseBuilderDirector(new WoodenHouseBuilder()).construct());

        // Construct concrete house
        System.out.println(new HouseBuilderDirector(new ConcreteHouseBuilder()).construct());

        // test
        System.out.println(new ConcreteHouseBuilder().buildFloor().buildRoof().build());

    }
}

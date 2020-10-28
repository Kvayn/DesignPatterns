package patterns.creational.builder_gof;

public class ConcreteHouseBuilder implements HouseBuilder{
    private House house;

    public ConcreteHouseBuilder() {
        house = new House();
    }

    @Override
    public HouseBuilder buildFloor() {
        house.setFloor("Concrete");
        return this;
    }

    @Override
    public HouseBuilder buildWalls() {
        house.setWalls("Concrete");
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        house.setRoof("Concrete");
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}

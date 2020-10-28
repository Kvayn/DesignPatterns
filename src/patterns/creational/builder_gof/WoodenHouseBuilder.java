package patterns.creational.builder_gof;

public class WoodenHouseBuilder implements HouseBuilder{
    private House house;

    public WoodenHouseBuilder() {
        house = new House();
    }

    @Override
    public HouseBuilder buildFloor() {
        house.setFloor("Wooden");
        return this;
    }

    @Override
    public HouseBuilder buildWalls() {
        house.setWalls("Wooden");
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        house.setRoof("Wooden");
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}

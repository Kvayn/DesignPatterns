package patterns.creational.builder_gof;

public interface HouseBuilder {
    HouseBuilder buildFloor();
    HouseBuilder buildWalls();
    HouseBuilder buildRoof();
    House build();

}

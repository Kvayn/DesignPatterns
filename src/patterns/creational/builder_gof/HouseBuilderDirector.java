package patterns.creational.builder_gof;

public class HouseBuilderDirector {
    private HouseBuilder houseBuilder = null;

    public HouseBuilderDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House construct(){
        return houseBuilder.buildFloor().buildRoof().buildWalls().build();
    }
}

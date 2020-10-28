package patterns.creational.factory;

public abstract class Car {

    private CarType model = null;

    public Car(CarType model) {
        this.model = model;
        arrangeParts();
    }

    private void arrangeParts(){
        // Do one time processing here
    }

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    // Do subclass level processing in this method
    public abstract void construct();
}

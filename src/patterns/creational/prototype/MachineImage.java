package patterns.creational.prototype;

public class MachineImage implements Cloneable {
    StringBuilder image;

    public MachineImage(String os, String sw){
        image = new StringBuilder();
        image.append(os).append(sw);
    }

    public StringBuilder getImage() {
        return image;
    }

    public void install(String sw){
        image.append(sw);
    }

    @Override
    public String toString() {
        return "MachineImage{" +
                "image=" + image +
                '}';
    }

    private MachineImage(String mi){
        image = new StringBuilder(mi);
    }

    @Override
    public MachineImage clone() throws CloneNotSupportedException{
        return new MachineImage(this.image.toString());
    }
}

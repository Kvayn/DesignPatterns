package patterns.creational.singleton;

public class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();

    //Private constructor
    private EagerSingleton(){
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}

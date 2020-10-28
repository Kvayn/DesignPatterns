package patterns.creational.singleton;

public class LazySingleton {
    private static volatile LazySingleton instance = null;

    // Private constructor
    private LazySingleton(){
    }

    public static LazySingleton getInstance(){
        if (instance == null){
            synchronized (LazySingleton.class){
                // Double check
                if (instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}

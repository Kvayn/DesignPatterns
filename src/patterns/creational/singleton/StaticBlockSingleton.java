package patterns.creational.singleton;

public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;
    static{
        try{
            INSTANCE = new StaticBlockSingleton();
        }catch (Exception e){
            throw new RuntimeException("Uffff, i was not expecting this!", e);
        }
    }
    private StaticBlockSingleton(){
    }

    public static StaticBlockSingleton getInstance(){
        return INSTANCE;
    }
}

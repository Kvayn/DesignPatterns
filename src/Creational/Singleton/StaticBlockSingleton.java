package Creational.Singleton;

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

    public StaticBlockSingleton getInstance(){
        return INSTANCE;
    }


}

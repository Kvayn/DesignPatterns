package Creational.Singleton;

import java.io.Serializable;

public class DemoSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    // Private constructor
    private DemoSingleton(){

    }

    private static class DemoSingletonHolder{
        private static final DemoSingleton INSTANCE = new DemoSingleton();
    }

    public static DemoSingleton getInstance(){
        return DemoSingletonHolder.INSTANCE;
    }

    protected Object readResolve(){
        return getInstance();
    }



}

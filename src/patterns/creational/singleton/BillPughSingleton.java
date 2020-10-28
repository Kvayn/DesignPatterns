package patterns.creational.singleton;

public class BillPughSingleton {
    private BillPughSingleton(){
        System.out.println("Constructor");
    }

    private static class LazyHolder{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return  LazyHolder.INSTANCE;
    }
    public static void ping(){
        System.out.println("ping");
    }
}

package patterns.creational.builder;

public class Main {
    public static void main(String[] args){
        User serhii = new User.UserBuilder("Serhii", "Dorodko")
                .age(27)
                .phone("0678888888")
                .address("Home street 1234")
                .build();

        System.out.println(serhii);
    }
}

package patterns.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{

        MachineImage linux = new MachineImage("Linux", "WebServer");
        MachineImage windows = new MachineImage("Windows", "Office");

        System.out.println(linux);
        System.out.println(windows);

        MachineImage webPage = linux.clone();
        webPage.install("OnePageService");

        System.out.println(webPage);

    }
}

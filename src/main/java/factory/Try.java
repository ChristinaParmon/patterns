package factory;

public class Try {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new Lenovo();
        computerFactory.createIntelProcessor();
    }
}

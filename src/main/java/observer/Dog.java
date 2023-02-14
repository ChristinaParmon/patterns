package observer;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " barks");
    }

    public void eat() {
        System.out.println(name + " eats");
    }
}

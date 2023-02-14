package observer;

public class Try {
    public static void main(String[] args) {
        BoneTower foodTower = new BoneTower();
        Dog dog1 = new Dog("Pavel");
        Dog dog2 = new Dog("Nick");

        foodTower.subscribe(dog1::bark);
        foodTower.subscribe(dog2::eat);

        foodTower.fallFood();
    }
}

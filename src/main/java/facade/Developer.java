package facade;

public class Developer {
    public void doWork(Sprint sprint) {
        if (sprint.isActiveSprint()) {
            System.out.println("Developer is working");
        } else {
            System.out.println("Developer is resting");
        }
    }
}

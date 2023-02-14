package facade;

public class Sprint {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is started");
        activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is finished");
        activeSprint = false;
    }
}

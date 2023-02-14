package facade;

public class WorkProcessFacade {
    public WorkProcessFacade() {
        doWorkProcess();
    }

    private final Job job = new Job();
    private final Sprint sprint = new Sprint();
    private final Developer developer = new Developer();

    public void doWorkProcess() {
        job.doJob();
        sprint.startSprint();
        developer.doWork(sprint);
    }

}

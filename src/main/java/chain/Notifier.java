package chain;

public abstract class Notifier {
    private final int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public Notifier setNextNotifier(Notifier nextNotifier)
    {
        this.nextNotifier = nextNotifier;
        return nextNotifier;
    }

    public void notifyManager(String message, int level) {
        if(level >= priority){
            write(message);
        }
        if(nextNotifier != null){
            nextNotifier.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}

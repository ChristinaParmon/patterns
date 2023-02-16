package command;

public class SwithOnCommand implements Command {
    private final Computer computer;

    public SwithOnCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.switchOn();
    }
}

package command;

public class SwitchOffCommand implements Command {
    private final Computer computer;

    public SwitchOffCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.switchOff();
    }
}

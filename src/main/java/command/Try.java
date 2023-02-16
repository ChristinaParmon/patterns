package command;

public class Try {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Command switchUp = new SwithOnCommand(computer);
        Command switchDown = new SwitchOffCommand(computer);

        Invoker invoker = new Invoker(switchUp, switchDown);

        invoker.flipUp();
        invoker.flipDown();
    }
}

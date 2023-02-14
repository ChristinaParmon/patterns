package proxy;

public class SuperExpensiveObjectImpl implements SuperExpensiveObject{

    public SuperExpensiveObjectImpl() {
        expensiveConfiguration();
    }

    @Override
    public void expensiveProcess() {
        System.out.println("Processing is done");
    }

    private void expensiveConfiguration(){
        System.out.println("Loading configuration");
    }
}

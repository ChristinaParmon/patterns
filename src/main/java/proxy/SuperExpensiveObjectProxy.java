package proxy;

public class SuperExpensiveObjectProxy implements SuperExpensiveObject {
    private SuperExpensiveObject superExpensiveObject;

    @Override
    public void expensiveProcess() {
        if (superExpensiveObject == null) {
            superExpensiveObject = new SuperExpensiveObjectImpl();
        }
        superExpensiveObject.expensiveProcess();
    }
}

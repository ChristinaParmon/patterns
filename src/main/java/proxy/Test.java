package proxy;

public class Test {
    public static void main(String[] args) {
        SuperExpensiveObject superExpensiveObject = new SuperExpensiveObjectProxy();
        superExpensiveObject.expensiveProcess();
        superExpensiveObject.expensiveProcess();
    }
}

package observer;

import java.util.ArrayList;
import java.util.List;

public class BoneTower {
    private final List<Action> subscribers = new ArrayList<>();
    public void subscribe(Action object){
        subscribers.add(object);
    }

    public void fallFood(){
        for (Action dog:this.subscribers){
            dog.doSomething();
        }
    }
}

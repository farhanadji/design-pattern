import java.util.ArrayList;
import java.util.List;

public class Subscribe implements SubscribeInterface {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyRegisteredUsers(value);
    }

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void register(Observer anObserver) {
        observerList.add(anObserver);
    }

    @Override
    public void unregister(Observer anObserver) {
        observerList.remove(anObserver);
    }

    @Override
    public void notifyRegisteredUsers(int notifiedValue) {
        for (Observer obs: observerList) {
            obs.update(notifiedValue);
        }
    }
}

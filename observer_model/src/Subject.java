import java.util.HashSet;
import java.util.Observer;
import java.util.Observable;
import java.util.Set;

public abstract class Subject extends Observable {
    Set<Observer> observers = new HashSet<>();
    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
        for (Observer o : observers) {
            o.update(this, null);
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class SmartphoneObservable {
    private List<SmartphoneObserver> observers = new ArrayList<>();

    public void addObserver(SmartphoneObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(SmartphoneObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (SmartphoneObserver observer : observers) {
            observer.update();
        }
    }
}
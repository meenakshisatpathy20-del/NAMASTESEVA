package observer;

import java.util.ArrayList;
import java.util.List;

import notification.INotification;

public class NotificationObservable implements IObservable {

    private List<IObserver> observers;
    private INotification currentNotification;

    public NotificationObservable() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (IObserver observer : observers) {
            observer.update();
        }

    }

    public void setNotification(INotification notification) {

        this.currentNotification = notification;

        notifyObservers();

    }

    public INotification getNotification() {
        return currentNotification;
    }

    public String getNotificationContent() {

        return currentNotification.getContent();

    }

}
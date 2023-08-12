package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StocksObservable iphoneStock = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStock);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("Jiteh@jk.com", iphoneStock);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("op@op.com", iphoneStock);

        iphoneStock.add(observer1);
        iphoneStock.add(observer2);
        iphoneStock.add(observer3);

        iphoneStock.setStockCount(10);
    }
}


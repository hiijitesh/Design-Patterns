package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String emailId, StocksObservable observable){
        this.observable = observable;
        this.userName = emailId;
    }
    @Override
    public void update(){
        sendMessageOnMobile(userName, "Product is in Stock, hurry up!");
    }
    public  void sendMessageOnMobile(String userName,String message ){
        System.out.println("message sent to: "+userName);
    }
}
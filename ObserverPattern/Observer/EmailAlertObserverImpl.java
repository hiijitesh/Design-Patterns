package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }
    @Override
    public void update(){
        sendMessageOnMobile(emailId, "Product is in Stock, hurry up!");
    }
    public  void sendMessageOnMobile(String emailId,String message ){
        System.out.println("message sent to: "+emailId);
    }
}

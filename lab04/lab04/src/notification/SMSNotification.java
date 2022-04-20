package notification;

import notification.Notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("sms");
    }
}

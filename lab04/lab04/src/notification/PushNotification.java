package notification;

import notification.Notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("push");
    }
}

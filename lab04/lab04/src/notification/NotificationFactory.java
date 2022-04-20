package notification;

import notification.EmailNotification;
import notification.Notification;

public class NotificationFactory {
    public static Notification createNotification(String type) throws Exception {
        switch(type){
            case "sms": return new SMSNotification();
            case "email": return new EmailNotification();
            case "push": return new PushNotification();
        }
        throw new Exception();
    }
}

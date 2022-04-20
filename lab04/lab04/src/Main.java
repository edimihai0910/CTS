import copac.Copac;
import copac.PozitieXOY;
import notification.Notification;
import notification.NotificationFactory;

public class Main {
    public static void main(String[] args){
        String type = "sms";
        try {
            Notification notification = NotificationFactory.createNotification(type);
            notification.notifyUser();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Copac copac = new Copac(1, "verde", "mare", 2, 5);
        try {
            Copac clone = copac.clone();
            clone.setPozitieXOY(10,10);
            System.out.println(copac);
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

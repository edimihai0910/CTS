package proxy;
import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet{

    private List<String> blackList = new ArrayList<>();
    private ProviderInternet internet = new ProviderInternet();

    public InternetProxy() {
        this.addToBlackList("abc.com");
    }

    public void addToBlackList(String url){
        blackList.add(url);
    }

    public void removeFromBlackList(String url){
        blackList.remove(url);
    }

    @Override
    public void connectTo(String url) {
        if(blackList.contains(url) == true){
            System.out.println("Conexiune blocata!");
        }else{
            internet.connectTo(url);
        }
    }
}

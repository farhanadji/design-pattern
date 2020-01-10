import java.util.Vector;

public class ProxyInternet implements Internet {
    Vector<String> blockedSite = new Vector<>();
    RealInternet internet;

    public ProxyInternet() {
        blockedSite.add("a.com");
        blockedSite.add("b.com");
        blockedSite.add("c.com");

        internet = new RealInternet();
    }

    @Override
    public void connectTo(String url) {
        for (String block: blockedSite){
            if(block.equals(url)) {
                System.out.println("Cannot access blocked site!");
                return;
            }
        }
            internet.connectTo(url);

    }
}

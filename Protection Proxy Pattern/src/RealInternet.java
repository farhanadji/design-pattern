public class RealInternet implements Internet {
    @Override
    public void connectTo(String url) {
        System.out.println("Connect to : " + url);
    }
}

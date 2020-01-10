public class Main {
    public Main() {
        RealInternet real = new RealInternet();
        System.out.println("-- REAL INTERNET --");
        real.connectTo("a.com");
        real.connectTo("b.com");
        real.connectTo("c.com");

        ProxyInternet proxy = new ProxyInternet();
        System.out.println("-- PROXY INTERNET --");
        proxy.connectTo("a.com");
        proxy.connectTo("b.com");
        proxy.connectTo("c.com");
        proxy.connectTo("haha.com");

    }

    public static void main(String[] args) {
        new Main();
    }
}

public class  Main {
    public Main() {
        ActualImage img = new ActualImage();
        ProxyImage proxyImage = new ProxyImage(img);
        proxyImage.drawImage();
        while(true){
            try {
                Thread.sleep(1000);
                System.out.println("Do something...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}

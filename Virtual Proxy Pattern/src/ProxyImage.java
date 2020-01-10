public class ProxyImage implements Image {
    Image img;

    public ProxyImage(Image img) {
        this.img = img;
    }

    @Override
    public void drawImage() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                img.drawImage();
            }
        });
        thread.start();
    }
}

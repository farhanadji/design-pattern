public class Main {
    public Main() {
        RealStreamVideo real = new RealStreamVideo();
        System.out.println("-- Real Stream --");
        Video vid = real.download("video1.mp4");
        vid.play();

        vid = real.download("video2.mp4");
        vid.play();

        System.out.println("-- Cache Proxy Stream --");
        ProxyStreamVideo proxy = new ProxyStreamVideo();
        Video vidProxy = proxy.download("video1.mp4");
        vidProxy.play();

        vidProxy = proxy.download("video2.mp4");
        vidProxy.play();

        vidProxy = proxy.download("video1.mp4");
        vidProxy.play();
    }

    public static void main(String[] args) {
        new Main();
    }
}

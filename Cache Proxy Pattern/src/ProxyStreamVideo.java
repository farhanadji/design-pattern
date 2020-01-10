import java.util.HashMap;

public class ProxyStreamVideo implements StreamVideo {
    RealStreamVideo realStreamVideo = new RealStreamVideo();
    HashMap<String, Video> cached = new HashMap<>();

    @Override
    public Video download(String url) {
        if(cached.containsKey(url)){
            System.out.println("Load from cache..");
            return cached.get(url);
        }
        Video newVideo = realStreamVideo.download(url);
        cached.put(url, newVideo);
        return newVideo;
    }
}

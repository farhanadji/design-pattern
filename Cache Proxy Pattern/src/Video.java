public class Video {
    private String url;

    public Video(String url) {
        this.url = url;
    }

    public void play(){
        System.out.println("Playing video from : " + url);
    }
}

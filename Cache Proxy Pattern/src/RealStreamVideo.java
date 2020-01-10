public class RealStreamVideo implements StreamVideo {
    @Override
    public Video download(String url) {
         try {
            Thread.sleep(2000);
         }catch (Exception e) {
             e.printStackTrace();
         }
         return new Video(url);
    }
}

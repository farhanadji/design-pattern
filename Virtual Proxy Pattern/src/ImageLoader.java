import java.io.File;
import java.util.Scanner;

public class ImageLoader {
    public static void loadFile(){
        try {
            File obj = new File("Pika.txt");
            Scanner sc = new Scanner(obj);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                Thread.sleep(300);
                System.out.println(data);
            }
            sc.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

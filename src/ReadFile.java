import java.io.*;

/**
 * Created by Leguar on 3/02/2015.
 */
public class ReadFile {
    private String path;

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("stocks.txt");
            PrintWriter pw = new PrintWriter(fw);
            
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }
}

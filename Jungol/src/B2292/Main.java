package B2292;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Long.parseLong(bReader.readLine());
        
        if(n == 1) {
            System.out.println(1);
            return;
        }

        long layer = 1;
        long range = 1;

        while(range < n) {
            range += 6 * layer;
            layer++;
        }
        
        System.out.println(layer);
    }
}
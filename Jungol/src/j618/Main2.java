package j618;
import java.io.*;
import java.util.*;

class P {
    String n;
    int h;
    double w;

    public P(String n, int h, double w) {
        this.n = n;
        this.h = h;
        this.w = w;
    }
}

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        P[] p = new P[5];

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            p[i] = new P(st.nextToken(), Integer.parseInt(st.nextToken()), Double.parseDouble(st.nextToken()));
        }

        Arrays.sort(p, Comparator.comparing(o -> o.n));
        System.out.println("\nname");
        for (P o : p) System.out.printf("%s %d %.1f%n", o.n, o.h, o.w);

        Arrays.sort(p, (a, b) -> Double.compare(b.w, a.w));
        System.out.println("\nweight");
        for (P o : p) System.out.printf("%s %d %.1f%n", o.n, o.h, o.w);
    }
}

package j601;

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int count;
        char[] c = new char[len];
 
        for (int i = 0; i < len; i++) {
            c[i] = str.charAt(i);
        }
 
        for (int i = 0; i < len; i++) {
            count = len - 1 - i;
            for (int j = 0; j < len; j++) {
                if (count == len) {
                    count = 0;
                }
                System.out.print(c[count]);
                count++;
            }
            System.out.println();
        }
    }
}
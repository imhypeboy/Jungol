package b25304;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        int total = 0;
        for(int i = 0; i < B; i++){
            int C, D;
            C = sc.nextInt();
            D = sc.nextInt();
            total += C*D;
        }
        if(A==total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}


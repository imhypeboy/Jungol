package lunch;
import java.util.Scanner;

public class Main3 {
   public static void main(String[]args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      
      sc.close();
      System.out.println(SearchLayer(A));
   }
   
   public static int SearchLayer(int x) {
      int layer=0;
      int an=0;
      for(int i=1;;i++) {
            an=i*(i-1)*3+1; //An=1+(n(n-1)6/2)
            if((x-an)<=0) {
               layer=i;
               break;
         }
      }
      return layer;
   }
}

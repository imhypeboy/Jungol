package j508;

public class Main2 {
    public static void main(String[] args) {
        // case 3.
        String[][] str = {
            { "item", "count", "price" },
            { "pen", "20", "100" },
            { "note", "5", "95" },
            { "eraser", "110", "97" }
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%10s", str[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        // case 2.
        System.out.printf("%10s%10s%10s\n", "item", "count", "price");
        System.out.printf("%10s%10s%10s\n", "pen", "20", "100");
        System.out.printf("%10s%10s%10s\n", "note", "5", "95");
        System.out.printf("%10s%10s%10s\n", "eraser", "110", "97");

        System.out.println();

        // case 1.
        System.out.println("      item      count      price");
        System.out.println("       pen         20        100");
        System.out.println("      note          5         95");
        System.out.println("    eraser        110         97");
    }
}
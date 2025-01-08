package j105;
public class Main {
    public static void main(String[] args) {
        String[][] data = {
                {"Seoul","10,312,545","+91,375"},
                {"Pusan","3,567,910","+5,868"},
                {"Incheon","2,758,296","+64,888"},
                {"Daegu","2,511,676","+17,230"},
                {"Gwangju","1,454,636","+29,774"}
        };

        for (String[] row : data) {
            System.out.printf("%15s%15s%15s\n", row[0], row[1], row[2]);
        }
    }
}

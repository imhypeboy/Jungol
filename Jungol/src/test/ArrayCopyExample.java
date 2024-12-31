package test;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1, 2, 3};
        int[] newIntArray = new int[5];

        // oldIntArray의 값을 newIntArray에 복사
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        // newIntArray의 값을 출력
        for (int i = 0; i < newIntArray.length; i++) {
            System.out.print(newIntArray[i] + " ");
        }
    }
}
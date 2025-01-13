package b10845;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt(); 
        Queue<Integer> queue = new LinkedList<>();
        int back = -1; 

        for (int i = 0; i < N; i++) {
            String command = sc.next();

            switch (command) {
                case "push":
                    back = sc.nextInt();
                    queue.offer(back);
                    break;

                case "pop":
                    sb.append(queue.isEmpty() ? -1 : queue.poll()).append('\n');
                    break;

                case "size":
                    sb.append(queue.size()).append('\n');
                    break;

                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                    break;

                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append('\n');
                    break;

                case "back":
                    sb.append(queue.isEmpty() ? -1 : back).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}

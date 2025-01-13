package b10828;

import java.util.Scanner;
import java.util.Stack;

public class Main2{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String command = in.next();

            switch (command) {
                case "push":
                    stack.push(in.nextInt());
                    break;

                case "pop":
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
                    break;

                case "size":
                    sb.append(stack.size()).append('\n');
                    break;

                case "empty":
                    sb.append(stack.isEmpty() ? 1 : 0).append('\n');
                    break;

                case "top":
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
                    break;
            }
        }

        System.out.println(sb);
    }
}

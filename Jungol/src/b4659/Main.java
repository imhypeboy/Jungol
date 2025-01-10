package b4659;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        while (true) {
            String password = sc.nextLine();

            if (password.equals("end")) {
                break;
            }

            if (isValidPassword(password, vowels)) {
                System.out.println("<" + password + "> is acceptable.");
            } else {
                System.out.println("<" + password + "> is not acceptable.");
            }
        }

        sc.close();
    }

    public static boolean isValidPassword(String password, List<Character> vowels) {
        boolean hasVowel = false;
        int consecutiveVowels = 0;
        int consecutiveConsonants = 0;
        char prevChar = '\0';

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);

            if (vowels.contains(currentChar)) {
                hasVowel = true;
                consecutiveVowels++;
                consecutiveConsonants = 0;
            } else {
                consecutiveVowels = 0;
                consecutiveConsonants++;
            }

            if (consecutiveVowels >= 3 || consecutiveConsonants >= 3) {
                return false;
            }

            if (currentChar == prevChar && currentChar != 'e' && currentChar != 'o') {
                return false;
            }

            prevChar = currentChar;
        }

        return hasVowel;
    }
}


/*회사 FnordCom은 그런 패스워드 생성기를 만들려고 계획중이다. 당신은 그 회사 품질 관리 부서의 직원으로 생성기를 테스트해보고 생성되는 패스워드의 품질을 평가하여야 한다. 높은 품질을 가진 비밀번호의 조건은 다음과 같다.

모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
이 규칙은 완벽하지 않다;우리에게 친숙하거나 발음이 쉬운 단어 중에서도 품질이 낮게 평가되는 경우가 많이 있다.

입력
입력은 여러개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 테스트할 패스워드가 주어진다.

마지막 테스트 케이스는 end이며, 패스워드는 한글자 이상 20글자 이하의 문자열이다. 또한 패스워드는 대문자를 포함하지 않는다. */
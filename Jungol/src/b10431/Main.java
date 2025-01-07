package b10431;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt(); // 테스트 케이스의 수

        for (int t = 0; t < P; t++) {
            int testCaseNumber = sc.nextInt(); // 테스트 케이스 번호
            int[] heights = new int[20]; // 학생들의 키를 저장할 배열
            for (int i = 0; i < 20; i++) {
                heights[i] = sc.nextInt();
            }

            int moves = 0; // 뒤로 물러난 걸음 수의 총합
            int[] line = new int[20]; // 줄을 서는 학생들의 배열
            int lineSize = 0; // 줄의 현재 크기

            for (int i = 0; i < 20; i++) {
                int currentHeight = heights[i];
                int insertPos = lineSize; // 기본적으로 맨 뒤에 서는 위치
                for (int j = 0; j < lineSize; j++) {
                    if (line[j] > currentHeight) { // 자신보다 키가 큰 학생을 발견하면
                        insertPos = j;
                        break;
                    }
                }

                // 뒤로 물러난 걸음 수 계산
                moves += lineSize - insertPos;

                // 현재 학생을 줄에 삽입
                for (int j = lineSize; j > insertPos; j--) {
                    line[j] = line[j - 1];
                }
                line[insertPos] = currentHeight;
                lineSize++;
            }

            System.out.println(testCaseNumber + " " + moves);
        }

        sc.close();
    }
}
/* 초등학교 선생님 강산이는 아이들을 데리고 단체로 어떤 일을 할 때 불편함이 없도록 새로 반에 배정받은 아이들에게 키 순서대로 번호를 부여한다. 
 번호를 부여할 땐 키가 가장 작은 아이가 1번, 그 다음이 2번, ... , 가장 큰 아이가 20번이 된다. 강산이네 반 아이들은 항상 20명이며, 
 다행히도 같은 키를 가진 학생은 한 명도 없어서 시간이 조금 지나면 아이들은 자기들의 번호를 인지하고 한 줄로 세우면 제대로 된 위치에 잘 서게 된다.
 

하지만 매년 첫 며칠간 강산이와 강산이네 반 아이들은 자기가 키 순으로 몇 번째인지 잘 알지 못해 아주 혼란스럽다. 자기 위치를 찾지 못하는 아이들을 위해 강산이는 특별한 방법을 생각해냈다.

우선 아무나 한 명을 뽑아 줄의 맨 앞에 세운다. 그리고 그 다음부터는 학생이 한 명씩 줄의 맨 뒤에 서면서 다음 과정을 거친다.

자기 앞에 자기보다 키가 큰 학생이 없다면 그냥 그 자리에 서고 차례가 끝난다.
자기 앞에 자기보다 키가 큰 학생이 한 명 이상 있다면 그중 가장 앞에 있는 학생(A)의 바로 앞에 선다. 이때, A부터 그 뒤의 모든 학생들은 공간을 만들기 위해 한 발씩 뒤로 물러서게 된다.
이 과정을 반복하면 결국 오름차순으로 줄을 설 수가 있다.

아이들의 키가 주어지고, 어떤 순서로 아이들이 줄서기를 할 지 주어진다. 위의 방법을 마지막 학생까지 시행하여 줄서기가 끝났을 때 학생들이 총 몇 번 뒤로 물러서게 될까?

#입력
첫 줄에 테스트 케이스의 수 P (1 ≤ P ≤ 1000) 가 주어진다.

각 테스트 케이스는 테스트 케이스 번호 T와 20개의 양의 정수가 공백으로 구분되어 주어진다.

20개의 정수는 줄서기를 할 아이들의 키를 줄서기 차례의 순서대로 밀리미터 단위로 나타낸 것이다.

모든 테스트 케이스는 독립적이다.

#출력
각각의 테스트 케이스에 대해 테스트 케이스의 번호와 학생들이 뒤로 물러난 걸음 수의 총합을 공백으로 구분하여 출력한다. */
package programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * K번째 수
 */
public class KthNumber {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        // solution
        int[] result = solution(array, commands);
        System.out.println("result:" + Arrays.toString(result));

        // other solution
        int[] other = otherSolution(array, commands);
        System.out.println("result:" + Arrays.toString(other));
    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];    // commands 길이만큼 초기화

        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();    // 임시 ArrayList
            // command의 0번과 1번 배열 크기만큼 For문
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                temp.add(array[j]);
            }
            Collections.sort(temp); // ArrayList asc

            answer[i] = temp.get(commands[i][2] - 1); // command의 3번 배열 크기 위치 add
        }
        return answer;
    }

    private static int[] otherSolution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    }

}

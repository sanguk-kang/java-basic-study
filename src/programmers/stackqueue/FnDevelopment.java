package programmers.stackqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FnDevelopment {
    public static void main(String[] args) {

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

//        int[] progresses = {95, 90, 99, 99, 80, 99};
//        int[] speeds = {1, 1, 1, 1, 1, 1};

        int[] result = solution(progresses, speeds);

    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        // 1. 기간 산정
        int[] workDay = new int[progresses.length];
        for (int i=0;i<progresses.length;i++) {
            int tempDay = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            workDay[i] = tempDay;
        }
        System.out.println(Arrays.toString(workDay)); // 7,3,9

        // 2. 배포 갯수
        ArrayList<Integer> tempArray = new ArrayList<>();
//        ArrayList<Integer> tempArray = Stream.of(workDay).toArray(ArrayList<Integer>::new);
//        tempArray = Stream.of(workDay).toArray(ArrayList<Integer>::new);

        return answer;
    }
}

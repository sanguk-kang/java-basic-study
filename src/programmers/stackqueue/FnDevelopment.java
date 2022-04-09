package programmers.stackqueue;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 기능개발
 */
public class FnDevelopment {
    public static void main(String[] args) {

//        int[] progresses = {95,95,95,95};
//        int[] speeds = {4,3,2,1};

//        int[] progresses = {93, 30, 55};
//        int[] speeds = {1, 30, 5};

        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        int[] result = solution(progresses, speeds);
        System.out.println("result:" + Arrays.toString(result));

    }


    public static int[] solution(int[] progresses, int[] speeds) {
        // 1. 기간 산정
        int[] workDay = new int[progresses.length];
        for (int i=0;i<progresses.length;i++) {
            if (progresses[i] >= 100) break;
            // 100 % 기준 기간 산정하기
            int tempDay = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            workDay[i] = tempDay;
        }
//        System.out.println("proccess data: " + Arrays.toString(workDay));

        // 2. 배포 갯수
        ArrayList<Integer> tempArray = new ArrayList<>();
        for (int i=0; i<workDay.length; i++) {
            int temp = 1;
            if (workDay[i] == 0) continue;  // 작업일 0일 제외
            for (int j=i+1; j<workDay.length;j++) {
                if (workDay[i] >= workDay[j]) {
                    workDay[j] = 0; // 작업 대기 0으로 변경
                    temp ++;        // 배포 대기 건수
                } else {
                    break;
                }
            }
            tempArray.add(temp);
        }
        int[] answer = new int[tempArray.size()];
        answer = tempArray.stream().mapToInt(i->i).toArray();

        return answer;
    }


}

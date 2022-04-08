package programmers.lv1;

import java.util.Arrays;

public class GymSuit {
    public static void main(String[] args) {
//        int n = 5;
//        int[] lost = {2, 4};
//        int[] reserve = {1, 3, 5};

        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3, 1};

//        int n = 5;
//        int[] lost = {1, 5};
//        int[] reserve = {2, 4};

//        int n = 5;
//        int[] lost = {2, 4};
//        int[] reserve = {3};

//        int n = 3;
//        int[] lost = {3};
//        int[] reserve = {1};

        int result = solution(n, lost, reserve);
        System.out.println("result: " + result);
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int check = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 중복 제거
        // 중복 값 -1 변환, check 변수로 빌려간 데이터 확인
        for (int i=0;i<lost.length;i++) {
            for (int j=0;j<reserve.length;j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    check++;
                    break;
                }
            }
        }

        // 체육복 확인
        for (Integer num : lost) {
            if (num > 0) {
                for (int i=0;i<reserve.length;i++) {
                    if (num-1 == reserve[i] || num+1 == reserve[i] ) {
                        check++;            // check 변수로 빌려간 데이터 확인
                        reserve[i] = -1;    // 빌려간 번호 -1로 변환
                        break;
                    }
                }
            }
        }

        // 전체 - (도난 체육복 - 빌려준 체육복)
        answer = n-(lost.length-check);

        return answer;
    }
}

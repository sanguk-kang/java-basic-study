package programmers.lv1;

import java.util.ArrayList;

public class AddMeasure {
    public static void main(String[] args) {
//        int left = 13;
//        int right = 17;
        int left = 24;
        int right = 27;

        int result = solution(left, right);
        System.out.println("result: " + result);

    }

    public static int solution(int left, int right) {
        int answer = 0;
        ArrayList<Integer> data = new ArrayList();
        for (int i = left; i <= right; i++) {
            // 합산할 숫자 추가
            data.add(setNumber(i, findNumberCnt(i)));
        }
        // 배열 전체 sum
        answer = data.stream().mapToInt(Integer::intValue).sum();

        return answer;
    }

    /**
     * 양수 음수 구분하기
     * @param num
     * @param cnt
     * @return
     */
    private static int setNumber(int num, int cnt) {
        if (cnt % 2 == 0) {
            // 양수
            return num * 1;
        } else {
            // 음수
            return num * -1;
        }
    }

    /**
     * 약수 갯수 구하기
     * @param num
     * @return
     */
    private static int findNumberCnt(int num) {
        int cnt = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                cnt++;
            }
        }
        return cnt;
    }

}

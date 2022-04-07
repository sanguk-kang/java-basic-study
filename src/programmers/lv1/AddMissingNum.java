package programmers.lv1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class AddMissingNum {
    public static void main(String[] args) {

//        int[] num = {1,2,3,4,6,7,8,0};
        int[] num = {5,8,4,0,6,7,9};

        int result = solution(num);
        System.out.println("result: " + result);

    }

    public static int solution(int[] numbers) {
        int answer = 0;
        int all_num = 9;
        ArrayList<Integer> arrayNum = new ArrayList<>();
        for (int i=0;i<=all_num;i++) {
            // 숫자 존재여부 확인
            if (!getChecked(numbers, i)) {
                arrayNum.add(i);    // 없는 숫자 ArrayList 추가
            }
        }

        // ArrayList Sum
        answer = arrayNum.stream().mapToInt(Integer::intValue).sum();

        return answer;
    }

    public static boolean getChecked(int[] numbers, int temp) {
        return IntStream.of(numbers).anyMatch(n -> n == temp);
    }
}

package programmers.lv1;

import java.util.*;

/**
 * 두개 뽑아서 더하기
 */
public class AddTwoNum {

    public static void main(String[] args) {

        int[] numbers = {2,1,3,4,1};
        int[] result = solution(numbers);
        System.out.println("result : " + Arrays.toString(result));

    }


    public static int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> array = new ArrayList<>();
        // 전체 데이터 sum
        for (int i=0;i<numbers.length;i++) {
            for (int j=i+1;j<numbers.length;j++) {
                int addNum = numbers[i] + numbers[j];
                array.add(addNum);
            }
        }

        // 전체 데이터 중복제거, 정렬
        answer = array.stream()
                .distinct()
                .sorted()
                .mapToInt(i -> i)
                .toArray();

        return answer;
    }

}

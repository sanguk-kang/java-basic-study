package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 같은 숫자는 싫어
 */
public class NoSameNumber {
    public static void main(String[] args) {

//        int[] arr = {1,1,3,3,0,1,1};
        int[] arr = {4,4,4,3,3};

        int[] result = solution(arr);

        System.out.println(Arrays.toString(result));

    }

    public static int[] solution(int []arr) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList();
        for (int i=0;i<arr.length;i++) {
            if (i==0 || list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
            }
        }
        answer = list.stream().mapToInt(i->i).toArray();

        return answer;
    }
}

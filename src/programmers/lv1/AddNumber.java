package programmers.lv1;

import java.util.ArrayList;

/**
 * 음양 더하기
 */
public class AddNumber {

    public static void main(String[] args) {

        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

//        int[] absolutes = {1,2,3};
//        boolean[] signs = {false,false,true};

        int result = solution(absolutes, signs);
        System.out.println("result: " + result);

    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < absolutes.length; i++) {
            list.add(checkNum(absolutes[i], signs[i]));
        }

        answer = list.stream().mapToInt(n -> n).sum();

        return answer;
    }

    private static int checkNum(int absolute, boolean sign) {
        if (sign) {
            return absolute * 1;
        } else {
            return absolute * -1;
        }
    }

}

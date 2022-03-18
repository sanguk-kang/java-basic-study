package programmers;

import java.util.*;

public class BigNumber {
    public static void main(String[] args) {
        int[] array = new int[]{3, 30, 34, 5, 9};
        String result = solution(array);
        String result2 = otherSolution(array);

        System.out.println("result:" + result);
        System.out.println("result2:" + result2);

    }

    public static String solution(int[] numbers) {
        String answer = "";
        String[] temp = new String[numbers.length];

        // String 변환
        for (int i=0;i<numbers.length;i++) {
            temp[i] =  String.valueOf(numbers[i]);
        }
        // 문자열 내림차순
        Arrays.sort(temp, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        // 000 연속인 경우 0 리턴
        if (temp[0].equals("0")) return "0";

        // String[] -> String 변환
        answer = String.join("",temp);

        return answer;
    }

    public static String otherSolution(int[] numbers) {
        String answer = "";

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, (a, b) -> {
            String as = String.valueOf(a), bs = String.valueOf(b);
            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
        });
        StringBuilder sb = new StringBuilder();
        for(Integer i : list) {
            sb.append(i);
        }
        answer = sb.toString();
        if(answer.charAt(0) == '0') {
            return "0";
        }else {
            return answer;
        }
    }

}


package study;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        int[] num = {5, 1, 3, 4, 2};

        for (int i=0; i < num.length; i++) {
            for (int j=0; j < num.length - i - 1; j++) {
                if (num[j] > num[j+1]) {    // 내림 차순인 경우 부등호 반대
                    sorting(num, j, j+1);
                }
            }
        }

        // 확인
        System.out.println(Arrays.toString(num));

    }

    private static void sorting(int[] num, int max, int j) {
        int temp = num[max];
        num[max] = num[j];
        num[j] = temp;
    }

}

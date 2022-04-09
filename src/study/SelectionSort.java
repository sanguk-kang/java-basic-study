package study;

import java.util.Arrays;

/**
 * 선택 정렬
 */
public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Selection Sort");
        int[] num = {5, 1, 21, 3, 4, 2, 32, 55};
        int min;    // 최소값


        for (int i=0; i < num.length; i++) {
            min = i;
            for (int j=i+1;j < num.length; j++) {
                if (num[min] > num[j]) {
                    min = j;
                }
            }
            sorting(num, min, i);
        }

        System.out.println(Arrays.toString(num));

    }

    private static void sorting(int[] num, int min, int j) {
        int temp;
        temp = num[min];
        num[min] = num[j];
        num[j] = temp;
    }

}

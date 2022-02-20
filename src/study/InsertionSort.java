package study;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {5,3,8,1,2,7};

        for (int i=1;i<list.length;i++) {   // key 2번째 부터 시작
            int key = i;    // key index 위치
            for (int j=i-1; j>=0; j--) {    // 왼쪽 내용 확인
                if (list[key] < list[j]) {
                    // 배열 위치 변경
                    sorting(list, key, j);
                    key = j;    // key 이동 위치 변경
                }
            }

        }

        System.out.println(Arrays.toString(list));
    }

    private static void sorting(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

}

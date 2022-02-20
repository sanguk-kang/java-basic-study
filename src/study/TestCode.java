package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TestCode {
    public static void main(String[] args) {

        Point[] A = {new Point(1,1), new Point(2,2), new Point(3,3)}; // 원래 배열

        Point[] B = A.clone(); // B : clone() 사용

        Point[] C = new Point[A.length]; // C : arraycopy() 사용
        System.arraycopy(A, 0, C, 0, A.length);

        B[0] = new Point(999,999);
        System.out.println("[얕은 복사] B 배열의 값 ("+B[0].x+"), A 배열의 값!("+A[0].x+")");

        C[0] = new Point(777,777);
        System.out.println("[얕은 복사] C 배열의 값 ("+C[0].x+"), A 배열의 값!("+A[0].x+")");

    }

    static class Point{ // 좌표계 점 객체 (x,y)
        int x, y;
        public Point(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
}

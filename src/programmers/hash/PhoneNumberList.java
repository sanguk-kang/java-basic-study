package programmers.hash;

import java.util.Arrays;

/**
 * 전화번호 목록
 */
public class PhoneNumberList {

    public static void main(String[] args) {

//        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book = {"123","456","789"};
//        String[] phone_book = {"12","123","1235","567","88"};

        Boolean result = solution(phone_book);
        System.out.println("result : " + result);

    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i=0;i<phone_book.length-1;i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}

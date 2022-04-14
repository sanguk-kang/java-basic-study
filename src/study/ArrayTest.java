package study;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        // 2~4 글자
        // 띄어쓰기 없음
        // 숫자 없음
        // 앞글자 '강' 이면서 '상' 포함
        // 한글만
        // 중복 제거
        // 특수기호 없음
        // 오름차순 정렬
        String[] groups = {"강상욱", "강상욱", "강상우기", "강욱상", "욱상강", "유재석", "마이클조단", "소녀시대", "슈퍼주니어", "쿨", "강상 욱", " 강상욱", "강상욱2", "강상욱강상욱", "강상욱e", "강상욱@", "kangsanguk", "1234"};
        String[] result = solution(groups);
        System.out.println("result: " + Arrays.toString(result));

    }

    public static String[] solution(String[] groups) {
        String[] result = {};

        result = Arrays.stream(groups)
                .filter(s -> !s.contains(" ") &&
                        checkLength(s) &&
                        s.startsWith("강") &&
                        s.contains("상") &&
                        checkStr(s))
                .distinct()
                .map(s -> s.replace("강", "깡"))
                .sorted()
                .toArray(String[]::new);

        return result;
    }

    private static boolean checkStr(String str) {
        // 한글 영어 숫자만 가능: str.matches("^[ㄱ-ㅎ가-힣a-zA-Z0-9]*$")
        // 한글만 가능: str.matches("^[ㄱ-ㅎ가-힣]*$")
        // 영어만 가능: str.matches("^[a-zA-Z]*$")
        // 숫자만 가능: str.matches("^[0-9]*$")
        return str.matches("^[ㄱ-ㅎ가-힣]*$");
    }

    private static boolean checkNumber(String str) {
        return str.matches(".*\\d.*");
    }

    private static boolean checkLength(String str) {
        if (str.length() >= 2 && str.length() <= 4) {
            return true;
        }
        return false;
    }
}

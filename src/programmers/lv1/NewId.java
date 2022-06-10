package programmers.lv1;

public class NewId {
    public static void main(String[] args) {
        String newId = "...!@BaT#*..y.abcdefghijklm";
//        String newId = "123_.def";
        String result = solution(newId);

        System.out.println("result : " + result);
    }

    public static String solution(String new_id) {
        String answer = "";
        // 길이
        if (new_id.length() >= 1 && new_id.length() <= 1000) {
            // 소문자
            answer = new_id.toLowerCase();
            // 특수문자 제거
            String match = "[^0-9a-z._-]";
            answer = answer.replaceAll(match, "");
            // 마침표 중복
            answer = answer.replaceAll("[.]{2,}", ".");
            // 앞 뒤 마침표 제거
            answer = answer.replaceAll("^[.]|[.]$", "");
            // 빈문자열 변환
            if (answer.equals("")) {
                answer = "a";
            }
            // 아이디 길이 15
            if (answer.length() >= 16 ) {
                answer = answer.substring(0, 15);
                answer = answer.replaceAll("[.]$", "");
            }
            // 문자열 반복
            if (answer.length() <= 2) {
                for (int i=answer.length(); i<=2; i++) {
                    answer = answer + answer.substring(answer.length()-1);
                }
            }

        }

        return answer;
    }

}

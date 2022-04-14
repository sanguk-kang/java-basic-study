package study;

public class TestCode {
    public static void main(String[] args) {

        String[] birth = {"1901-02-28"};
        int result = solution(birth);
        System.out.println("result: " + result);

    }

    public static int solution(String[] birth) {
        int answer = 0;

        for (String str : birth) {
            String yyyy = str.substring(0, 4);
            String mm = str.substring(5, 7);
            System.out.println(yyyy + "-" + mm);
        }


        return answer;
    }
}

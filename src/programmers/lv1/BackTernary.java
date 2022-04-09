package programmers.lv1;

public class BackTernary {

    public static void main(String[] args) {
//        int n = 45;
        int n = 125;

        int result = solution(n);
        System.out.println("result: " + result);

    }

    public static int solution(int n) {
        int answer = 0;

        // 3진법
        String convert = "";
        while (n > 0) {
            convert = (n % 3) + convert;
            n /= 3;
        }

        // 뒤집기
        StringBuffer sb = new StringBuffer(convert);
        String reConvert = sb.reverse().toString();

        // 10 진법
        answer = Integer.parseInt(reConvert, 3);

        return answer;
    }
}

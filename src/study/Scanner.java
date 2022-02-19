package study;

public class Scanner {
    public static void main(String[] args) {
        System.out.println("basic test");
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // scanner
        System.out.println("문자열 입력하세요.");
        String name = sc.next();
        System.out.println("입력 문자열:" + name);
        System.out.println("첫번째 문자열 : " + name.charAt(0));

        // data type
        System.out.println("숫자를 입력하세요.");
        int num = sc.nextInt();
        System.out.println("입력 숫자:" + num);
        System.out.println("소수점 입력하세요.");
        double dNum = sc.nextDouble();
        System.out.println("입력 소수점:" + dNum);

        // next line
        System.out.println("공백 포함 문자를 입력하세요.");
        String buffer = sc.nextLine();
        System.out.println("문자 입력:" + buffer);
    }
}

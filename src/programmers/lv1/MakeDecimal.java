package programmers.lv1;

public class MakeDecimal {
    public static void main(String[] args) {

//        int[] nums = {};
//        int [] nums = {1,2,3,4};
        int [] nums = {1,2,7,6,4};
        int result = solution(nums);

        System.out.println("result: " + result);

    }

    public static int solution(int[] nums) {
        int answer = 0;

        // 3자리 숫자 전체 숫자 더하기
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                for (int k=j+1;k<nums.length;k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    // 소수 판단
                    answer += isPrime(sum) ? 1 : 0;
                }
            }
        }

        return answer;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

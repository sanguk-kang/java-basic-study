package programmers.hash;

import java.util.*;

/**
 * 완주하지 못한 선수
 */
public class Marathon {
    public static void main(String[] args) {

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};

        String result = solution(participant, completion);
        System.out.println("result:" + result);

    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> temp = new HashMap<>();

        // HashMap <이름, 1> 만약 동일한 이름인 경우 + 1
        for (String name : participant)
        {
            temp.put(name, temp.getOrDefault(name, 0) + 1);
        }

        // 완주 이름 -1
        for (String name : completion) {
            temp.put(name, temp.get(name) - 1);
        }

        // 횟수가 0보다 큰 첫번째 이름 출력
        Optional<String> names = Optional.of(temp.entrySet().stream()
                .filter(s -> s.getValue() > 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(""));
        answer = names.get();

        return answer;
    }
}

package study;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {

        System.out.println("test1 : " + getLocalDate());

    }

    /**
     * java.time.LocalDate
     * @return
     */
    private static String getLocalDate() {
        String result = "";

        // 현재 날짜 구하기 (시스템 시간)
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // 현재 날짜 구하기 (지역)
        LocalDate zone = LocalDate.now(ZoneId.of("Asia/Seoul"));
        System.out.println(zone);

        // 포맷 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(now.format(formatter));

        // 날짜 + 시간
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime allNow = LocalDateTime.now();
        System.out.println(allNow.format(dtFormatter));

        // 시간
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime.format(timeFormatter));

        // String -> 날짜 변환
        // DateTimeFormatter.ISO_DATE -> yyyy-MM-dd
        DateTimeFormatter test = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate dateType = LocalDate.parse("20220413", test);
        System.out.println(dateType);

        // 날짜 구분하기
        int year = allNow.getYear(); // 연도
        String month = allNow.getMonth().toString();   // 월(문자열)
        int monthValue = allNow.getMonthValue();   // 월(숫자)
        int dayOfMonth = allNow.getDayOfMonth();   // 일(월 기준)
        int dayOfYear = allNow.getDayOfYear();     // 일(연 기준)
        String dayOfWeek = allNow.getDayOfWeek().toString();   // 요일(문자)
        int dayOfWeekValue = allNow.getDayOfWeek().getValue(); // 요일(숫자)
        int hour = allNow.getHour();       // 시
        int minute = allNow.getMinute();   // 분
        int second = allNow.getSecond();   // 초


        System.out.println("전체 시간: " + allNow);
        System.out.println("연도: " + year);
        System.out.println("월(문자열): " + month);
        System.out.println("월(숫자): " + monthValue);
        System.out.println("일(월 기준): " + dayOfMonth);
        System.out.println("일(연 기준): " + dayOfYear);
        System.out.println("요일(문자): " + dayOfWeek);
        System.out.println("요일(숫자) : " + dayOfWeekValue);
        System.out.println("시간: " + hour + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second));



        return result;
    }
}

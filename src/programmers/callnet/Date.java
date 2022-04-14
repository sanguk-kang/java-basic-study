package programmers.callnet;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ValueRange;
import java.util.Arrays;

public class Date {
    public static void main(String[] args) {
        String[] birth = {"1899-13-31", "19001231", "2001-09-04", "1900-02-29", "2021-5-31", "1950-11-30", "1996-02-29", "1999-11-31", "2000-02-29"};

//        String[] birth = {"-2019-12-29-", "1945--10-31", "----------", "20000-123-567"};
//        String[] birth = {"1901-02-28"};
        int result = solution(birth);
        System.out.println("result: " + result);
    }

    public static int solution(String[] birth) {
        int answer = 0;

        Arrays.sort(birth);
        for (String str : birth) {
            if (checkDateFormat(str)) {
                try {
                    LocalDate date = LocalDate.parse(str);
                    if (checkBirth(date.getYear(), date.getMonthValue(), date.getDayOfMonth())) {
                        answer++;
                    }
                } catch (Exception e) {
                    // skip
                }

            }
        }

        return answer;
    }

    private static boolean checkBirth(int yyyy, int mm, int dd) {
        boolean result = false;

        if (isDateRange(1900, 2021, yyyy) &&
                isDateRange(1, 12, mm) &&
                checkDay(yyyy, mm, dd)) {
            result = true;
        }

        return result;
    }

    private static boolean checkDay(int yyyy, int mm, int dd) {
        if (mm == 1 || mm == 3|| mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
            if (isDateRange(1, 31, dd)) return true;
        } else if (mm == 4 || mm == 6|| mm == 9 || mm == 11 ) {
            if (isDateRange(1, 30, dd)) return true;
        } else if (mm ==2){
            if (yyyy % 400 == 0 || (yyyy % 4 == 0 && yyyy % 100 != 0)) {
                if (isDateRange(1, 29, dd)) return true;
            } else {
                if (isDateRange(1, 28, dd)) return true;
            }
        } else {
            return false;
        }
        return false;
    }

    private static boolean isDateRange(int min, int max, int val) {
        ValueRange range = ValueRange.of(min, max);
        return range.isValidIntValue(val);
    }

    /**
     *
     * @param checkDate
     * @return
     */
    private static boolean checkDateFormat(String checkDate) {
        try {
            if (checkDate.length() != 10) return false;
            SimpleDateFormat dateFormatParser = new SimpleDateFormat("yyyy-MM-dd");
            dateFormatParser.setLenient(false);
            dateFormatParser.parse(checkDate);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

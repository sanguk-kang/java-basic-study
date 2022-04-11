package programmers.cj;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

//        String[] birth = {"1899-13-31", "19001231", "2001-09-04", "1900-02-29", "2021-5-31", "1950-11-30", "1996-02-29", "1999-11-31", "2000-02-29"};

        String[] birth = {"-2019-12-29-", "1945--10-31", "----------", "20000-123-567"};
        int result = solution(birth);
        System.out.println("result: " + result);

    }

    public static int solution(String[] birth) {
        int answer = 0;

        SimpleDateFormat dateFormatParser = new SimpleDateFormat("yyyy-MM-dd");

        for (String str: birth) {
            // yyyy-mm-dd
            if (checkDateFormat(str)) {
                System.out.println(">>");
                if (checkDate(str)) {
                    answer++;
                }
            }
        }

        return answer;
    }

    private static boolean checkDate(String str) {
        boolean result = false;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(str);
            int getYear = date.getYear()+1900;
            int getMonth = date.getMonth()+1;
            int getDate = date.getDate();

            if (getYear >= 1900 && getYear <= 2021) {
                if (getMonth >= 1 && getMonth <= 12) {
                    if (checkDay(getYear, getMonth, getDate)) {
                        //성공
                        result = true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }

        return result;
    }

    private static boolean checkDay(int yy, int mm, int dd) {
        boolean result = false;
        if (mm == 1 || mm == 3|| mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
            if (dd >= 1 && dd <= 31) {
                result = true;
            }
        } else if (mm == 4 || mm == 6|| mm == 9 || mm == 11 ) {
            if (dd >= 1 && dd <= 30) {
                result = true;
            }
        } else {
            if (yy % 400 == 0 || (yy % 4 == 0 && yy % 100 != 0)) {
                if (dd >= 1 && dd <= 29) {
                    result = true;
                }
            } else {
                if (dd >= 1 && dd <= 28) {
                    result = true;
                }
            }
        }

        return result;
    }



    private static boolean checkDateFormat(String checkDate) {
        try {
            if (checkDate.length() != 10) {
                return false;
            }
            SimpleDateFormat dateFormatParser = new SimpleDateFormat("yyyy-MM-dd");
            dateFormatParser.setLenient(false);
            dateFormatParser.parse(checkDate);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

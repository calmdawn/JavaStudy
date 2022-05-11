package sub2_print_mydate;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String isValid() {
        boolean isCheck;

        if (month < 1 || month > 12 || year < 1) { //  월, 년 유효성 검사
            isCheck = false;
        } else {
            isCheck = true;
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day < 1 || day > 31)  // 31일인 월
                    isCheck = false;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day < 1 || day > 30)  // 30일인 월
                    isCheck = false;
            } else {  // 2월 윤년에 따라 28일 또는 29일
                if(year % 4 == 0){  // 윤년인 경우
                    if (day < 1 || day > 29)
                        isCheck = false;
                }else{  // 윤년이 아닌 경우
                    if (day < 1 || day > 28)
                        isCheck = false;
                }
            }
        }

        if (isCheck) {
            return year + "년 " + month + "월 " + day + "일은 유효한 날짜입니다";
        }
        return year + "년 " + month + "월 " + day + "일은 유효하지 않은 날짜입니다";
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

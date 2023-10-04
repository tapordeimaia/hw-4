package ex2;

public enum DaysWeek {
    MONDAY(true), TUESDAY(true), WEDNESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false), SUNDAY(false);
    boolean isWeekDay;
    DaysWeek(boolean weekday){
        isWeekDay = weekday;
    }
    public boolean isWeekDay(){
        return isWeekDay;
    }
    public boolean isHoliday(){
        return !isWeekDay;
    }
}

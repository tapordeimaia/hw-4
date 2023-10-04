package ex2;

public enum Weekdays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public boolean isWeekDay(){
        if (Weekdays.MONDAY || Weekdays.TUESDAY || Weekdays.WEDNESDAY || Weekdays.THURSDAY || Weekdays.FRIDAY){
            return true;
        }else{
            return false;
        }
    }
    public boolean isHoliday(Weekdays a){
        if (a==SATURDAY || a==SUNDAY){
            return true;
        }else{
            return false;
        }
    }
}

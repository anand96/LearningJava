package ENUMS;

public enum Days {
    MONDAY(101, "1st Day"),
    TUESDAY(102, "2nd Day"),
    WEDNESDAY(103, "3rd Day"),
    THURSDAY(104, "4th Day"),
    FRIDAY(105, "5th Day"),
    SATURDAY(106, "6th Day"),
    SUNDAY(107, "7th Day");

    private int val;
    private String comment;

    public int getVal() {
        return val;
    }

    public String getComment() {
        return comment;
    }

    Days(int val, String comment)
    {
        this.val = val;
        this.comment = comment;
    }

    public static Days getDaysFromValue(int value){
        for(Days day : Days.values())
        {
            if(day.val == value) {
                return day;
            }
        }
        return null;
    }



}
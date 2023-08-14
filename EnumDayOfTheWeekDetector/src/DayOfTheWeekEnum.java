public enum DayOfTheWeekEnum {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String dayName;

    DayOfTheWeekEnum(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }
}

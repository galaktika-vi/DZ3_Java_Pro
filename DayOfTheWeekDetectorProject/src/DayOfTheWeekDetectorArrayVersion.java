class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    private final String[] daysOfWeek = {
            "",
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    @Override
    public String detectDayName(int number) {
        if (number >= 1 && number <= 7) {
            return daysOfWeek[number];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}

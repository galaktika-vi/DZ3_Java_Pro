public class EnumDayOfTheWeekDetector implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        if (number >= 1 && number <= 7) {
            return DayOfTheWeekEnum.values()[number - 1].getDayName();
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}

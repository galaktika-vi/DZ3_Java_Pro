public class Main {
    public static void main(String[] args) {
        int number = 3; // Change this number to test different days

        DayOfTheWeekDetector detector1 = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetector detector2 = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetector detector3 = new DayOfTheWeekDetectorArrayVersion();

        System.out.println("Using If Version: " + detector1.detectDayName(number));
        System.out.println("Using Switch Version: " + detector2.detectDayName(number));
        System.out.println("Using Array Version: " + detector3.detectDayName(number));
    }
}

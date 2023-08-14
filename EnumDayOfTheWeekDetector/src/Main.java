import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DayOfTheWeekDetector detector = new EnumDayOfTheWeekDetector();

        System.out.print("Введите номер дня недели (1-7): ");
        int number = scanner.nextInt();
        String dayName = detector.detectDayName(number);
        System.out.println("День недели: " + dayName);

        scanner.close();
    }
}

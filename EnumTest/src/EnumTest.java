import java.util.Scanner;

enum Direction {
    NORTH("Север"),
    SOUTH("Юг"),
    EAST("Восток"),
    WEST("Запад");

    private final String translation;

    Direction(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public boolean isOpposite(Direction other) {
        return (this == NORTH && other == SOUTH) ||
                (this == SOUTH && other == NORTH) ||
                (this == EAST && other == WEST) ||
                (this == WEST && other == EAST);
    }
}

public class EnumTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите направление:");
        for (Direction direction : Direction.values()) {
            System.out.println(direction.ordinal() + ": " + direction.getTranslation());
        }

        int userChoice = scanner.nextInt();
        Direction selectedDirection = Direction.values()[userChoice];

        System.out.println("Выбранное направление: " + selectedDirection.getTranslation());

        System.out.println("Выберите другое направление:");
        for (Direction direction : Direction.values()) {
            System.out.println(direction.ordinal() + ": " + direction.getTranslation());
        }

        int anotherChoice = scanner.nextInt();
        Direction anotherDirection = Direction.values()[anotherChoice];

        System.out.println("Другое выбранное направление: " + anotherDirection.getTranslation());

        System.out.println("Являются ли выбранные направления противоположными?");
        System.out.println(selectedDirection.isOpposite(anotherDirection) ? "Да" : "Нет");

        scanner.close();
    }
}

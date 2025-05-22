import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int points = 0;

        while (true) {
            System.out.println("Введите год:");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней:");
            int day = scanner.nextInt();

            int correctDays;
            if (year % 400 == 0) {
                correctDays = 366;
            } else if (year % 100 == 0) {
                correctDays = 365;
            } else if (year % 4 == 0) {
                correctDays = 366;
            } else {
                correctDays = 365;
            }

            if (day == correctDays) {
                points++;
            } else {
                System.out.println("Неправильно! В этом году " + correctDays + " Дней!");
                break;
            }
        }
        System.out.println("Набрано очков: " + points);
    }
}


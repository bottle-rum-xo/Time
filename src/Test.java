import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTime = 0;
        int biggetsTime = 0;
        int smallestTime = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Сколько дней потребуется на выполнение?");
            int days = Integer.parseInt(scanner.nextLine());

            System.out.println("Сколько часов потребуется на выполнение?");
            int hours = Integer.parseInt(scanner.nextLine());

            System.out.println("Сколько минут потребуется на выполнение?");
            int minutes = Integer.parseInt(scanner.nextLine());

            int currentTimeTask = convertToSeconds(days, hours, minutes);

            totalTime += currentTimeTask;

            if (currentTimeTask > biggetsTime) {
                biggetsTime += currentTimeTask;
            }

            if (currentTimeTask < smallestTime) {
                smallestTime += currentTimeTask;
            }

            System.out.println("Для завершения программы нажмите end для продолжения нажмите Enter");
            String input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            }
        }
        System.out.println("Всего потребуется " + totalTime + " секунд");
    }

    public static int convertToSeconds(int days, int hours, int minutes) {
        return days * 3600 + hours * 3600 + minutes * 60;
    }
}
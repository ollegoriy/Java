import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class PW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Здравствуйте, выберите опцию:");
            System.out.println("1 - Ввести персональные данные и проверить совершеннолетие");
            System.out.println("2 - Рассчитать геометрию квадрата");
            System.out.println("3 - Рассчитать геометрию круга");
            System.out.println("4 - Рассчитать геометрию тругольника");
            System.out.println("5 - Рассчитать геометрию прямоугольника");
            System.out.println("0 - Закрыть программу");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    checkAge(scanner);
                    break;
                case 2:
                    calculateSquare(scanner);
                    break;
                case 3:
                    calculateCircle(scanner);
                    break;
                case 4:
                    calculateTriangle(scanner);
                    break;
                case 5:
                    calculateRectangle(scanner);
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, введите правильную цифру");
            }
        }

        System.out.println("Программа завершена.");
        scanner.close();
    }
    private static void checkAge (Scanner scanner){
        System.out.print("Введите ваше ФИО: ");
        String FCs = scanner.nextLine();

        System.out.print("Введите вашу дату рождения в формате ГГГГ-ММ-ДД: ");
        String BDate = scanner.nextLine();

        LocalDate BirthDate = LocalDate.parse(BDate);
        LocalDate CurrentDate = LocalDate.now();

        int age = Period.between(BirthDate, CurrentDate).getYears();

        if (age < 18) {
            System.out.println(FCs + ", Вы еще не достигли совершеннолетия!");
        } else {
            System.out.println("Спасибо за предоставленную информацию.");
        }
    }

    private static void calculateSquare (Scanner scanner){
        System.out.println("Введите сторону квадрата: ");
        double a = scanner.nextDouble();

        double PSquare = a + a + a + a;
        double SSquare = Math.pow(a, 2);

        System.out.println("Периметр квадрата: " + PSquare);
        System.out.println("Площадь квадрата: " + SSquare);
    }

    private static void calculateCircle (Scanner scanner){
        System.out.print("Введите диаметр круга: ");
        double D = scanner.nextDouble();

        double r = D / 2;
        double PCircle = D * Math.PI;
        double SCircle = Math.PI * Math.pow(r, 2);

        System.out.println("Периметр круга: " + PCircle);
        System.out.println("Площадь круга: " + SCircle);
        System.out.println("Радиус круга: " + r);
    }

    private static void calculateTriangle (Scanner scanner){
        System.out.println("Введите сторону a: ");
        double a = scanner.nextDouble();

        System.out.println("Введите сторону b: ");
        double b = scanner.nextDouble();

        System.out.println("Введите сторону c: ");
        double c = scanner.nextDouble();

        double PTriangle = a + b + c;
        double p = PTriangle / 2;
        double Heron = p * (p - a) * (p - b) + (p - c);
        double STriangle = Math.sqrt(Heron);

        System.out.println("Периметр треугольника: " + PTriangle);
        System.out.println("Площадь тругольника: " + STriangle);
    }

    private static void calculateRectangle (Scanner scanner){
        System.out.println("Введите сторону a: ");
        double a = scanner.nextDouble();

        System.out.println("Введите сторону b: ");
        double b = scanner.nextDouble();

        double PRectangle = 2 * a + 2 * b;
        double SRectangle = a * b;

        System.out.println("Периметр прямоугольника: " + PRectangle);
        System.out.println("Площадь прямоугольника: " + SRectangle);
    }
}
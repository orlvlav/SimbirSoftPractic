import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату X центра окружности: ");
        int x1 = scanner.nextInt();
        System.out.print("Введите координату Y центра окружности: ");
        int y1 = scanner.nextInt();
        System.out.print("Введите радиус круга: ");
        int radius = scanner.nextInt();
        System.out.print("Введите координату X точки А: ");
        int xSome = scanner.nextInt();
        System.out.print("Введите координату Y точки А: ");
        int ySome = scanner.nextInt();
    }
    public static void check(int x1, int y1, int radius, int xSome, int ySome)
    {
        double firstСalc = Math.pow(x1 - xSome, 2);
        double secondCalc = Math.pow(y1 - ySome, 2);

        if (firstСalc + secondCalc <= Math.pow(radius,2))
        {
            System.out.println("Точка А лежит внутри окружности");
        }
        else System.out.println("Точка А за пределами окружности");
    }
}
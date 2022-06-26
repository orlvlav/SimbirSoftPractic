import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Введите точку Х1: ");
        int X1 = scanner.nextInt();
        System.out.print("Введите точку Y1: ");
        int Y1 = scanner.nextInt();

        System.out.print("Введите точку Х2: ");
        int X2 = scanner.nextInt();
        System.out.print("Введите точку Y2: ");
        int Y2 = scanner.nextInt();

        System.out.println("Точка А находится на (" + X1 + "; " + Y1 + ").\n" +
                "Точка B находится на (" + X2 + "; " + Y2 + ").");

        System.out.println("Длинна отрезка составляет:" + lengthAB(X1, Y1, X2, Y2));
    }
    public static double lengthAB(int X1, int Y1, int X2, int Y2)
    {
        double first = Math.pow(Y2 - Y1, 2);
        double second = Math.pow(X2 - X1, 2);

        double length = Math.sqrt(first + second);

        return length;
    }
}
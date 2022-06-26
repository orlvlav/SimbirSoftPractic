import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите X1: ");
        int x1 = scanner.nextInt();
        System.out.print("Введите Y1: ");
        int y1 = scanner.nextInt();

        System.out.println("Точка А (" + x1 + "; " + y1 + ").");
        System.out.println("Она нахожится в " + place(x1, y1) + " четверти.");
    }
    public static int place(int x1, int y1)
    {
        int x = x1;
        int y = y1;

        if ((x > 0) && (y > 0))
            return 1;
        else if ((x < 0) && (y > 0))
            return 2;
        else if ((x < 0) && (y < 0))
            return 3;
        else if ((x > 0 && y < 0))
            return 4;
        else
            return -1;
    }
}
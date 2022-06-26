import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число Х (12344): ");
        int X = scanner.nextInt();
        System.out.print("Введите цифру D (4): ");
        int D = scanner.nextInt();
        int count = num(X, D);

        System.out.println("В числе " + X + ", " + count + " цифры " + D);
    }
    public static int num(int X, int D)
    {
        int count = 0;
        int length = String.valueOf(X).length();
        for (int i = 0; i < length; i++)
        {
            if (X % 10 == D)
            {
                count++;
            }
            X /= 10;
        }
        return count;
    }
}
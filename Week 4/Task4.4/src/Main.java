import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println("Результат: " + count(number));
    }
    public static int count(int number)
    {
        int even = 0;
        int odd = 0;

        int length = String.valueOf(number).length();
        for (int i = 0; i < length; i++)
        {
            int X = number % 10;
            if (X % 2 == 0)
                even++;
            else
                odd++;
            number /= 10;
        }
        if (even > odd)
            return 1;
        else if (even < odd)
            return -1;
        else
            return 0;
    }
}
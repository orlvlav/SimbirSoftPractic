import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int value = scanner.nextInt();
        System.out.println("Количество делителей в числе " + value + " равняется " + count(value));
    }
    public static int count(int value)
    {
        int D = 0;
        for (int i = value; i <= value * 2; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                    D++;
                }
            }
        }
        return D;
    }
}
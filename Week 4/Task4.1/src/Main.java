import java.util.Scanner;

public class Main
{
    static int number;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        number = scanner.nextInt();
        ValueOfNumber();
    }
    public static void ValueOfNumber()
    {
        if (number == 0)
            System.out.println(0);
        if (number > 0)
            System.out.println(1);
        if (number < 0)
            System.out.println(-1);
    }
}
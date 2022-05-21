import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int number;
    public static void main(String[] args)
    {
        number = getNum();
        minToMax();
        System.out.println();
        maxToMin();
    }
    public static int getNum()
    {
        System.out.print("Введите число: ");
        int num;

        if (scanner.hasNextInt())
        {
            num = scanner.nextInt();
        }
        else
        {
            System.out.print("Вы ввели неверное число.");
            scanner.hasNextInt();
            num = getNum();
        }
        return num;
    }

    public static int minToMax()
    {
        int zero = 0;
        System.out.println("В порядке возрастания:");

        while (zero != number + 1)
        {
            System.out.print(zero++ + " ");
        }
        return 0;
    }

    public static int maxToMin()
    {
        System.out.println("В порядке уменьшения:");
        while (number != -1)
        {
            System.out.print(number-- + " ");
        }
        return 0;
    }
}
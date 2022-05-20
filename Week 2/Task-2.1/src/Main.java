import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите AVG: ");
        int avg = scanner.nextInt();
        if (avg == 100)
        {
            System.out.println("Молодец!");
        }

        System.out.print("Введите MARK: ");
        double mark = scanner.nextDouble();
        if (mark <= 60)
        {
            System.out.println("Значение MARK = " + (mark + (mark * 0.1)));
        }

        System.out.print("Введите ONE: ");
        int one = scanner.nextInt();
        System.out.print("Введите TWO: ");
        int two = scanner.nextInt();
        if (one == two)
        {
            System.out.println("Значение ONE и TWO равны");
        }
        else if (one > two)
        {
            System.out.println("Значение ONE больше значения TWO");
        }
        else
        {
            System.out.println("Значение ONE меньше значения TWO");
        }

        System.out.print("Введите значение NUM: ");
        int num = scanner.nextInt();
        if (num > 0)
        {
            System.out.println("Положительное");
        }
        else if (num < 0)
        {
            System.out.println("Отрицательное");
        }

        System.out.print("Введите значение для первого угла: ");
        int ugol1 = scanner.nextInt();
        System.out.print("Введите значение для второго угла: ");
        int ugol2 = scanner.nextInt();
        System.out.print("Введите значение для третьего угла: ");
        int ugol3 = scanner.nextInt();
        if ((ugol1 + ugol2 + ugol3) == 180)
        {
            System.out.println("Это углы одного треугольника.");
        }
        else
        {
            System.out.println("Это не углы одного треугольника.");
        }
    }
}
import java.util.Scanner;

public class getNumber
{
    private int count = 0;
    private int countNumber = 1;
    private int number;
    public int getNumber()
    {
        Scanner scanner = new Scanner(System.in);
        while (count < 4)
        {
            System.out.print("Введите " + countNumber + "-ое число: ");
            number = scanner.nextInt();
            if ((number % 2 == 0) && (countNumber % 2 == 0))
            {
                count = count + 1;
                countNumber++;
            }
            else
            {
                countNumber++;
            }
        }
        System.out.println("Программа закончила свое выполнение.\n" +
                "Количество четных чисел на нечетных позициах: " + count +"\n" +
                "Всего чисел: " + countNumber);
        scanner.close();
        return count;
    }
}

import java.util.Scanner;

public class Arrays
{
    int length;
    public void createArray()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Ваш массив: ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 90 + 10);
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\tЧётные ячейки массива");

        for (int i = 1; i < length; i += 2)
            System.out.print(array[i] + " ");

        System.out.println("\n\tНечётные ячейки массива");

        for (int i = 0; i < length; i += 2)
            System.out.print(array[i] + " ");
    }
}

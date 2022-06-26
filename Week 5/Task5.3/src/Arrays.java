import java.util.Scanner;

public class Arrays
{
    int length;
    public void arrays()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        length = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 90 + 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Четные значения массива");

        for (int i = 1; i < length; i ++)
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");
        System.out.println();
        System.out.println("Нечетные значения массива");

        for (int i = 0; i < length; i ++)
            if (array[i] % 2 != 0)
                System.out.print(array[i] + " ");
    }
}

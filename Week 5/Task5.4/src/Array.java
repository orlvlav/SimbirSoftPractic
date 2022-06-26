import java.util.Scanner;

public class Array
{
    int length;
    public void array()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Ваш массив: ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 900 + 100);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < length / 2; i++)
            System.out.println(array[i] + " и " + array[length - 1 - i]);

        if (length % 2 != 0)
            System.out.println(array[length / 2]);
    }
}

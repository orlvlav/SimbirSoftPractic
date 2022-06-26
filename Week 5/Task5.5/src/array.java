import java.util.Scanner;

public class array
{
    int length;
    public void array()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 90 + 10);
            System.out.print(array[i] + " ");
        }

        if (length % 2 != 0) {
            System.out.println("\nМассив имеет нечетный размер.");

            System.out.println("\tПервая половина массива с <<начала>>");
            for (int i = 0; i < length / 2 + 1; i++)
                System.out.print(array[i] + " ");

            System.out.println("\n\tВторая половина массива с <<конца>>");
            for (int i = length - 1; i > length / 2; i--)
                System.out.print(array[i] + " ");
        } else {
            System.out.println("\nМассив имеет четный размер");

            System.out.println("\tПервая половина массива с <<начала>>");
            for (int i = 0; i < length / 2; i++)
                System.out.print(array[i] + " ");

            System.out.println("\n\tВторая половина массива с <<конца>>");
            for (int i = length - 1; i >= length / 2; i--)
                System.out.print(array[i] + " ");
        }
    }
}

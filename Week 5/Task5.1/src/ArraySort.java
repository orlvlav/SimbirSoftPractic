import java.util.Scanner;

public class ArraySort
{
    int lengthOfArray;
    public void enterLengthArray()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        lengthOfArray = scanner.nextInt();
    }
    public void fillingOfArray()
    {
        int[] array = new int[lengthOfArray];
        System.out.println("\tВаш заполненный массив:");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 900 + 100);
            System.out.print(array[i] + " ");
        }

        if (lengthOfArray % 2 != 0)
        {
            System.out.println("\nМассив имеет нечетный размер");
            System.out.println("\tПервая половина массива");
            for (int i = 0; i < lengthOfArray / 2 + 1; i++)
            {
                System.out.print(array[i] + " ");
            }
            System.out.println("\n\tВторая половина массива");
            for (int i = lengthOfArray / 2 + 1; i < lengthOfArray; i++)
            {
                System.out.print(array[i] + " ");
            }
        }
        else
        {
            System.out.println("\nМассив имеет четный размер");
            System.out.println("\tПервая половина массива");
            for (int i = 0; i < lengthOfArray / 2; i++)
            {
                System.out.print(array[i] + " ");
            }
            System.out.println("\n\tВторая половина массива");
            for (int i = lengthOfArray / 2; i < lengthOfArray; i++)
            {
                System.out.print(array[i] + " ");
            }
        }
    }
}
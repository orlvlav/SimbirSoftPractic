import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        array();
    }
    public static void array()
    {
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int length = scanner.nextInt();
        int[] arrayA = new int [length];
        for (int i = 0; i < arrayA.length;i++)
        {
            arrayA[i] = (int) (Math.random() * 90 + 10);
            System.out.print(arrayA[i] + " ");
        }

        System.out.println("Массив В:");
        int[] arrayB = new int[length / 2];
        for (int j = 0; j < arrayB.length; j += 2)
        {
            arrayB[j] = arrayA[n] + 2;
        }
    }
}
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int num;

    public static void main(String[] args)
    {
        num = getNumber();
        System.out.println("Вы ввели число: " + num);
        condition();
        System.out.println();
        System.out.println("Конец программы.");

    }
    public static int getNumber()
    {
        System.out.print("Введите целое положительное число: ");
        int number = scanner.nextInt();
        if (number < 0)
        {
            System.out.println("Вы ввели неверное число.");
            number = getNumber();
        }
        return number;
    }
    //1) серия начинается с числа, большего X на 1;
    public static void condition()
    {
       int[] array = new int[17];
       int temp = 2;
       System.out.print("Заполнение массива на +1: ");
       for (int i = 0; i < array.length; i++)
       {
           num++;
           array[i] = num;
           System.out.print(array[i] + " ");
       }
       //2) каждое число в серии (начиная со второго) больше предьщущего на 3.
        System.out.println();
       System.out.print("Вывод каждого числа больше на 3: ");
       for (int i = 0; i < array.length; i++)
       {
           System.out.print(array[i] + " ");
           i = i + temp;
       }

    }
}
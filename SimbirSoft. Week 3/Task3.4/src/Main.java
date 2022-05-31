/*
3.4  Напишите класс, который принимает с клавиатуры целое положительное число Х и выводит на экран все его делители
(1 и само число Х не считать делителями). Класс должен также подсчитать количество этих делителей и вывести результат
на экран вместе с соответствующим по смыслу текстовым сообщением.
 */
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int number;
    public static void main(String[] args)
    {
        number = getNumber();
        System.out.println("Вы ввели число: " + number);
        findDivisor();
    }

    public static int getNumber()
    {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number <= 0)
        {
            System.out.println("Вы ввели неверное число.");
            number = getNumber();
        }
        return number;
    }
    public static void findDivisor()
    {
        int[] arrayDivisor = new int[number];
        int start = 1;
        int count = 0;
        for (int i = 0; i < arrayDivisor.length; i++)
        {
            arrayDivisor[i] = start;
            start++;
        }

        for (int i = 0; i < arrayDivisor.length; i++)
        {
            if (number % arrayDivisor[i] == 0)
            {
                count++;
                System.out.println("Вариант №" + count);
                System.out.println(number + ":" + arrayDivisor[i] + "=" + (number/arrayDivisor[i]));
            }
        }
    }
}
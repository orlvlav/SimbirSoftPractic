import java.util.Random;
/*
3.8 Напишите класс, который генерирует 24 целых трехзначных положительных числа и выводит на экран
порядковый номер самого большого из сгенерированных чисел
 */
public class Main {
    public static void main(String[] args)
    {
        createArray();
    }
    public static void createArray()
    {
        int[] array = new int[24];
        Random random = new Random();
        int maxValue = 0;
        //Заполнение массива в диапазоне 100-999
        System.out.println("Ваш массив:");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(900) + 100;
            System.out.print(array[i] + " ");
        }
        //Нахождение максимального значения
        System.out.println();
        for (int i = 0; i < array.length; i++)
        {
            if (maxValue < array[i])
            {
                maxValue = array[i];
            }
        }
        System.out.println("Максимальное значение в массиве было: " + maxValue);
    }
}
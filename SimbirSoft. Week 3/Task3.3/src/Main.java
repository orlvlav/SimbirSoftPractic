/*
3.3 Напишите класс, который выводит на экран все положительные двузначные числа
(выберите самостоятельно - в возрастающем или убывающем порядке),
произведение цифр которых является тоже двузначным числом.
 */
public class Main {
    public static void main(String[] args)
    {
        createArray();
    }
    public static void createArray()
    {
        int[] array = new int[90];
        int start = 10;
        System.out.println("Заполнение массива: ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = start;
            System.out.print(array[i] + " ");
            start++;
        }
        System.out.println();
        System.out.println("Вывод чисел: ");
        for (int i = 0; i < array.length; i++)
        {
            if ((array[i] + array[i++]) <= 99)
            {
                System.out.print(array[i] + " ");
            }
        }
    }
}
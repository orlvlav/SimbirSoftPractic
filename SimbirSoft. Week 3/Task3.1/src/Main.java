/*Напишите класс, который выводит на экран в строку все положительные двузначные четные числа (в возрастающем порядке).
Числа должны отделяться друг от друга знаком «пробел».
Перед началом и после окончания вывода серии чисел на экран вывода следует вывести текстовые сообщения (по выбору).
*/

public class Main {
    public static void main(String[] args)
    {
        getArray();
    }
    public static void getArray()
    {
        int[] array = new int [90];
        int num = 10;
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = num;
            num++;
            if (array[i] % 2 == 0)
            {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Конец программы.");
    }
}
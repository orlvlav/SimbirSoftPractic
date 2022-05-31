/*
3.7 Напишите класс, который генерирует 25 целых положительных трехзначных чисел и выводит на экран порядковый номер числа,
сумма цифр которого была максимальной.
 */
public class Main
{
    public static void main(String[] args)
    {
        getNumbers getNumbers = new getNumbers();
        System.out.println("Ваш случайно сгенерированный массив:");
        getNumbers.getValueToIndex();
        System.out.println();
        getNumbers.getMaxNumber();
    }
}
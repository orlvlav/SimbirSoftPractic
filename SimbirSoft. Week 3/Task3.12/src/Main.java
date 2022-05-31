/*
3.12 Напишите класс, который выводит на экран все трехзначные числа, для которых соблюдаются два условия:
• само число заканчивается на 0;
• сумма нечетных делителей этого числа тоже заканчивается на 0.
 */
public class Main
{
    public static void main(String[] args)
    {
        getNumbers getNumbers = new getNumbers();

        System.out.println("Изначальынй массив:");
        getNumbers.getNumber();
        System.out.println();
        System.out.println("Массив, который удовлетворяет условия:");
        getNumbers.endInZero();
    }
}
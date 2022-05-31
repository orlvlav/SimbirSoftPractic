import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
/*
3.10 Напишите класс, который находит наибольшее положительное двузначное число,
которое делится на произведение своих цифр.
 */
public class maxNumber
{
    private final int[] arrayOfNumbers = new int[90];
    public void maxNumber()
    {
        Random random = new Random();
        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
            arrayOfNumbers[i] = random.nextInt(90) + 10;
            System.out.print(arrayOfNumbers[i] + " ");
        }
    }
    public void productsOfANumber()
    {
        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
            String numberOfString = String.valueOf(arrayOfNumbers[i]);
            char[] products = numberOfString.toCharArray();
            for (int j = 0; j < products.length; j++)
            {
                int sumOfChar = (int) (products[0] + products[1]);
                System.out.println("asdasdasdasd" + sumOfChar);

            }
        }
    }
}

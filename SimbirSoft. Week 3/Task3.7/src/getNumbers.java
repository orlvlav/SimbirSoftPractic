import java.util.Random;

public class getNumbers
{
    private final int[] arrayOfNumbers = new int[25];
    public void getValueToIndex()
    {
        Random random = new Random();
        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
            arrayOfNumbers[i] = random.nextInt(900) + 100;
            System.out.print(arrayOfNumbers[i] + " ");
        }
    }
    public void getMaxNumber()
    {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
            if (arrayOfNumbers[i] > temp)
            {
                temp = arrayOfNumbers[i];
                count = i;
            }
        }
        count++;
        System.out.println("Максимальное число: " + temp + ".\n" +
                "Оно под номером: " + count + ".");
    }
}

public class getNumbers
{
    private final int[] arrayOfNumbers = new int[900];
    private char[] charOfArray = new char[3];
    public void getNumber()
    {
        int startNumber = 100;
        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
            arrayOfNumbers[i] = startNumber;
            startNumber++;
            System.out.print(arrayOfNumbers[i] + " ");
        }
    }

    public void endInZero()
    {
        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
            if (arrayOfNumbers[i] % 10 == 0)
            {
                System.out.print(arrayOfNumbers[i] + " ");
            }
        }
    }
}
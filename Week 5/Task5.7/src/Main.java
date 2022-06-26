public class Main
{
    static int[] array = new int [89];
    public static void main(String[] args)
    {
        fill();
    }
    public static void fill()
    {
        int number = 0;

        for (int i = 0; i < array.length; i++)
        {
            number = minMax(number);
            array[i] = number;
            if (number == 99)
            {
                number = i;
                break;
            }
        }
            System.out.println("\nВаш массив:");
            for (int i = 0; i <= number; i++)
                System.out.print(array[i] + " ");
    }
    public static int minMax(int num)
    {
        int rNum = (int) (Math.random() * 90 + 10);
        if (rNum <= num)
            return minMax(num);
        else
            return rNum;
    }
}
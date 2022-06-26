public class Main
{
    static int[] array = new int[90];

    public static void main(String[] args)
    {
        fillArray();
    }
    public static void fillArray()
    {
        int number = 0;
        for (int i = 0; i < array.length; i++)
        {
            number = (int) (Math.random() * 90 + 10);
        }
    }
    public static int checkIndex()
    {
        for (int j = 0; j < i; j++)
        {
            if (mas[j] == num)
            {
                num = (int) (Math.random() * 90 + 10);
                return arrayCheck(mas, i, num);
            }
        }
        return num;
    }
}
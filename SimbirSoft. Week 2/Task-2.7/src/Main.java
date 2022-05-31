import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String numberStr;
    static int number;
    static char[] strToArray;
    public static void main(String[] args)
    {
        numberStr = getNum();
        number = Integer.parseInt(numberStr);
        System.out.println("Вы ввели: " + numberStr);
        strToArray = numberStr.toCharArray();

        if (number >= 500)
        {
            moreFiveHundred();
        }
        else
        {
            lowerFiveHundred();
        }
    }
    public static String getNum()
    {
        System.out.print("Введите трехзначное число: ");
        String numStr = scanner.next();
        int num = Integer.parseInt(numStr);
        if (num < 100)
        {
            System.out.println("Вы ввели неверное число.");
            numStr = getNum();
        }
        else if (num >= 1000)
        {
            System.out.println("Вы ввели неверное число.");
            numStr = getNum();
        }
        return numStr;
    }

    public static int moreFiveHundred()
    {
        char temp = strToArray[0];
        strToArray[0] = strToArray[2];
        strToArray[2] = temp;
        System.out.print("Ваш результат: ");
        for (int i = 0; i < strToArray.length; i++)
        {
            System.out.print(strToArray[i]);
        }
        return 0;
    }

    public static int lowerFiveHundred()
    {
        char temp = strToArray[1];
        strToArray[1] = strToArray[2];
        strToArray[2] = temp;
        System.out.print("Ваш результат: ");
        for (int i = 0; i < strToArray.length; i++)
        {
            System.out.print(strToArray[i]);
        }
        return 0;
    }
}
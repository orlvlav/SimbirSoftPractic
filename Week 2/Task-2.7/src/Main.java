import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");

        String numStr = scanner.next();
        int num = Integer.parseInt(numStr);
        char[] strToArray = numStr.toCharArray();
        char temp;

        if (num > 500)
        {
            temp = strToArray[0];
            strToArray[0] = strToArray[2];
            strToArray[2] = temp;

            for (int i = 0; i < strToArray.length; i++)
            {
                System.out.print(strToArray[i] + " ");
            }
        }
        else
        {
            temp = strToArray[1];
            strToArray[1] = strToArray[2];
            strToArray[2] = temp;

            for (int i = 0; i < strToArray.length; i++)
            {
                System.out.print(strToArray[i] + " ");
            }
        }
    }
}
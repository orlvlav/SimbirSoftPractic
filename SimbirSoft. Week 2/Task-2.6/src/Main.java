import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двухзначное число: ");
        String num = scanner.next();
        char[] strToArray = num.toCharArray();
        if (strToArray.length > 1)
        {
            System.out.println("Вы ввели не двухзначное число");
            System.exit(0);
        }

        if (strToArray[0] > strToArray[1])
        {
            System.out.println("Первая цифра двухзначного числа больше второго.");
        }
        else if (strToArray[0] < strToArray[1])
        {
            System.out.println("Первая цифра двухзначного числа меньше второго.");
        }
    }
}
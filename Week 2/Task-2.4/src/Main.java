import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int minToMax = num, maxToMin = num;

        System.out.println("В порядке убывания:");
        while (maxToMin != -1)
        {
            System.out.print(maxToMin-- + " ");
        }
        System.out.println();
        System.out.println("В порядке возрастания:");
        int zero = 0;
        while (zero != minToMax+1)
        {
            System.out.print(zero++ + " ");
        }
    }
}
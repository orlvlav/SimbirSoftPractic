import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое значение: ");
        int first = scanner.nextInt();
        System.out.print("Введите первое значение: ");
        int second = scanner.nextInt();

        if (first > second) System.out.println("Первое значение больше второго.");
        else if (first < second) System.out.println("Первое значение меньше второго.");
        else System.out.println("Значения равны.");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое значение: ");
        int def = scanner.nextInt();
        if (def < 0)
        {
            System.out.print("Вы ввели отрицательное число " + def + ", мы сделали его положительным: " + Math.abs(def));
        }
        else if (def > 0)
        {
            def = 0;
            System.out.print("Вы ввели положительное число. Мы изменили его значение на ноль: " + def);
        }
        else System.out.print("Вы ввели ноль. Мы не знаем что с ним делать.");
    }
}
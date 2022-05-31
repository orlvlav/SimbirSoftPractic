import java.util.Scanner;

/*
3.5 Последовательность Фибоначчи - последовательность целых чисел, построенная по следующему правилу:
каждый член последовательности, начиная с 3-го, равен сумме двух предыдущих.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сколько чисел должно быть в последовательности: ");
        int num = scanner.nextInt();
        int firstDef = 1;
        int secondDef = 1;
        int out;
        System.out.print(firstDef + " " + secondDef + " ");
        for(int i = 3; i <= num; i++)
        {
            out = firstDef + secondDef;
            System.out.print(out + " ");
            firstDef = secondDef;
            secondDef = out;
        }
    }
}
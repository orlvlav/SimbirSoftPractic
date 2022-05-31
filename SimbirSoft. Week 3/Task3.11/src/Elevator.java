import java.util.Scanner;

public class Elevator
{
    private final int maxPeople = 6;
    private final int maxWeight = 450;
    private int countWeight;
    private int countPeople;
    private int weightEntering;
    private final String warningPeople = "Прекращен вход в лифт по достижении максимального количества человек. ";
    private final String warningWeight = "Прекращен вход в лифт по достижении максимального веса. ";

    public void generatePeople()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вес входящего в лифт: ");
        weightEntering = scanner.nextInt();
        if (((weightEntering + countWeight) < maxWeight) && (countPeople != maxPeople))
        {
            countPeople++;
            countWeight += weightEntering;
            System.out.println("В лифт вошли " + countPeople + " человек." + " Их общий вес составляет " + countWeight);
            generatePeople();
        }
        scanner.close();
    }
    public void stopElevator()
    {
        if (countPeople == maxPeople)
        {
            System.out.println(warningPeople + "\n" + "Вошло " + countPeople + " человек.\n" +
                    "Их общий вес составляет:" + countWeight);
        }
        else
        {
            System.out.println(warningWeight + "\n" + "Вошло " + countPeople + " человек.\n" +
                    "Их общий вес составляет:" + countWeight);
        }
    }
}

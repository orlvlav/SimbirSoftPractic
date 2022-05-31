/*
3.6 Производственный участок выпускает стальные шарики, диаметр которых должен быть равен 24 миллиметрам
(допустимое отклонение не более 2 миллиметров), а вес - 74 граммам (допустимое отклонение не более 3 грамм).
Напишите класс, который принимает данные 120 шариков, для каждого из них определяет,
соответствуют ли его параметры указанным стандартам, и выводит на экран для каждого шарика соответствующее текстовое сообщение.
*/

public class Main
{
    public static void main(String[] args)
    {
        factory();
    }
    public static void factory()
    {
        int[] arrayDiameter = new int[121];
        int[] arrayWeight = new int[121];
        int count = 0;
        //Рандом диаметра шариков
        for (int i = 0; i < arrayDiameter.length; i++)
        {
            arrayDiameter[i] = 20 + (int) (Math.random() * 5);
        }
        //Рандом веса шариков
        for (int i = 1; i < arrayWeight.length; i++)
        {
            arrayWeight[i] = 70 + (int) (Math.random() * 10);
        }
        for (int i = 1; i < arrayWeight.length; i++)
        {
            if ((arrayDiameter[i] >= 22 && arrayDiameter[i] <= 26) && (arrayWeight[i] >= 71 && arrayWeight[i] <= 77))
            {
                count++;
                System.out.println(i + " шарик имеет вес " + arrayWeight[i] + " и его диаметр составляет " + arrayDiameter[i] + ":ГОСТ.");
            }
            else
            {
                System.out.println(i + " шарик имеет вес " + arrayWeight[i] + " и его диаметр составляет " + arrayDiameter[i] + ":брак.");
            }
        }
        System.out.println("Количество шариков без брака: " + count);
    }
}
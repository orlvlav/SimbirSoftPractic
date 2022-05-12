package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        /*1.5 Составить программу в которой пользователь поэтапно вводит два числа и один из символов: +, -, *, /
        Программа считает в соответствии с выбранным символом их сумму, разность,
        произведение или частное от деления первого числа на второе.
        Выводимому результату должно предшествоватьсоответствующее сообщение.
        Стоит учитывать правило “деления на 0”, и в случае попытки деления на 0, вывести на экран соответствующее сообщение.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();
        System.out.print("Введите, что Вы хотите сделать с числами (+, -, *, /): ");
        String action = scanner.next();

        scanner.close();

        if ((second == 0) && (action.equals("/")))
        {
            System.out.print("Вы патаетесь поделить на ноль. Попробуйте еще раз");
            System.exit(0);
        }

        switch (action)
        {
            case "+":
            {
                System.out.print("Результат сложения " + first + " и " + second + " равен " + (first + second));
                break;
            }
            case "-":
            {
                System.out.print("Результат вычитания " + first + " и " + second + " равен " + (first - second));
                break;
            }
            case "*":
            {
                System.out.print("Результат умножения " + first + " и " + second + " равен " + (first * second));
                break;
            }
            case "/":
            {
                double firstD = first;
                double secondD = second;
                if (first < second)
                {
                    System.out.print("Результат разности " + first + " и " + second + " равен " + (firstD / secondD));
                    break;
                }
                else if ((first > second) && second % 2 == 0)
                {
                    System.out.print("Результат разности " + first + " и " + second + " равен " + (firstD / secondD));
                    break;
                }
                else if ((first > second) && second / 2 != 0)
                {
                    System.out.print("Результат разности " + first + " и " + second + " равен " + (firstD / secondD));
                    break;
                }
                System.out.print("Результат разности " + first + " и " + second + " равен " + (first / second));
                break;
            }
        }
    }
}
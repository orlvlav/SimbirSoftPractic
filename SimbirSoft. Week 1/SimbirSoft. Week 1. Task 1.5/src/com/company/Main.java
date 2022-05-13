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
        double first = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double second = scanner.nextDouble();
        System.out.print("Введите, что Вы хотите сделать с числами (+, -, *, /): ");
        String action = scanner.next();

        if (action.equals("+"))
        {
            System.out.print("Рузультат сложения числа " + first + " и числа " + second + " равняется " + (first + second));
        }
        else if (action.equals("-"))
        {
            System.out.print("Рузультат вычитания числа " + first + " и числа " + second + " равняется " + (first - second));
        }
        else if (action.equals("*"))
        {
            System.out.print("Рузультат умножения числа " + first + " и числа " + second + " равняется " + (first * second));
        }
        else if (action.equals("/"))
        {
            System.out.print("Рузультат деления числа " + first + " и числа " + second + " равняется " + (first / second));
        }
        else if (action.equals("/") && (second == 0))
        {
            System.out.print("Вы пытаетесь поделить на ноль");
        }
        scanner.close();
        }
    }
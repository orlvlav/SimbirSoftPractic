package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        /*1.2 Составить программу вывода на экран числа, вводимого с клавиатуры.
        Выводимому числу должно предшествовать сообщение «Вы ввели число».*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println("Вы ввели число " + number);
    }
}

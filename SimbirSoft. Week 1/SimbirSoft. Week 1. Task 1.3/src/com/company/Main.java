package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        /*1.3  Составить программу в которой пользователь поэтапно вводит длину и ширину прямоугольника,
	    а программа выводит на экран его периметр и длину диагонали.
	    Каждому значению должно предшествовать соответствующие сообщения
	    (“Периметр прямоугольника равен:”,”Длина диагонали равна:”)*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ширину прямоугольника: ");
        int width = scanner.nextInt();

        System.out.print("Введите высоту прямоугольника: ");
        int height = scanner.nextInt();

        System.out.print("\nПериметр прямоугольника равен: " + (2*(width+height)) +
                "\nПлощадь прямоугольника равна: "+ (width*height) +
                "\nДлина диагонали периметра равна: " + (Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2))));
    }
}

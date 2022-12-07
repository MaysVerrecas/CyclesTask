package com.maysverrecas.tasks;

import java.util.Scanner;

import static com.maysverrecas.tasks.Task1.infinityWhile;

public class Task1 {
    public static void main(String[] args) {
        createTriangle();
        infinityWhile();
        summerThree();
        maxInt();
    }

    private static void maxInt() {
        /**
         * Считываем целые числа пока будет введено что-то другое
         * например, строка или символ
         *
         * Вывести на экран максимальное из введеных чисел.
         */
        Scanner console = new Scanner(System.in);
        int maxi = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int n = console.nextInt();
            if (n > maxi) {
                maxi = n;
            }
        }
        System.out.println(maxi);
    }

    private static void summerThree() {
        /**
         * Вывести на экран сумму чисел от 1 до 100 не кратных 3
         */
        int n = 1;
        int summer = 0;
        while (n <= 100) {
            if (n % 3 == 0) {
                n++;
                continue;
            }
            summer += n;
            n++;
        }
        System.out.println(summer);
    }

    private static void createTriangle() {
        /**
         * Давай используем цикл for, чтобы вывести на экран прямоугольный треугольник
         * из восьмёрок со сторонами (катетами) 10 и 10.
         * То есть в первой строке должна быть одна 8, начиная слева, во второй - две и т.д
         */
        for (int i = 0; i < 10; i++) { // этот цикл используется для кол-ва строк
            for(int j = 0; j <= i; j++) { // тот цикл используется для кол-ва символов в строке
                System.out.print("8");
            }
            System.out.println();
        }
    }
    public static void infinityWhile() {
        /**
         * вводим данные, пока не будет введено слово enough
         */
        Scanner console = new Scanner(System.in);
        while (true) { // бесконечный цикл
            String s = console.nextLine(); // постоянно считываем с консоли
            if (s.equals("enough")) { // если введено стоп слово - останавливаем цикл.
                break;
            }
        }
    }
}


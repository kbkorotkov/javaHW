import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Задача 1: Четное или нечетное число
//        Условие: Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        System.out.println(num % 2 == 0 ? "Четное" : "Нечетное");

//        Задача 2: Минимальное из трех чисел
//        Условие: Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число 1: ");
//        int num1 = scanner.nextInt();
//        System.out.print("Введите число 2: ");
//        int num2 = scanner.nextInt();
//        System.out.print("Введите число 3: ");
//        int num3 = scanner.nextInt();
//        System.out.println("Минимальное число: " + Math.min(Math.min(num1, num2), num3));

//        Задача 3: Таблица умножения
//        Условие: Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10).

//        System.out.println("Таблица умножения на 5");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("5 * " + i + " = " + 5 * i);
//        }

//        Задача 4: Сумма чисел от 1 до N
//        Условие: Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.

//       Scanner scanner = new Scanner(System.in);
//       System.out.print("Введите N: ");
//       int N = scanner.nextInt();
//       int sum = 0;
//       for (int i = 0; i <= N; i++) {
//           sum += i;
//       }
//       System.out.println("Сумма всех чисел до N: " + sum);

//        Задача 5: Число Фибоначчи
//        Условие: Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите N: ");
//        int N = scanner.nextInt();
//        int fib1 = 0, fib2 = 1;
//        for (int i = 0; i < N; i++) {
//            System.out.println("Число Фибоначчи[" + i + "] " + fib1);
//            int next = fib1 + fib2;
//            fib1 = fib2;
//            fib2 = next;
//        }

//        Задача 6: Проверка простого числа
//        Условие: Пользователь вводит целое число. Программа должна проверить, является ли это число простым.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        boolean isComplex = false;
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                isComplex = true;
//                break;
//            }
//        }
//        System.out.println(isComplex ? "Это составное число" : "Это простое число");

//        Задача 7: Обратный порядок чисел
//        Условие: Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        for (int i = num; i > 0; i--) {
//            System.out.println(i);
//        }

//        Задача 8: Сумма четных чисел
//        Условие: Пользователь вводит два целых числа A и B. Программа должна найти сумму всех четных чисел в диапазоне от A до B (включительно).

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите A: ");
//        int A = scanner.nextInt();
//        System.out.print("Введите B: ");
//        int B = scanner.nextInt();
//        int sum = 0;
//        for (int i = A; i <= B; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("Сумма всех четных чисел от A до B: " + sum);

//        Задача 9: Реверс строки
//        Условие: Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String str = scanner.nextLine();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            System.out.print(str.charAt(i));
//        }

//        Задача 10: Количество цифр в числе
//        Условие: Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        int count = 1;
//        while (num / 10 > 0) {
//            count++;
//            num = num / 10;
//        }
//        System.out.println("Это число имеет " + count + " цифр");

//        Задача 11: Факториал числа
//        Условие: Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!).

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите N: ");
//        int N = scanner.nextInt();
//        int factorialN = 1;
//        for (int i = 1; i <= N; i++) {
//            factorialN = factorialN * i;
//        }
//        System.out.println("Факториал числа " + N + " равен " + factorialN);

//        Задача 12: Сумма цифр числа
//        Условие: Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        int sum = 0;
//        while (num / 10 > 0) {
//            sum += num % 10;
//            num = num / 10;
//        }
//        sum += num;
//        System.out.println("Сумма всех цифр этого числа: " + sum);

//        Задача 13: Палиндром
//        Условие: Пользователь вводит строку. Программа должна проверить, является ли эта строка палиндромом.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String str = scanner.nextLine();
//        boolean isPalindrome = true;
//        for (int i = 0; i < str.length(); i++) {
//            if (!(str.toCharArray()[i] == str.toCharArray()[str.length() - 1 - i])) {
//                isPalindrome = false;
//            }
//        }
//        System.out.println(isPalindrome ? "Это палиндром" : "Это не палиндром");

//        Задача 14: Найти максимальное число в массиве
//        Условие: Пользователь вводит размер массива и элементы массива. Программа должна найти и вывести максимальное число в массиве.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество элементов: ");
//        int len = scanner.nextInt();
//        int[] arr = new int[len];
//        for (int i = 0; i < len; i++) {
//            System.out.print("Введите число[" + i + "]: ");
//            arr[i] = scanner.nextInt();
//        }
//        int maxNum = arr[0];

//        for (int el : arr) {
//            if (el > maxNum) {
//                maxNum = el;
//            }
//        }
//        System.out.println("Максимальное число в массиве: " + maxNum);

//        Задача 15: Сумма всех элементов массива
//        Условие: Пользователь вводит размер массива и его элементы. Программа должна вычислить и вывести сумму всех элементов массива.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество элементов: ");
//        int len = scanner.nextInt();
//        int[] arr = new int[len];
//        for (int i = 0; i < len; i++) {
//            System.out.print("Введите число[" + i + "]: ");
//            arr[i] = scanner.nextInt();
//        }
//        int sum = 0;
//        for (int el : arr) {
//            sum += el;
//        }
//        System.out.println("Сумма всех элементов массива: " + sum);

//        Задача 16: Количество положительных и отрицательных чисел
//        Условие: Пользователь вводит размер массива и его элементы. Программа должна подсчитать и вывести количество положительных и отрицательных чисел в массиве.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество элементов: ");
//        int len = scanner.nextInt();
//        int[] arr = new int[len];
//        for (int i = 0; i < len; i++) {
//            System.out.print("Введите число[" + i + "]: ");
//            arr[i] = scanner.nextInt();
//        }
//        int pos = 0, neg = 0;
//        for (int el : arr) {
//            if (el > 0) {
//                pos++;
//            } else if (el < 0) {
//                neg++;
//            }
//        }
//        System.out.println("Количество положительных чисел: " + pos);
//        System.out.println("Количество отрицательных чисел: " + neg);

//        Задача 17: Простые числа в диапазоне
//        Условие: Пользователь вводит два целых числа A и B. Программа должна вывести все простые числа в этом диапазоне (включительно).

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите A: ");
//        int A = scanner.nextInt();
//        System.out.print("Введите B: ");
//        int B = scanner.nextInt();
//        for (int i = A; i <= B; i++) {
//            boolean isComplex = false;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isComplex = true;
//                    break;
//                }
//            }
//            if (!isComplex) {
//                System.out.println("Простое число: " + i);
//            }
//        }

//        Задача 18: Подсчет гласных и согласных в строке
//        Условие: Пользователь вводит строку. Программа должна подсчитать и вывести количество гласных и согласных букв в этой строке.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String str = scanner.nextLine();
//        int vowels = 0, consonants = 0;
//        for (char c : str.toLowerCase().toCharArray()) {
//            if ("aeiouаеёиоуыэюя".indexOf(c) != -1) {
//                vowels++;
//            } else if ("bcdfghjklmnpqrstvwxyzбвгджзйклмнпрстфхцчшщ".indexOf(c) != -1) {
//                consonants++;
//            }
//        }
//        System.out.println("Гласных: " + vowels);
//        System.out.println("Согласных: " + consonants);

//        Задача 19: Перестановка слов в строке
//        Условие: Пользователь вводит строку, состоящую из нескольких слов. Программа должна вывести слова в обратном порядке.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String str = scanner.nextLine();
//        String[] words = str.split(" ");
//        for (int i = words.length - 1; i >= 0; i--) {
//            System.out.print(words[i] + " ");
//        }

//        Задача 20: Число Армстронга
//        Условие: Пользователь вводит целое число. Программа должна проверить, является ли это число числом Армстронга.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//        int num = number;
//        int sum = 0;
//        int count = 1;
//        while (num / 10 > 0) {
//            num = num / 10;
//            count++;
//        }
//
//        num = number;
//        while (num / 10 > 0) {
//            sum += Math.pow((num % 10), count);
//            num = num / 10;
//        }
//        sum += Math.pow((num % 10), count);
//        System.out.println(sum == number ? "Число " + number + " является числом Армстронга" : "Число " + number + " не является числом Армстронга");
    }
}

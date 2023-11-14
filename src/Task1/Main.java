package Task1;

//1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
//найденные строки и их длину.
//2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
//значений их длины.
//3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
//средней, а также их длину.
//4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
//Если таких слов несколько, найти первое из них.
//5. Вывести на консоль новую строку, которой задублирована каждая буква из
//начальной строки. Например, "Hello" -> "HHeelllloo".

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Первое задание
         */

        Scanner scanner = new Scanner(System.in);

        String[] numberOne = new String[3];
        System.out.println("Введите 3 строки:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ваша " + (i + 1) + " строка:");
            numberOne[i] = scanner.nextLine();
        }
        String korotkayaStroka = numberOne[0];
        String dlinayaStroka = numberOne[0];
        System.out.println("Ваши строки:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ваша " + (i + 1) + " Строка: " + numberOne[i]);
            if (numberOne[i].length() > dlinayaStroka.length()) {
                dlinayaStroka = numberOne[i];
            }
            if (numberOne[i].length() < korotkayaStroka.length()) {
                korotkayaStroka = numberOne[i];
            }
        }
        System.out.println("Самая длинна строка: " + dlinayaStroka);
        System.out.println("И ее длинна равна: " + dlinayaStroka.length());
        System.out.println("Самая короткая строка: " + korotkayaStroka);
        System.out.println("И ее длинна равна: " + korotkayaStroka.length());

        /**
         * Второе задание
         */

        StringBuilder[] numberTwo = new StringBuilder[3];
        System.out.println("Введите 3 строки:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ваша " + (i + 1) + " строка:");
            numberTwo[i] = new StringBuilder(scanner.nextLine());
        }

        /**
         * Здесь метод пузырьком нужен для сортировки массива по длине строк
         */

        // Сортировка строк методом пузырька
        for (int i = 0; i < numberTwo.length - 1; i++) {
            for (int j = 0; j < numberTwo.length - 1 - i; j++) {
                if (numberTwo[j].length() > numberTwo[j + 1].length()) {
                    // Обмен строк, если текущая строка длиннее следующей
                    String temp = String.valueOf(numberTwo[j]);
                    numberTwo[j] = numberTwo[j + 1];
                    numberTwo[j + 1] = new StringBuilder(temp);
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Ваши строки: " + numberTwo[i]);
        }

        System.out.println("Длина первой строки:" + numberTwo[0].length());
        System.out.println("Длина второй строки:" + numberTwo[1].length());
        System.out.println("Длина третьей строки:" + numberTwo[2].length());

        /**
         * Извиняюсь на ум ничего не пришло умного))
         */

        if (numberTwo[0].length() > numberTwo[1].length() && numberTwo[0].length() > numberTwo[2].length() && numberTwo[1].length() > numberTwo[2].length()) {
            System.out.print("Порядок строк: " + numberTwo[2] + " : " + numberTwo[1] + " : " + numberTwo[0]);
        } else if (numberTwo[0].length() > numberTwo[1].length() && numberTwo[0].length() > numberTwo[2].length() && numberTwo[2].length() > numberTwo[1].length()) {
            System.out.print("Порядок строк: " + numberTwo[1] + " : " + numberTwo[2] + " : " + numberTwo[0]);
        } else if (numberTwo[1].length() > numberTwo[0].length() && numberTwo[1].length() > numberTwo[2].length() && numberTwo[2].length() > numberTwo[0].length()) {
            System.out.println("Порядок строк: " + numberTwo[0] + " : " + numberTwo[2] + " : " + numberTwo[1]);
        } else if (numberTwo[1].length() > numberTwo[0].length() && numberTwo[1].length() > numberTwo[2].length() && numberTwo[0].length() > numberTwo[2].length()) {
            System.out.println("Порядок строк: " + numberTwo[2] + " : " + numberTwo[0] + " : " + numberTwo[1]);
        } else if (numberTwo[2].length() > numberTwo[1].length() && numberTwo[2].length() > numberTwo[0].length() && numberTwo[1].length() > numberTwo[0].length()) {
            System.out.println("Порядок строк: " + numberTwo[0] + " : " + numberTwo[1] + " : " + numberTwo[2]);
        } else if (numberTwo[2].length() > numberTwo[1].length() && numberTwo[2].length() > numberTwo[0].length() && numberTwo[0].length() > numberTwo[1].length()) {
            System.out.println("Порядок строк: " + numberTwo[1] + " : " + numberTwo[0] + " : " + numberTwo[2]);
        } else if (numberTwo[0].length() > numberTwo[1].length() && numberTwo[0].length() > numberTwo[2].length()) {
            System.out.println("Порядок строк: " + numberTwo[2] + " : " + numberTwo[1] + " : " + numberTwo[0]);
        } else if (numberTwo[1].length() > numberTwo[0].length() && numberTwo[1].length() > numberTwo[2].length()) {
            System.out.println("Порядок строк: " + numberTwo[2] + " : " + numberTwo[0] + " : " + numberTwo[1]);
        } else if (numberTwo[2].length() > numberTwo[0].length() && numberTwo[2].length() > numberTwo[1].length()) {
            System.out.println("Порядок строк: " + numberTwo[0] + " : " + numberTwo[1] + " : " + numberTwo[2]);
        }

        /**
         * 3 Задание
         */

        StringBuilder[] numberThree = new StringBuilder[3];
        System.out.println("Введите 3 строки:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ваша " + (i + 1) + " строка:");
            numberThree[i] = new StringBuilder(scanner.nextLine());
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Ваши строки: " + numberThree[i]);
        }

        System.out.println("Длина первой строки:" + numberThree[0].length());
        System.out.println("Длина второй строки:" + numberThree[1].length());
        System.out.println("Длина третьей строки:" + numberThree[2].length());
        int averageLength;
        averageLength = (numberThree[0].length() + numberThree[1].length() + numberThree[2].length()) / 3;
        System.out.println("Средняя длина строк: " + averageLength);

        for (StringBuilder stroka : numberThree) {
            if (stroka.length() < averageLength) {
                System.out.println(stroka + " ---- (длина " + stroka.length() + ")");
            }
        }

        /**
         * 4 Задание
         */

        StringBuilder[] numberFour = new StringBuilder[3];
        System.out.println("Введите 3 строки:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ваша " + (i + 1) + " строка:");
            numberFour[i] = new StringBuilder(scanner.nextLine());
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Ваши строки: " + numberFour[i]);
        }
        boolean found = false;
        String uniqueWord = "";

        for (int i = 0; i < 3; i++) {
            String[] words = numberFour[i].toString().split(" ");
            for (String word : words) {
                boolean isUnique = true;
                for (int j = 0; j < word.length(); j++) {
                    if (word.lastIndexOf(word.charAt(j)) != j) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    uniqueWord = word;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Первое слово, состоящее только из различных символов: " + uniqueWord);
        } else {
            System.out.println("В введенных строках нет слов, состоящих только из различных символов.");
        }

        /**
         * 5 задание
         */

        System.out.println("Введите новую строку");
        StringBuilder numberFive = new StringBuilder(scanner.nextLine());
        System.out.println("Ваша строка: " + numberFive);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberFive.length(); i++) {
            char c = numberFive.charAt(i);
            result.append(c).append(c);
        }
        System.out.println(result.toString());
    }
}

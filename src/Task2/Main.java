package Task2;

import java.util.Scanner;

//Дана строка произвольной длины с произвольными словами. Написать программу для
//проверки является ли любое выбранное слово в строке палиндромом.
//Например, есть строка, вводится число 3, значит необходимо проверить является ли
//3-е слово в этой строке палиндромом.
//Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
//например, в строке 5 слов, а на вход программе передали число 500.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        System.out.print("Введите номер слова для проверки: ");
        int wordIndex = scanner.nextInt();

        String[] words = inputString.split(" ");

        if (wordIndex <= 0 || wordIndex > words.length) {
            System.out.println("Некорректный номер слова!");
        } else {
            String selectedWord = words[wordIndex - 1];
            if (isPalindrome(selectedWord)) {
                System.out.println("Выбранное слово является палиндромом.");
            } else {
                System.out.println("Выбранное слово не является палиндромом.");
            }
        }
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Java1Lesson3 {
    public static void main(String[] args) {



/*
*1. Написать программу, которая загадывает случайное число от 0 до 9,
*  и пользователю дается 3 попытки угадать это число.
* При каждой попытке компьютер должен сообщить больше ли указанное
*  пользователем число чем загаданное, или меньше.
* После победы или проигрыша выводится запрос – «Повторить игру еще раз?
*  1 – да / 0 – нет»(1 – повторить, 0 – нет).
*
2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana",
* "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
* "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
* "pepper", "pineapple", "pumpkin", "potato"};
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
* Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно, можно пользоваться:
String str = "apple";
str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово
Используем только маленькие буквы
 */


//   Scanner sc = new Scanner(System.in); //создание обьекта класса сканер
        //   int a = sc.nextInt(); //чтение целого числа в переменную а
        //   String b =sc.nextLine(); // чтение введеной строки
        //   String c = sc.next(); //слово до следующего пробела
        //  sc.close(); // после завершения работы со сканером его необходимо закрыть.

        /*
         *
         * ДЗ №1
         *
         */

        Scanner sc = new Scanner(System.in);
        int tryAnswer;
        int answer;
        String tryAgein;

        do {
            tryAnswer = 3;
            System.out.println("Угадайте число от 0 до 9.");
            System.out.println("У вас есть " + tryAnswer + " попытоки");


            Random rand = new Random();
            int number = rand.nextInt(10);
            //System.out.println(number);

            for (int i = 0; i <= tryAnswer + 1; i++) {
                System.out.println("Введите число: ");
                answer = sc.nextInt();
                if (answer == number) {
                    System.out.println("Вы угадали!");
                    break;
                }
                tryAnswer--;
                System.out.println("У вас осталось " + tryAnswer + " попыток");
                if (answer < number) {
                    System.out.println("Ваше число меньше загаданного");
                } else {
                    System.out.println("Ваше число больше загаданного");
                }
            }

            if (tryAnswer == 0) {
                System.out.println("Правильный ответ " + number);
            }
            System.out.println("Повторить игру еще раз?\n" +
                    "yes/no");
            tryAgein = sc.next();

        } while (tryAgein.equals("yes"));

        // sc.close();


        /*
         *
         * ДЗ №2
         *
         */
        int z;
        int quit = 0;
        do {
            char[] text = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#',};
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

            String question = generateQuestion(words);
            //System.out.println(question);

            System.out.println("Угадай какое слово я загадал?");

            do {
                String userWords = sc.next();

                if (userWords.length() < question.length()) {
                    z = userWords.length();
                } else {
                    z = question.length();
                }

                for (int i = 0; i < z; i++) {
                    char x = userWords.charAt(i);
                    char y = question.charAt(i);
                    if (x == y) {
                        text[i] = y;
                    }

                }

                if (userWords.equals(question)) {
                    System.out.println("Вы угадали!!!");
                    quit = 1;
                } else {
                    System.out.println(text);
                }

            } while (quit != 1); // не придумал как по другому выйти их цикла

            System.out.println("Повторить игру еще раз?\n" +
                    "yes/no");
            tryAgein = sc.next();

        } while (tryAgein.equals("yes"));


    }

    private static String generateQuestion(String[] words) {
        String text = "";
        Random rand = new Random();
        int x = rand.nextInt(words.length);
        return text = words[x];
    }

}











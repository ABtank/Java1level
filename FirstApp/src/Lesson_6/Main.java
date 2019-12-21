package Lesson_6;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите кол-во кошек:");
//        int xCat = sc.nextInt();

        System.out.println("Испытание кошек");
        int xCat = random.nextInt(20);
        Cat[] arrCat = new Cat[xCat];
        for (int i = 0; i < xCat; i++) {
            arrCat[i] = new Cat("Барсик№" + i);
            arrCat[i].run(random.nextInt(1000));
            arrCat[i].swim(random.nextInt(15));
            arrCat[i].jump(random.nextDouble() * 2);
            System.out.println("---------------------");
        }
        System.out.println("А теперь собачки");
//        System.out.println("Введите кол-во собак:");
//        int xDog = sc.nextInt();

        int xDog = random.nextInt(20);
        Dog[] arrDog = new Dog[xDog];
        for (int i = 0; i < xDog; i++) {
            arrDog[i] = new Dog("Бобик№" + i);
            arrDog[i].run(random.nextInt(1000));
            arrDog[i].swim(random.nextInt(15));
            arrDog[i].jump(random.nextDouble() * 2);
            System.out.println("---------------------");
        }


        System.out.println("Всего животных участвовало " + Animal.NUMBER + "\nКошек " + Cat.CATNAMBER + "\nСобачек " + Dog.DOGNUMBER);
//        sc.close();

    }


}

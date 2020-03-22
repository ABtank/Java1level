package Lesson_7.Homework7;

import java.util.Random;

public class Cat {
    private static Random random = new Random();
    private String name;
    private int appetite;
    private int hunger;
    static int EAT;
    static int HUNGRYCATS; // априори все коты голодные

    public int getAppetite() {
        return appetite;
    }

    public int getHunger() {
        return hunger;
    }

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
        this.appetite = random.nextInt(500) + 100;
        this.hunger = random.nextInt(500) + appetite; // голод = сытость наоборот.
        HUNGRYCATS++;
    }

    void eat(Plate plate) {
        if (hunger < appetite) {
            plate.decreaseFood(hunger);
            hunger = 0;
            EAT += hunger;
        } else {
            plate.decreaseFood(appetite);
            hunger -= appetite;
            EAT += appetite;
        }
    }

    void info() {
        System.out.println("Cat " + name + " голодный на " + hunger + " Аппетит его " + appetite);
    }
}

class Plate {
    private int food;
    static int ADDFOOD;
    private static Random random = new Random();

    int getFood() {
        return food;
    }

    int addFood() {
        ADDFOOD++;
        return food += random.nextInt(4000);
    }

    Plate() {
        this.food = random.nextInt(4000);
    }

    void decreaseFood(int minus) {
        food -= minus;
    }

    void info() {
        System.out.println("Food in Plate: " + food + "\n");
    }

}

class Main {

    private static Random random = new Random();
    private static int population = random.nextInt(15);

    public static void main(String[] args) {

        Cat[] catArr = new Cat[population];
        Plate redPlate = new Plate();
        redPlate.info();
        for (int i = 0; i < population; i++) {

            catArr[i] = new Cat("Kuzya№" + (i + 1));

            if (redPlate.getFood() < catArr[i].getAppetite()) {
                redPlate.addFood();
                System.out.println("!---Added food " + redPlate.getFood() + "---!" + "\n");
            }

            catArr[i].info();

            while (redPlate.getFood() >= catArr[i].getAppetite() && catArr[i].getHunger() > 0) {
                catArr[i].eat(redPlate);
            }

            if (catArr[i].getHunger() == 0) {
                System.out.println(catArr[i].getName() + " наелся. " + "Его голод = " + catArr[i].getHunger());
                Cat.HUNGRYCATS--;
            } else {
                System.out.println(catArr[i].getName() + " НЕ наелся");
                System.out.println("Голод " + catArr[i].getName() + " = " + catArr[i].getHunger());
            }
            System.out.println();
        }

        System.out.println("Total Cats: " + catArr.length);
        System.out.println("Left hungry Cats: " + Cat.HUNGRYCATS);
        System.out.println("Total eaten: " + Cat.EAT);
        System.out.println("In the Plate left: " + redPlate.getFood());
        System.out.println("Food was added to the Plate: " + Plate.ADDFOOD);
    }
}
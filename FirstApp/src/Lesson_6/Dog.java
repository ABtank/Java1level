package Lesson_6;

import java.util.Random;

public class Dog extends Animal {
    static Random random = new Random();
    private String name;
    static int DOGNUMBER;

    public Dog(String name) {
        this.name = name;
        NUMBER++;
        DOGNUMBER++;
    }

    public void run(int run) {
        this.run = run;
        int x = 500;
        if (DOGNUMBER % 2 == 0) {
            x = 400 + random.nextInt(1000);
            System.out.println("Предел в беге у собачки " + x + "м");
        }
        if (run <= x) {
            System.out.println("Пёся " + name + " смог пробежать " + run + "м");
        } else {
            System.out.println("Пёся " + name + " RIP пока бежал " + run + "м");
        }
    }

    public void swim(int swim) {
        this.swim = swim;
        if (swim > 10) {
            System.out.println("Пёся " + name + " смог проплыть " + swim + "м");
        } else {
            System.out.println("Пёся " + name + " RIP пока плыл " + swim + "м");
        }
    }

    public void jump(double jump) {
        this.jump = jump;
        if (jump <= 0.5) {
            System.out.println("Пёся " + name + " смог прыгнуть " + jump + "м");
        } else {
            System.out.println("Пёся " + name + " RIP пока пытался прыгнуть на " + jump + "м");
        }
    }

    public void info() {
        System.out.println("Собака");
    }

}

package Lesson_6;

public class Cat extends Animal {
    private String name;
    static int CATNAMBER;

    public Cat(String name) {
        this.name = name;
        NUMBER++;
        CATNAMBER++;
    }


    public void run(int run) {
        this.run = run;
        if (run <= 200) {
            System.out.println("Котяра " + name + " смог пробежать " + run + "м");
        } else {
            System.out.println("Котяра " + name + " RIP пока бежал " + run + "м");
        }
    }

    public void swim(int swim) {
        this.swim = swim;
        if (swim > 0) {
            System.out.println("Котяра " + name + " не пришлось плыть");
        } else {
            System.out.println("Котяра " + name + " RIP пока плыл " + swim + "м");
        }
    }

    public void jump(double jump) {
        this.jump = jump;
        if (jump <= 2) {
            System.out.println("Котяра " + name + " смог прыгнуть " + jump + "м");
        } else {
            System.out.println("Котяра " + name + " RIP пока пытался прягнуть на " + jump + "м");
        }
    }

    public void info() {
        System.out.println("Кот");
    }
}

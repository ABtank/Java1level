package Lesson_5;

import java.util.Arrays;

public class Java1Lesson5 {


    public static void main(String[] args) {

        Employee employee = new Employee(18);
        Employee employee1 = new Employee(18, "vlad");
        System.out.println();


        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Иванов ", "Иван ", "Иванович", "Свинопас", "pig@bk.ru", "79463454565", 20000, 25);

        emplArray[1] = new Employee("Петров ", "Баран ", "Кашерович", "Ивановапас", "ram@bk.ru", "79739545658", 40000, 35);
        emplArray[2] = new Employee("Сидоров ", "Кабан ", "Халяльнович", "Землерой", "boar@bk.ru", "79463459756", 30000, 45);
        emplArray[3] = new Employee("Хребтов ", "Бобер ", "Утконосович", "Платиностройщик", "beaver@bk.ru", "79484568565", 60000, 41);
        emplArray[4] = new Employee("Какойтов ", "Лев ", "Тушканчикович", "Босс", "lion@bk.ru", "79466666666", 1200000, 56);

        System.out.println(emplArray[0].getAge());
        System.out.println(emplArray[1].getAge());
        System.out.println(emplArray[2].getAge());
        System.out.println(emplArray[3].getAge());
        System.out.println(emplArray[4].getAge());

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].getAge() > 40) {
                emplArray[i].info();
                System.out.println("-------------------");
            }
        }


    }

}

package Lesson_5;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Конструктор класса должен заполнять эти поля при создании объекта;
     *
     * @param surname     Фамилия
     * @param name        Имя
     * @param patronymic  Отчество
     * @param position    должность
     * @param email       почта
     * @param phoneNumber тел номер
     * @param salary      зарплата
     * @param age         возраст
     */

    public Employee(String surname, String name, String patronymic, String position, String email, String phoneNumber, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public Employee() {
    }

    public Employee(int age) {
        this.age = age;
    }

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
     */


    public void info() {
        System.out.println("Ф.И.О. " + surname + name + patronymic + "\nДолжность " + position + "\nemail " + email + "\nТел. +" + phoneNumber + "\nЗ.п. " + salary + "\nВозраст " + age);
    }
}
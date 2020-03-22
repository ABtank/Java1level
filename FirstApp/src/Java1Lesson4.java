import java.util.Random;
import java.util.Scanner;

public class Java1Lesson4 {


    static int SIZE_X = 5;
    static int SIZE_Y = 5;

    static char[][] field = new char[SIZE_X][SIZE_Y];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    /**
     * Обозначения по дефолту неизменные значения
     *
     * @param PLAYER_DOT - символ игрока
     * @param AI_DOT  - символ ПК
     * @param EMPTY_DOT - пустая ячейка
     */
    static final char PLAYER_DOT = 'X';
    static final char AI_DOT = 'O';
    static final char EMPTY_DOT = '.';

    /**
    *
    * Заполнение массива точками
     */
    static void initField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    /**
    *Расчертим поле
     */
    static void printField() {
        for (int i = 0; i < SIZE_Y; i++) {
            if (i == 0) {
                System.out.print("   " + (i + 1) + " ");
            } else {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < SIZE_Y; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }

    /**
    *Ход игрока
     */

    static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X и Y:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!valid(y, x));
        setSimbol(y, x, PLAYER_DOT);
    }

    /**
     * Установка символа
     *
     * @param y - номер столбца
     * @param x - номер строки
     * @param symbol -сам символ
     */
    private static void setSimbol(int y, int x, char symbol) {
        field[y][x] = symbol;
    }

    /**
    *Проверка введенных координат. Не выходят ли они за границы.
     */
    private static boolean valid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            return false;
        }
        return field[y][x] == EMPTY_DOT;
    }


    /**
    *Ход компьютера
     */

    static int gorizont = 0;
    static int vertical = 0;
    static int diagonal = 0;

    static void aiStep() {
        int x;
        int y;


        int step = 0;

        //ПОПЫТКА УЛУЧШИТЬ AI
       /*
        for (int i = 0; i < SIZE_Y && step < 1; i++) {
            for (int j = 0; j < SIZE_X && step < 1; j++) {
                gorizont = 0;
                vertical = 0;
                if (field[i][j] == PLAYER_DOT && step < 1) {
                    gorizont = 0;
                    for (int k = j; k < SIZE_X; k++) {
                        if (field[i][k] == PLAYER_DOT) {
                            gorizont++;
                            if (gorizont > 2 && step < 1) {
                                if (!valid(i, k + 1)) {
                                    setSimbol(i, k + 1, AI_DOT);
                                    step++;
                                    break;
                                }
                            }
                        }
                    }

                }
            }
        }
        */

        if (step < 1) {
            do {
                System.out.println("Ход SkyNet");
                x = random.nextInt(SIZE_X);
                y = random.nextInt(SIZE_Y);
            }
            while (!valid(y, x));
            setSimbol(y, x, AI_DOT);
        }

    }


    /**
    *Если ничья
     */
    static boolean isFieldsFull() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == EMPTY_DOT)
                    return false;
            }
        }
        return true;
    }

    /**
    *Проверка на победу
     */
    static boolean checkWin(char symbol) {
        diagonal = 0;
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                gorizont = 0;
                vertical = 0;

                /**
                *Проверка по горизонтали
                 */
                if (field[i][j] == symbol) {
                    gorizont = 0;
                    for (int k = j; k < SIZE_X; k++) {
                        if (field[i][k] == symbol) {
                            gorizont++;
                        } else {
                            gorizont = 0;
                        }
                    }
                    if (gorizont == SIZE_X - 1) {
                        return true;
                    }
                }

                /**
                *Проверка по вертикали
                 */
                if (field[i][j] == symbol) {
                    vertical = 0;
                    for (int k = i; k < SIZE_X; k++) {
                        if (field[k][j] == symbol) {
                            vertical++;
                        } else {
                            vertical = 0;
                        }
                    }
                    if (vertical == SIZE_X - 1) {
                        return true;
                    }
                }

                /**
                *Проверка по диагонали
                 */
                if (field[i][j] == symbol && (i == j || i + j == field.length - 1)) {
                    diagonal++;
                } else {
                    diagonal = 0;
                }
                if (diagonal == SIZE_X - 1) {
                    return true;
                }
            }
        }
        return false;
    }
/*
            if (field[0][0] == symbol && field[0][1] == symbol && field[0][2] == symbol)
                return true;
            if (field[1][0] == symbol && field[1][1] == symbol && field[1][2] == symbol)
                return true;
            if (field[2][0] == symbol && field[2][1] == symbol && field[2][2] == symbol)
                return true;
            if (field[0][0] == symbol && field[1][0] == symbol && field[2][0] == symbol)
                return true;
            if (field[0][1] == symbol && field[1][1] == symbol && field[2][1] == symbol)
                return true;
            if (field[0][2] == symbol && field[1][2] == symbol && field[2][2] == symbol)
                return true;
            if (field[0][0] == symbol && field[1][1] == symbol && field[2][2] == symbol)
                return true;
            if (field[2][0] == symbol && field[1][1] == symbol && field[0][1] == symbol)
                return true;
            return false;
        }

 */

    public static void main(String[] args) {

        initField();
        printField();

        while (true) {

            /**
            *Ход игрока
             */
            playerStep();
            printField();
            /**
            *Проверка на победу игрока
             */
            if (checkWin(PLAYER_DOT)) {
                System.out.println("You WIN!!!");
                break;
            }
            /**
            *Проверка на заполненость поля
             */
            if (isFieldsFull()) {
                System.out.println("DROW!!!");
                break;
            }

             /**
            *Ход ПК
             */
            aiStep();
            printField();

            if (checkWin(AI_DOT)) {
                System.out.println("SkyNet WIN!!!");
                break;
            }
            if (isFieldsFull()) {
                System.out.println("DROW!!!");
                break;
            }
        }

    }

}
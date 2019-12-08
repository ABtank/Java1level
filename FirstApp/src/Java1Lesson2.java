import java.lang.reflect.Array;
import java.util.Arrays;

public class Java1Lesson2 {

    private static void printRandomArr(long [] arr) {
        for (int i = 0; i < arr.length; i++){
            long ar = Math.round(Math.random()*10);
            arr[i] = ar;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void printArr(int [] arr){
        for (int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void printArrLong(long [] arr){
        for (int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void checkBalanceLong(long[] arr) {
        long sum = 0L;
        long sumLeft = 0L;
        long sumRight = 0L;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i]; //  для ДЗ_6
        }
        //System.out.println("sum6=" + sum);
        if (sum%2 != 0){
            System.out.println("В массиве нет баланса");
        }
        for (int i = 0; i < arr.length; i++) {
            sumLeft += arr[i];
            sumRight = 0;
            //System.out.print("sumLeft=" + sumLeft);
            for ( int j = arr.length - 1; j > i; j--) {
            sumRight += arr[j];
            }
           // System.out.println(" sumRight=" + sumRight);
            if (sumLeft == sumRight){
                System.out.print("sumLeft=" + sumLeft);
                System.out.println(" sumRight=" + sumRight);
                System.out.println(true);
                break;
            }
        }
    }

    private static void checkBalanceInt(int[] arr) {
        int sum = 0;
        int sumLeft = 0;
        int sumRight = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i]; //  для ДЗ_6
        }
        //System.out.println("sum6=" + sum);
        if (sum%2 != 0){
            System.out.println("В массиве нет баланса");
        }
        for (int i = 0; i < arr.length; i++) {
            sumLeft += arr[i];
            sumRight = 0;
            //System.out.print("sumLeft=" + sumLeft);
            for ( int j = arr.length - 1; j > i; j--) {
                sumRight += arr[j];

            }
            // System.out.println(" sumRight=" + sumRight);
            if (sumLeft == sumRight){
                System.out.print("sumLeft=" + sumLeft);
                System.out.println(" sumRight=" + sumRight);
                System.out.println(true);
                break;
            }
        }
    }



    public static void main(String[] args) {



        //ДЗ_1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("ДЗ_1");

        int [] arr1 =  {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++){
   //         if(arr1[i] == 0){
   //             arr1[i]++;
   //         } else {
   //             arr1[i]--;
   //         }
            switch (arr1[i])  {
                case 1:
                    arr1[i]--;
                    break;
                case 0:
                    arr1[i]++;
            }
            System.out.print(arr1[i] +  ","  + " ");
        }
        System.out.println(" ");

        //ДЗ_2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("ДЗ_2");

        int [] arr2 = new int[8];
        int ar2 = 0;

        for (int i = 0; i < arr2.length; i++){
            arr2[i] = ar2;
            ar2 += 3;

            System.out.print(arr2[i] + " ");
        }

        System.out.println(" ");

        //ДЗ_3 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("ДЗ_3");


        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++){
            if(arr3[i] > 6){
                arr3[i]*=2;
            }
            System.out.print(arr3[i] +  "," + " ");
        }

        System.out.println(" ");

        //ДЗ_4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("ДЗ_4");
        int [][] arr4 = new int[5][5];
        int ar4 = 10;
        for (int i = 0; i < arr4.length; i++){
            for (int j = 0; j < arr4.length; j++){
                arr4[i][j] = ar4;
                ar4++;
                if(i == j || i + j == arr4.length - 1){
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        //ДЗ_5 ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        // Данное задание уже делал в курсе основ програмирования
        // Решил усложнить
        // Долго искал как можно за один проход по массиву найти сразу и max и min.
        System.out.println("ДЗ_5");
        long [] arr5 = new long [10];
        long max = 0L;
        long min = 100L;
        long sum = 0L;

        printRandomArr(arr5);

        for(int i = 0; i < arr5.length; i++){
            sum += arr5[ i ]; //  для ДЗ_6
            if( min > arr5[i]) {
                min = arr5[i];
                if (max < arr5[i]) {
                    max = arr5[i];
                }
            } else {
                if (max < arr5[i]) {
                    max = arr5[i];
                }
            }
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);

        //ДЗ_6
        System.out.println("ДЗ_6");
        int [] arr6 = {1, 10, 1, 1, 6,1,1,1};
        printArr(arr6);
        checkBalanceInt(arr6);
        int [] arr6_1 = {2, 2, 2, 1, 2, 2, 10, 1};
        printArr(arr6_1);
        checkBalanceInt(arr6_1);
        int [] arr6_2 = {1, 1, 1, 2, 1};
        printArr(arr6_2);
        checkBalanceInt(arr6_2);
        printArrLong(arr5);
        checkBalanceLong(arr5);


}






}

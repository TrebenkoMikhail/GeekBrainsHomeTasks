import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class HMTask3 {
    public static int i;
    public static int[] num = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

    public static void main(String[] args) {
        changeNum();
        getArr();
        arrSort();
        get2DArr ();
        arrMinMax ();
    }

    public static void changeNum() {
        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length; i++) {
            int value = num[i];
            if (value == 0) {
                num[i] = 1;
            } else {
                num[i] = 0;
            }
        }
        System.out.println(Arrays.toString(num));
    }

    public static void getArr() {
        int[] arr = new int[100];
        for (i = 0; i < arr.length; i++) {
            arr[i] = i + 1 ;
            }
        System.out.print(Arrays.toString(arr));
        }

        public static void arrSort () { // не разобрался, где здесь ошибся
        int arr [] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.print(Arrays.toString(arr));
        for (int c = 0; c < arr.length; c++) {
            int value = arr [c];
            if (value < 6) {
                value *= 2;
                System.out.println(value);
                }
            }
                }

        public static void get2DArr () {
        int [][] mass = new int[7][7];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == j) {
                    mass[i][j] = 1;
                }
                if (j == mass.length - 1 -i) {
                    mass[i][j] = 1;
                }
                System.out.format("%d ", mass[i][j] );
            }
            System.out.println();
        }

        }

        public static void entArr () throws IOException { // не понял, где здесь ошибка
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введит длину массива!");
        int len = Integer.parseInt(reader.readLine());
            System.out.println("Введите значение ячейки массива");
        int initialValue = Integer.parseInt(reader.readLine());
        int [] arrVal = new int[len];
        initialValue = arrVal [len];
        }

        private static void arrMinMax () {
        int min = 0;
        int max = 0;
        int [] arrMinMax = new int[7];
        for (int i = 0; i < arrMinMax.length; i++) {
            int val = arrMinMax[i];
            val = (int) (Math.random() * 1000);
            System.out.println(val);
        }
            System.out.println(Arrays.stream(arrMinMax).max());
            System.out.println(Arrays.stream(arrMinMax).min());
        }
    }



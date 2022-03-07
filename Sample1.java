public class Sample1 {

    public static int a = 5;
    public static int b = 10;
    public static int c = a + b;


    public static void main(String[] args) {

        System.out.println(trySum(c));
        checkNum();
        System.out.println(checkNumBool ());
        printString ();
        yearCheck ();
    }

    public static boolean trySum(int c){ // задание 1
        return c >= 10 && c <= 20;

    }

    public static void checkNum () { // задание 2
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkNumBool () {
        return a >= 0;
    } //задание 3

    public static void printString () { // задание 4
        String s = "Task2";
        int j = 6;
        for (int i=0; i < j; i++) {
            System.out.println(s);
        }
    }

    public static void yearCheck () { // задание 5
        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println("Этот год высокосный");
        } else {
            System.out.println("Этот год не высокосный");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        PrintThreeWords();

        int a;
        int b;
        checkSumSign(a = 0, b = -1);

        printColor(4);

        compareNumbers(a = 3, b = 8);

        checkNumber(a = 1);

        NegativeNumber(a = -2);

        String message = "I love Java";
        int count = 3;
        printString(message, count);

        int year = 2024;
        boolean leapYear = leapYear(year);
        System.out.println("Год " + year + " является високосным? " + leapYear);

        printArray(binaryArray);


        fillArray();

        changeArray();

        fillDiagonal();

        createArray();
    }

    public static void PrintThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static boolean printColor(int value) {
        if (value <= 0) {
            System.out.println("красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("жёлтый");
        } else {
            System.out.println("зелёный");
        }
        return false;
    }

    public static boolean compareNumbers(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkNumber(int a) {
        if (a >= 0)
            System.out.println("Число " + a + " положительное");
        else
            System.out.println("Число " + a + " отрицательное");
    }

    public static boolean NegativeNumber(int a) {
        if (a < 0) return true;
        else return false;
    }

    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean leapYear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            return true;
        else return false;
    }

    static int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Исходный массив: ");
        printArray(binaryArray);
        System.out.print("Измененный массив: ");
        printArray(binaryArray);

        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 0) {
                binaryArray[i] = 1;
            } else {
                binaryArray[i] = 0;
            }
        }
    }

    public static void fillArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        {
            int[] numbers = new int[100];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i;
            }
            System.out.print("Заполненный массив: ");
            fillArray(numbers);
        }
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}

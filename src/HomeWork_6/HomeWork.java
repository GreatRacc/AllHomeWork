package HomeWork_6;

public class HomeWork {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        fillArray(array);
        System.out.println("Массив:");
        consoleArray(array);
        System.out.println(" ");
        System.out.println("Сумма элементов по строкам:");
        sumOfLines(array);
        System.out.println(" ");
        System.out.println("Сумма элементов по столбцам:");
        sumOfColumns(array);
        System.out.println(" ");
        arrayCopy(array);
        System.out.println("Чистый массив после работ с его копией:");
        consoleArray(array);
        System.out.println(" ");
        System.out.println("Массив после работ с его исходником в другом методе:");
        changeSourceCode(array);
        consoleArray(array);
    }

    static int[][] fillArray(int[][] array) {
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count;
                count++;
            }
        }
        return array;
    }

    static void consoleArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    static void sumOfLines(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int sumLines = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumLines += array[i][j];
            }
            System.out.println("Сумма " + (i + 1) + " строки равна: " + sumLines);
        }
    }

    static void sumOfColumns(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int sumColumns = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumColumns += array[j][i];
            }
            System.out.println("Сумма " + (i + 1) + " столбца равна: " + sumColumns);
        }
    }

    static int[][] arrayCopy(int[][] arrayOriginal) {
        int[][] copyArray = new int[3][3];
        for (int i = 0; i < arrayOriginal.length; i++) {
            copyArray[i] = arrayOriginal[i].clone();
        }
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray[i].length; j++) {
                copyArray[i][j] += 5;
            }
        }
        return arrayOriginal;
    }

    static int[][] changeSourceCode(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += 5;
            }
        }
        return array;
    }
}


import java.util.*;

public class Library {
    String report = "Число должно быть больше 0.\nПопробуйте ещё раз!\n"; 

    public boolean arraySize(int size) {
        if (size <= 0) {
            System.out.println(report);
            return false;
        }
        return true;
    }

    public void arrayInitialise(double min, double max, double[] array) {
        for (int i = 0; i < array.length; i++) {
            double random_num = Math.random() * (max - min) + min;
            array[i] = random_num;
        }
    }

    public double getSmallElement(double[] array) {
        if (array == null || array.length < 1) {
            throw new NullPointerException("нет данных в массиве");
        }

        double small = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }
        System.out.println("small element = " + small);
        return small;
    }

    public void arrayDivision(double[] array) {
        if (array == null || array.length < 1) {
            throw new NullPointerException("нет данных в массиве");
        }

        Library library = new Library();
        double minElement = library.getSmallElement(array);
        if (minElement == 0) {
            minElement = 1;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] / minElement;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        int input;
        do {    
            System.out.println("Введите размер массива");
            input = scanner.nextInt();
        } while (!library.arraySize(input));
        scanner.close();

        double[] array = new double[input];
        double min = 10;
        double max = 30;

        library.arrayInitialise(min, max, array);
        System.out.println("Исходный массив\n" + Arrays.toString(array));
        library.arrayDivision(array);
        System.out.println("Результат \n" + Arrays.toString(array));
    }
}
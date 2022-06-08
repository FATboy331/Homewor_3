import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        executeTaskOne();
        executeAdditionalTask();
    }

    public static void executeTaskOne() {
        double[] randomNumbers = {3, -10, 57, 95, 15.2, -85.9, 1000, -5678, 18, 123.67, 32, -344, 23.4, 45, 321.5};
        double sum = 0;
        int counter = 0;
        boolean isFirstNegativeNumber = false;
        for (double average : randomNumbers) {
            if (isFirstNegativeNumber && average < 0) {
                continue;
            }

            if (average > 0) {
                sum += average;
                counter++;
            } else {
                isFirstNegativeNumber = true;
                sum = 0;
                counter = 0;
            }
        }
        double result = sum / counter;
        System.out.println("\tСредние арефметическое = " + result + "\n");

    }

    private static void swap(double[] array, int ind1, int ind2) {
        double tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
        System.out.println(Arrays.toString(array));
    }

    public static void executeAdditionalTask() {
        double[] randomNumbers = {3, -10, 57, 95, 15.2, -85.9, 1000, -5678};
        boolean needSorting = true;
        while (needSorting) {
            needSorting = false;
            for (int i = 1; i < randomNumbers.length; i++) {
                if (randomNumbers[i] < randomNumbers[i - 1]) {
                    swap(randomNumbers, i, i - 1);
                    needSorting = true;

                }
            }
        }

        System.out.println("\nКонечный результат " + Arrays.toString(randomNumbers));
    }
}




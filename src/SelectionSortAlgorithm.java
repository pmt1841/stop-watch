import java.util.Random;

public class SelectionSortAlgorithm {
    public String runAlgorithm() {
        int size = 100_000;
        int[] randomArray = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            randomArray[i] = rand.nextInt(size) + 1;
        }

        int max = randomArray[0];
        int min = randomArray[0];
        for (int number : randomArray) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        return "Result: Max = " + max + " | " + "Min = " + min;
    }
}

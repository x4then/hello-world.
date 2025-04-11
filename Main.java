public class Main {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};
        sortAscending(numbers);
        
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Sorts the array in ascending order using bubble sort
    public static void sortAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

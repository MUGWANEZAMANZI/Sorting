package sort;

public class Selection extends Sort {
    public static void main(String[] args) {
        Sort s = new Sort();
        s.generateArray();
        System.out.println("Before Selection Sort:");
        s.displayArray();

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] with arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("After Selection Sort:");
        s.displayArray();
    }
}

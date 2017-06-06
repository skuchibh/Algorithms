package SortingAlgorithms;

/**
 * Created by skuchibh on 6/5/2017.
 */
public class mergesort {
    private int[] numbers;
    private int[] helper;
    private int number;

    public void sort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
    }

    private void mergesort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergesort(low, middle);
            mergesort(middle + 1, high);
            System.out.println(low+" "+high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        if(high-low==1){
            System.out.println("numbers[low] = " + numbers[low]);
            System.out.println("numbers[high] = " + numbers[high]);

        }
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if(helper[i]<=helper[j]){
                numbers[k]=helper[i];i++;
            }
            else {
                numbers[k]=helper[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            numbers[k]=helper[i];
            i++;k++;
        }
    }
}
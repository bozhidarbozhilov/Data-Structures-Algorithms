package sorting;

public class QuickSort {
    public static int[] sort(int[] array){
        quickSort(array, 0, array.length);
        return array;
    }

    private static void quickSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }

        int pivotIndex = partition(input, start, end);

        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {
        int i = start;
        int j = end;
        int pivot = input[start];

        while(i < j){
            while(i<j && input[--j] >= pivot);
            if(i<j){
                input[i] = input[j];
            }
            while(i<j && input[++i] <= pivot);
            if(i<j){
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}

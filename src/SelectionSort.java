public class SelectionSort {
    public static int[] sort(int[] array){
        int[] result = array;
        for (int lastUnsortedIndex = result.length-1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            int largestIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(result[i] > result[largestIndex]){
                    largestIndex = i;
                }
            }
            swap(result, lastUnsortedIndex, largestIndex);
//            int temp = result[lastUnsortedIndex];
//            result[lastUnsortedIndex] = result[largestIndex];
//            result[largestIndex] = temp;

        }
        return result;
    }

    private static void swap(int[] arr, int i, int j){
        if(i == j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

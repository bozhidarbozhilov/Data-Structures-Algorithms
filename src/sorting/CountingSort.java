package sorting;

public class CountingSort {
    public static int[] sort(int[] array){
        countingSort(array, 1,  10);
        return array;
    }
    private static void countingSort(int[] input, int min, int max){
        int[] countArray = new int[(max - min) + 1];
        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }
        
        int j = 0;
        for (int i = min; i <= max; i++) {
            while(countArray[i-min]>0){
                input[j++] = i;
                countArray[i-min]--;
            }
        }
    }

}

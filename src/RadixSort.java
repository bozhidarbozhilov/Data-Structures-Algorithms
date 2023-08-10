
public class RadixSort {
    public static int[] sort(int[] array){
        radixSort(array, 10, 4);
        return array;
    }

    private static void radixSort(int[] input, int radix, int width) {
        //iterate over every value's digit
        for(int i = 0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
    }

    //sort values digit by digit
    private static void radixSingleSort(int[] input, int position, int radix){
        int numItems = input.length;
        //array for counting values of the digits for a given position
        int[] countArray = new int[radix];
        for(int value:input){
            countArray[getDigit(position, value, radix)]++;
        }

        // adjust counting array for stable counting sort
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i-1];
        }

        // stable counting sort
        int[] temp = new int[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for (int i = 0; i < numItems; i++) {
            input[i] = temp[i];
        }

    }

    //get the digit from a given position
    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}

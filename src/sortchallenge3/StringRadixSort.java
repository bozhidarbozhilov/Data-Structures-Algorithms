package sortchallenge3;

public class StringRadixSort {

    public static void main(String[] args) {
        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(stringsArray, 26, 5);

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }

    private static void radixSort(String[] input, int radix, int width) {
        //iterate over every character of the string
        for(int i = width - 1; i >= 0; i--){
            radixSingleSort(input, i, radix);
        }
    }

    //sort values char by char
    private static void radixSingleSort(String[] input, int position, int radix){
        int numItems = input.length;
        //array for counting values of the chars for a given position
        int[] countArray = new int[radix];
        for(String value:input){
            countArray[getDigit(position, value)]++;
        }

        // adjust counting array for stable counting sort
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i-1];
        }

        // stable counting sort
        String[] temp = new String[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex])]] = input[tempIndex];
        }

        for (int i = 0; i < numItems; i++) {
            input[i] = temp[i];
        }

    }

    //get the char from a given position
    private static int getDigit(int position, String value) {
        return (value.charAt(position)-97);
    }

}

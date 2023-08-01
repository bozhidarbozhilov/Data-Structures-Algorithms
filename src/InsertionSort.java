public class InsertionSort {
    public static int[] sort(int[] array){
        int newElement;
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            newElement = array[firstUnsortedIndex];
            int index = firstUnsortedIndex;
            while(index > 0 && array[index-1]>newElement){
                array[index] = array[index-1];
                index--;
            }
            array[index] = newElement;

        }
        return array;
    }
}

public class InsertionSort {
    public static int[] sort(int[] array){
        int newElement;
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            newElement = array[firstUnsortedIndex];
            int index = firstUnsortedIndex - 1;
            while(index >= 0){
                if(array[index] > newElement){
                    array[index+1] = array[index];
                    if(index==0){
                        array[0] = newElement;
                        break;
                    }
                    index--;
                }else{
                    array[index+1] = newElement;
                    break;
                }
            }


        }
        return array;
    }
}

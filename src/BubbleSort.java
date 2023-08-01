public class BubbleSort {
    /**
     * Returns sorted integer array depending on the passed order:
     * "incr": increasing order sorting
     * "decr": decreasing order sorting
     * @param order determine the sorting order
     * @param array an integer array to sort
     * @return sorted integer array increasing or decreasing order
     */
    public static int[] sort(String order, int[] array){

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if(order.equals("incr")){
                    if(array[i] > array[i+1]){
                        swap(array, i, i+1);
                    }
                }else if(order.equals("decr")){
                    if(array[i] < array[i+1]){
                        swap(array, i, i+1);
                    }
                }


            }
            
        }
        
        return array;
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

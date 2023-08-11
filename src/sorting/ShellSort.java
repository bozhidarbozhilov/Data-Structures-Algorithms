package sorting;

public class ShellSort {
    public static int[] sort(int[] array){
        
        for(int gap = array.length/2; gap>0;gap/=2){
            for (int i = gap; i < array.length ; i++) {
                int newElement = array[i];
                int j = i;
                while(j-gap>=0 && array[j-gap] > newElement){
                    array[j] = array[j-gap];
                    j-=gap;
                }
                array[j] = newElement;
            }
        }
        return array;
    }
}

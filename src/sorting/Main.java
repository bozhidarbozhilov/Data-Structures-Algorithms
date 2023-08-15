package sorting;

public class Main {
    public static void main(String[] args) {
        //int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        //array for counting sort
        //int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };
        //array for radix sort all numbers must be the same type and radix
        int[] intArray = { 4725, 4586, 1330, 8792, 1594, 5729 };

        int[] sorted = BucketSort.sort(intArray);

        for(int element: sorted){
            System.out.println(element);
        }

    }
}
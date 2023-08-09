public class Main {
    public static void main(String[] args) {
        //int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };

        int[] sorted = CountingSort.sort(intArray);

        for(int element: sorted){
            System.out.println(element);
        }

    }
}
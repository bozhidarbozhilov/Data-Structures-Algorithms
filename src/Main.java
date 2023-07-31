public class Main {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        int[] sorted = SelectionSort.sort(intArray);

        for(int element: sorted){
            System.out.println(element);
        }

    }
}
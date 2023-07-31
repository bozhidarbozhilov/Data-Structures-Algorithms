public class Main {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        int[] sorted = BubbleSort.sort("decr", intArray);

        for(int element: sorted){
            System.out.println(element);
        }

    }
}
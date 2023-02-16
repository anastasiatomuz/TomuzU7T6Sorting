    import java.util.Arrays;

    public class SortTester {
        public static void main(String[] args) {
            System.out.println("--- SELECTION SORT --- ");
            int[] arr1 = {29,-41,-19,31,-50,26,36,10,40,-49,20,-39,6,33,42,-47,36,13};
            // note the selectionSort method modifies the original array (rather than returning a new array that is sorted)
            Sort.selectionSort(arr1);
            System.out.println(Arrays.toString(arr1));

            System.out.println("\n--- INSERTION SORT --- ");
            int[] arr2 = {29,-41,-19,31,-50,26,36,10,40,-49,20,-39,6,33,42,-47,36,13};
            // note the insertionSort method modifies the original array (rather than returning a new array that is sorted)
            Sort.insertionSort(arr2);
            System.out.println(Arrays.toString(arr2));
        }
    }
import java.util.Arrays;

/**
 * Insertion Sort
 * @author ashish
 */
public class InsertionSort {

    /**
     * Sort Array
     * @param arr
     * @return int []
     */
    public int[] sort(int []arr)
    {
        try {
            if (arr.length == 0) {
                System.out.println("Array is Empty");
                System.exit(0);
            }
            for (int i = 1; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < arr[j - 1]) {
                        int temp;
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }


        }
        catch (NullPointerException e)
        {
            System.out.println("Array is Null");
            System.exit(0);
        }

        return arr;
    }
    public static void main(String[] args) {

        InsertionSort insertionSort=new InsertionSort();
        int []arr={10,1,8,2,4};
        insertionSort.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}

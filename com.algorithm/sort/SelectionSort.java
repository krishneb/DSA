package sort;

public class SelectionSort {

    public void selectionSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            // set current index as minimum
            int min = i;
            int temp = array[i];
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[min]) {
                    //update minimum if current is lower that what we had previously
                    min = j;
                }
            }
            array[i] = array[min];
            array[min] = temp;
        }
        System.out.print("Sorted Elements -> ");
        for(int k = 0; k < length; k++) {
            System.out.print(array[k] + " -> ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,8,5,4,2};

        System.out.print("Original Elements -> ");
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " -> ");
        }
        System.out.println();

        SelectionSort sort = new SelectionSort();
        sort.selectionSort(arr);
    }
}

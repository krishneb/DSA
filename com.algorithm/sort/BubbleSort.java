package sort;

public class BubbleSort {

    public void bubbleSort(int[] array){
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1 ; j++) {
                if (array[j] > array[j + 1]) {
                    //Swap the numbers
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Elements -> ");
        for(int k = 0; k < length; k++) {
            System.out.print(array[k] + " -> ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        System.out.print("Original Elements -> ");
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " -> ");
        }
        System.out.println();

        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(arr);
    }
}

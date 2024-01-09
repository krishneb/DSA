package dynamicprogramming;

public class Recursive {

    public static int[] dynamicRecursive(int n) {
        int[] array = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        for(int i = 2; i <= n; i++) {
            array[i] = array[i-2] + array[i-1];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] recursiveArray = dynamicRecursive(5);
        for(int i = 0; i < recursiveArray.length; i++) {
            System.out.print(recursiveArray[i] + " ");
        }
    }
}

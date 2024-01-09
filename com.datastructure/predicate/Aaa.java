package predicate;

import java.util.ArrayList;
import java.util.List;

public class Aaa {
    public int solve(int A, int B, int C, int D) {
        int number = 2;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 100000; i++) {
            if(number % A == 0 || number % B == 0 || number % C == 0) {
                list.add(number);
                //System.out.println(number);
            }
            number++;
        }
        int element = list.get(D-1);
        return element;
    }

    public int juices(int A, int B) {
        int totalSlices = 1;
        double juiceGlass = 1.0d;
        int glasses = 1;

        if(B == 0) {
            totalSlices = A * 3;
            juiceGlass = totalSlices / 2;
            glasses = (int)juiceGlass;
        }
        else {
            totalSlices = A * B;
            juiceGlass = totalSlices / 2;
            glasses = (int)juiceGlass;
        }
        return glasses;
    }

    public static int lotteryCoupons(int n) {
        // Write your code here
        int sum1 = ((n%10) + (n/10));
        System.out.print(sum1);
        int[] array = new int[n];
        //int count = 1;
        for(int i = 1; i <= array.length; i++) {
            if(i < 10){
                array[i-1] = i;
                //System.out.println(array[i-1]);

            } else {
                array[i-1] = ((i%10) + (i/10));
                //System.out.println(array[i-1]);
            }
        }
        int number = 0;
        int temp1= sum1;
        if(temp1 <= 4)
        while(temp1 > 0){
            for(int j = 0; j < array.length; j++) {
                if(array[j] == temp1) {
                    number++;
                }
            }
            temp1--;
        }
        return number;
    }

    static int alternatingCharacters(String s) {
            int count = 0;
            String str = "";
            for(int i = 0; i < s.length()-1; i++) {
                if(s.charAt(i)!=s.charAt(i+1)) {

                } else {
                    count++;
                }
            }
            str = str + s.charAt(s.length() - 1) + "";
            return count;
        }

    static int[] rotLeft(int[] a, int d) {
        String str = "";
        for(int i = 0; i < a.length; i++) {
            str = str + a[i] + "";
        }
        StringBuffer s = new StringBuffer(str);
        for(int j = 1; j <= d; j++) {
            char ch = s.charAt(0);
            s.deleteCharAt(0);
            s.append(ch);
        }
        int[] arr = new int[s.length()];
        for(int k = 0; k < s.length(); k++) {
            String temp = s.charAt(k) + "";
            arr[k] = Integer.parseInt(temp);
        }
        return arr;
    }

    public static void main(String[] args) {
        Aaa a = new Aaa();
        //int solution = a.solve(133,167,156,101);
        /*int solution2 = a.juices(7,1);
        System.out.print(solution2);*/

        //System.out.println(lotteryCoupons(5));
        //System.out.println(alternatingCharacters("AABBA"));
        int[] array = {1,2,3,4,5};

        int[] arr = rotLeft(array, 4);
        for(int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

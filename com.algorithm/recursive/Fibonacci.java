package recursive;

public class Fibonacci {
    static int n1=0,n2=1,n3=0;

    public void iterative(int count) {
        int n1 = 0, n2 = 1, n3;
        System.out.print("Iterative = " + n1 + " " + n2);//printing 0 and 1

        //loop starts from 2 because 0 and 1 are already printed
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }

    public int recursive(int n) {
        if (n <= 1)
            return n;
        return recursive(n-1) + recursive(n-2);
    }

    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        fibo.iterative(12);


        System.out.print(fibo.recursive(10));//n-2 because 2 numbers are already printed
    }
}

package recursive;

import java.math.BigInteger;

//Fibonacci of a very Large Number
public class LargeFibonacci {
    // Returns n-th Fibonacci number
    public static BigInteger fib(int n) {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        for (int j=2 ; j<=n ; j++)
        {
            c =  a.add(b);
            a = b;
            b = c;
        }

        return (a);
    }

    public static void main(String[] args)
    {
        int n = 1000;
        System.out.println("Fibonacci of " + n + "th term " +"is " + fib(n));
    }
}

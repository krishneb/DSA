package recursive;

public class Factorial {

    public int iterative(int n) {
        if (n == 0)
            return 1;
        int fact = 1;
        while(n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }

    public int recursive(int n){
        if (n == 0)
            return 1;
        else
            return(n * recursive(n-1));
    }
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println("Iterative Factorial = " + fact.iterative(5));
        System.out.println("Recursive Factorial = " + fact.recursive(6));
    }
}

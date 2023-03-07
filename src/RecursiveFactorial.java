public class RecursiveFactorial {

    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static void main(String[] args) {

        System.out.println("Factorial of 0 is: "+factorial(0));

    }

}
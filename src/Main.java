public class Main {
    public static void main(String[] args) {

        long sumOfAllNumbers = sumOfAllNumbers(9);

        System.out.println(sumOfAllNumbers);

    }

    public static long sumOfAllNumbers(long number) {


        if (number == 0) {

            return number;

        } else {

            return number  + sumOfAllNumbers(number - 1);

        }

    }

}
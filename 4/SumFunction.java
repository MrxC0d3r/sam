class SumFunctions {

    // Method to calculate sum of all even numbers in the range of A and B
    public int Sum(int A, int B) {
        int sum = 0;
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to calculate the product of the series 1.0 x 1.2 x 1.4 x ... x N
    public double Sum(double N) {
        double product = 1.0;
        for (double i = 1.0; i <= N; i += 0.2) {
            product *= i;
        }
        return product;
    }

    // Method to calculate sum of only odd digits of the number N
    public int Sum(int N) {
        int sum = 0;
        while (N > 0) {
            int digit = N % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            N /= 10;
        }
        return sum;
    }

    // Main method to create an object and call the methods
    public static void main(String[] args) {
        SumFunctions obj = new SumFunctions();

        // Sample inputs
        int A = 4;
        int B = 16;
        double N_double = 2.0; // Change this value as needed for testing
        int N_int = 43961;

        // Calling the methods and printing the results
        int sumEvenRange = obj.Sum(A, B);
        double productSeries = obj.Sum(N_double);
        int sumOddDigits = obj.Sum(N_int);

        // Displaying results
        System.out.println("Sum of all even numbers between " + A + " and " + B + " is: " + sumEvenRange);
        System.out.println("Product of the series up to " + N_double + " is: " + productSeries);
        System.out.println("Sum of odd digits of the number " + N_int + " is: " + sumOddDigits);
    }
}

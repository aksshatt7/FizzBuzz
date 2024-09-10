public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int n = 100;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;   // If n is even, divide by 2
            } else {
                n -= 1;   // If n is odd, subtract 1
            }
            steps++;         // Increment step count
        }
        System.out.println("It takes " + steps + " steps to reduce 100 to 0");

    }

}

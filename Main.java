import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
        int N;
      System.out.println("Type a number");
      N = in.nextInt();

        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i*i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i; i*j <= N; j++) {
                    isPrime[i*j] = false;
                }
            }
        }

        // count primes
        int primes = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) primes++;
        }
        System.out.println(
            "The number of primes less than equal to " + N + " is " + primes);
    }
}

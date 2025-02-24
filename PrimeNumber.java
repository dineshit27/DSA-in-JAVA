import java.util.Scanner;

/* Method Used Sieve Of Eratosthenes  */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrime(n);
        sc.close();
    }

    public static void printPrime(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 0; i < n; i++)
            primes[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (primes[p] == true) {
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (primes[i] == true)
                System.out.print(i + " ");
        }
    }
}

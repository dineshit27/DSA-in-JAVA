import java.util.Scanner;

class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = printNoOfDigitsIterative(a);
        long e = printNoOfDigitsRecursive(b);
        long f = printNoOfDigitsLogarthamic(c);
        System.out.println(d + " " + e + " " + f);

        sc.close();
    }

    public static long printNoOfDigitsIterative(long n) {

        long count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static long printNoOfDigitsRecursive(long n) {

        if (n == 0)
            return 0;
        return 1 + printNoOfDigitsRecursive(n / 10);
    }

    public static long printNoOfDigitsLogarthamic(long n) {

        return (long) Math.floor(Math.log10(n) + 1);
    }
}

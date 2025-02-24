import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = GCD(num1, num2);
        System.out.println("HCF of " + num1 + " " + num2 + " is " + hcf);
        sc.close();
    }
    /*Algorithm Used is Eucledian Algorithm*/
    public static int GCD(int num1, int num2) {
        if (num1 == 0)
            return num2;
        return GCD(num2 % num1, num1);
    }
}

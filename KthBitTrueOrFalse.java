import java.util.Scanner;
public class KthBitTrueOrFalse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int k = sc.nextInt();
        if(((number>>(k-1))&1) ==1 )
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}

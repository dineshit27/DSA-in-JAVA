import java.util.Scanner;

public class NumberOfSetBits {
    //Algorithm Used Brian Kerningam's Algorithm
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result =0;
        while(number>0){
            number = (number & (number-1) );
            // assume n = 40 now it turns n=40 & n=39 and of 40 and 39 gives 32 which eliminates all the trialing zeros also the last set bit 
            result++;
        }
        System.out.println(result);
        sc.close();
    }
}

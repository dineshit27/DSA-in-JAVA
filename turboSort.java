import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int len=sc.nextInt();
            int[] arr = new int[len];
            for(int i=0;i<len;i++){
                arr[i] = sc.nextInt();
            }
            mySort(arr,len);
        }catch( Exception e){
            sc.close();
            System.exit(0);
        }
    }
    public static void mySort(int[] arr,int len){
        Arrays.sort(arr);
        for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
    }
}
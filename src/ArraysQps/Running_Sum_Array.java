package ArraysQps;

import java.util.Scanner;

public class Running_Sum_Array {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int []ans = MaxSum(arr);
        for(int i=0; i< arr.length;i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] MaxSum(int []arr){
        int n = arr.length;
        int [] sum = new int[n];
        sum[0] = arr[0];
        for(int i = 1; i< arr.length; i++){
            sum[i]=sum[i-1]+arr[i];
        }
        return sum;
    }
}

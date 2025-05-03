// finding maximum value using scanner class

package ArraysQps;

import java.util.Scanner;

public class Maximum_Value {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Max(arr));
    }
    public static int Max(int []arr){
        int max = Integer.MIN_VALUE;
        for (int i=1; i< arr.length; i++){
            if(arr[i]> max){
                 max = arr[i];
            }
        }
        return max;
    }
}

package ArraysQps;

public class Rotate_Array_2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
public static void RotateArray(int [] arr, int k) {
        int n = arr.length;
         k = k % n;
         Reverse(arr, 0, n - 1);
         Reverse(arr, 0,  k - 1);
         Reverse(arr, k, n - 1);
}
public static void Reverse(int [] arr, int i, int j) {
        while (i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }
}


/*
we use reversal algorithm
3 steps --->
//   K=K%n;
step 1--> reverse an array  {0--> n-1}  means   Step:1 -> Reverse Complete Array
step 2--> reverse from      {0--> k-1}
step 3--> reverse from      {k--> n-1}
*/


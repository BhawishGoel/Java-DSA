package ArraysQps;

public class Rotate_Array {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray(arr,k);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void RotateArray(int[] arr, int k) {
        int n= arr.length;
         k= k%n;
         for (int j=0; j<k; j++){
             int item= arr[n-1];
         for (int i= n-2 ; i>=0 ; i--){
             arr[i+1]= arr[i];
         }
         arr[0]= item;
         }
    }
}



// o/p ---> 5 6 7 1 2 3 4  {its correct but}
// time limit exceed in leetcode

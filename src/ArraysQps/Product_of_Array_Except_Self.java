package ArraysQps;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] ans = ArrayExceptSelf(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] ArrayExceptSelf(int[] arr) {
        int n = arr.length;
        int []left = new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]= left[i-1]*arr[i-1];
        }
        int []right = new int[n];
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]= right[i+1]*arr[i+1];
        }
        for(int i=0;i<n;i++){
            left[i]= left[i]*right[i];
        }
        return left;
    }
}


/*
How to solve it ?
left[0]=1
Step:1 -> find left[i] multiplication except itself
right[n-1] = 1
Step:2 -> Find right[i] multiplication except itself
Step:3 -> find multiplication left * right
*/

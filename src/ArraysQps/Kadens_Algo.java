package ArraysQps;

public class Kadens_Algo {
    public static void main(String[] args) {
        int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSum(arr));
    }
public static int MaxSum(int[] arr) {
        int ans = Integer.MIN_VALUE;
    int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            ans = Math.max(ans, sum);
            if (sum<0) {
                sum=0;
            }
        }
        return ans;
}
}

//  whenever we got the sum negative then we neglect it & it equal to 0
// means sum = 0 then it go to the next subarray
// if(sum<0){
// sum=0; }

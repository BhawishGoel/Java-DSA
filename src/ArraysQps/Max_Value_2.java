package ArraysQps;

public class Max_Value_2 {
    public static void main(String[] args) {
        int []arr= {3,95,1,7,8,78};
        System.out.println(Max(arr));
    }
    public static int Max(int []arr){
        int max = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

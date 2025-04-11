package ArraysQps;

public class Min_Value {
    public static void main(String[] args) {
        int []arr= {10,5,9,7,8};
        System.out.println(Min(arr));
    }
    public static int Min(int []arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}

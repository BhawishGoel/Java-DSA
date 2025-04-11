package ArraysQps;

public class Reverse_Array_Range {
    public static void main(String[] args) {
        int [] arr = { 3, 4,32, 67,323,4,67,12,65,7,3,1,78,12,56};
        Reverse(arr, 3, 12);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Reverse(int [] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

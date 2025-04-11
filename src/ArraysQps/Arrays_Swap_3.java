package ArraysQps;

public class Arrays_Swap_3 {
    public static void main(String[] args) {
        int [] arr = {3,5,1,7,8};
        int [] other= {1,2,3,4,5};
        System.out.println(arr[0]+" "+arr[1]);
        Swap(arr, other);
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static void Swap(int [] arr, int []other) {
        int []temp = arr;
        arr = other;
        other = temp;
    }
}
//  it is not change bcz swap method changes in the local variable not in the array

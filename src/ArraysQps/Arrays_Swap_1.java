package ArraysQps;

public class Arrays_Swap_1 {
    public static void main(String[] args){
        int [] arr ={ 3, 5, 1,7, 8};
        System.out.println(arr[0] + " " + arr[1]);
        Swap(arr[0],arr[1]);
        System.out.println(arr[0] + " " + arr[1]);
    }
    public static void  Swap ( int a, int b){
        int temp = a ;
         a = b;
         b = temp;
    }
}

// it is not change bcz swap method changes in the local variable not in the array int temp = a ;
//         a = b;
//         b = temp;

// it changes only in the stack memory not in the heap memory
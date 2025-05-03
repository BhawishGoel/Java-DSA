package Sorting;

public class Selection_Sort {
    public static void main(String[] args) {
        int [] arr= {4,5,3,2,1,7,6};
        Sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int idx = minidx(arr, i);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;

        }
    }
    // for the finding the minimum index in an array
    public static int  minidx(int[] arr, int i){
int mini = i;
for (int j = i+ 1; j< arr.length; j++){
    if (arr[j]<arr[mini]){
        mini=j;
    }
}
return mini;
    }
}
/*
Solve :

1. Sbse phele array me se minimum value find krenge or usko index[0] se interchange krdenge   by comparing it
2. then index[0] is set after that from index[1] we do same uper step and interchange  the value at index[1]
3. Same step go on ....
*/

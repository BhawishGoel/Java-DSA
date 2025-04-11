// Finding the item in an array
package ArraysQps;

public class Linear_Search {
    public static void main(String[] args) {
        int []arr= {3,5,1,7,8};
        int item=7;
//        Search(arr,item);
        System.out.println(Search(arr,item));
    }
    public static int Search(int[] arr, int item) {
        for(int i=0;i<arr.length;i++){
            if (arr[i]== item){
                return i;
            }
        }
        return -1;
    }
}

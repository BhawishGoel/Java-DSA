package ArraysQps;

public class Tapping_Rain_Water {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(Trapping(arr));
    }
    public static int Trapping(int[] arr){
        int n = arr.length;
        int [] left = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i]= Math.max(left[i-1],arr[i]);
        }
        int [] right= new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2; i>=0;i--){
            right[i]= Math.max(right[i+1], arr[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum + Math.min(left[i],right[i])-arr[i];
        }
return sum;
    }
}

// How  to solve it ?
/*   step1: find left max
     step 2: find right max
     Step 3 :find area =  find the min of left max and right max through indices and then the value of minimum- its value = area
     step 4:  sum it
     // This concept is called prefix concept.
*/

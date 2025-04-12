package ArraysQps;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 11};
        int target = 9;
    int result[] = Sum(arr, target);
    if (result != null) {
        System.out.println(result[0]+" "+result[1]);
    }
    else {
        System.out.println(-1);
    }
    }

    public static int[] Sum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
//                     return new int[]{i, j};
                    // for priniting the indices
                }
            }
        }
        return null;
    }
}

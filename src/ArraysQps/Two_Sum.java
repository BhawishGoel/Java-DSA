package ArraysQps;

import java.util.Scanner;

public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int [n];
        for (int i=0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
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

// we solve this question by using brute force method in  which we make a nested loop means we add a loop inside loop

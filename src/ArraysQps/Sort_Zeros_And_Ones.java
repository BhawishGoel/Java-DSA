package ArraysQps;

import java.util.Scanner;

public class Sort_Zeros_And_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        int countZero = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                countZero++;
            }
        }

        for (int i = 0; i < countZero; i++) {
            System.out.print("0 ");
        }
        for (int i = countZero; i < n; i++) {
            System.out.print("1 ");
        }
    }
}

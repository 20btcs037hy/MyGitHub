import java.io.*;
import java.util.*;

public class MinMaxSum {    //user choice lentgh
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; //sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] sumArray = new int[n];
         int sum =0;
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                sum = 0;
                if (i != j) {
                    sum = arr[j];
                }
            }
            sumArray[i] = sum;
        }
        Arrays.sort(sumArray);
        System.out.print(sumArray[0] + " " + sumArray[n - 1]);
    }
}

    
}

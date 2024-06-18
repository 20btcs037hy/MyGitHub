import java.util.*;

public class InsertionSort {
    
    public static void insertionsort(int arr[]){
        // for(int i =1 ; i < arr.length ; i++){
        //     int curr = arr[i];
        //     int prev = i-1;
        //     while(prev >=0 && arr[prev]> curr){
        //         arr[prev+1]=arr[prev];
        //         prev--;
        //     }
        //     arr[prev+1] = curr;
        // }

        for(int i=0 ; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] >curr){
                arr[prev+1]
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i< arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter elements : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i]=sc.nextInt(); 
        }
        System.out.println("Sorted elements is here");
       
        insertionsort(arr);
        printArr(arr);
    }

}
// 47 35 9 70 87 23 234 34 48 90 
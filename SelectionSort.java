import java.util.*;
public class SelectionSort {
    
    public static void selectionsort(int arr[]){
    
        for(int i=0 ; i< arr.length-1;i++){
            int minPos=i;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[minPos]> arr[j]){
                    // Swap
                    minPos = j;
                }
            }
            int temp= arr[minPos];
            arr[minPos] = arr[i];
            arr[i] =temp;
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
        
        selectionsort(arr);
        printArr(arr);
    }

}
// 47 35 9 70 87 23 234 34 48 90 
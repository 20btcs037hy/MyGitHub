import java.util.*;

public class BubbleSort { 
    public static void bubblesort(int arr[]){
        for(int i =0 ; i < arr.length ; i++){
            for(int j=0 ; j< arr.length-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    // Swap 
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
        
        bubblesort(arr);
        printArr(arr);
    }

}
// 47 35 9 70 87 23 234 34 48 90 
import java.util.*;

public class CountingSort {
  
    public static void counting(int Arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<10 ; i++){
            largest = Math.max(largest,Arr[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0 ; i<10 ; i++){
            count[Arr[i]]++;
        }

        int j=0;
        for(int i=0 ; i<10 ; i++){
            while (count[i] >0) {
                Arr[j]=i;
                j++;
                i--;
            }
            
        }
    }
    public static void printArr(int Arr[]) {
        System.out.println("Sorted Array ");
        for(int i=0; i< 10 ;i++){
        System.out.print(Arr[i]+" ");

    }
    System.out.println();
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] Arr=new int[10];
        for(int i=0 ; i<10 ; i++){
            Arr[i]=sc.nextInt();
        }
        counting(Arr);
        printArr(Arr);
    }
    

}

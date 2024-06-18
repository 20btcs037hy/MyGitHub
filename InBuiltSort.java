import java.util.*;
import java.util.Collections;

public class InBuiltSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer[] Arr1=new Integer[10];
        System.out.println("enter array elements : ");
        for(int i=0 ; i<10 ; i++){
            Arr1[i]=sc.nextInt();
        }
        Arrays.sort(Arr1);
        Arrays.sort(Arr2,Collections.reverseOrder());
        printArr(Arr1,Arr2);
    }

     public static void printArr(Integer Arr1[],Integer Arr2[]){
       
        System.out.println("Sorted Array ");
        for(int i=0; i< Arr1.length ;i++){
            System.out.print(Arr1[i]+" ");
            System.out.println();
            System.out.print(Arr1[i]+" ");

        }
        System.out.println();
    }

}
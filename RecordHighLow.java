import java.util.*;

public class RecordHighLow{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] Arr=new int[n];
        
        for(int i=0 ; i<n ; i++){
            Arr[i]=sc.nextInt();
        }
        int high=Arr[0], low=Arr[0];
        for(int i=0; i<n ; i++){
            if(high < Arr[i]){
                high = Arr[i];
            }
            if(low > Arr[i]){
                low = Arr[i];
            }
         }
         System.out.println("Max recordd = "+high);
         System.out.println("Min Record = "+low);
    }
}
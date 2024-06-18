import java.util.*;

public class ArrayDynamic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array test number");
        final int size = sc.nextInt();
        int numbers[] = new int[size];
        
        // input
        System.out.print("Enter Array test number");
        for(int i=0; i<size ; i++){
           numbers[i]=sc.nextInt();
        }
        sc.close();
        int i=0;
        while(i<size){
             System.out.println("number  = "+numbers[i]);
             i++;
        }
    }
}

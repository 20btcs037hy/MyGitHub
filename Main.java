import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 9; //scn.nextInt();

        // int i = 0, midR = n/2;
        // int j = 0, midC = n/2;
        // Write your code her

        for(int i=0 ; i<n; i++){

            for(int j=0 ; j<n/2 ; j++){
                if(i==n/2){
                    System.out.print("*   ");
                }
                else{
                    System.out.print("    ");
                }
            }
            for(int k=i ; k<n ; k++){
                System.out.print("*   ");
            }

            System.out.println();
        }
            
        // for(int j=0 ; j<(n/2)+1; j++){
            
        // }
        
    }
}

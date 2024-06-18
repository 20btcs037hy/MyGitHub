import java.util.*;
public class CombinationbyJava {
    private static int fact(int num){
        int fact = 1,temp=0;
        
        for(int i=1 ; i<=num ; i++){
            fact *= i;
            temp = fact;
        }
        fact=1;
        System.out.println(fact);
        return temp;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int n_minus_r = (n-r);

        int N_fact = fact(n);
        // System.out.println(N_fact);
        int r_fact = fact(r);
        // System.out.println(r_fact);
        int n_mins_r = fact(n_minus_r);
        // System.out.println(n_mins_r);

        long nCr = (long) N_fact/r_fact*n_mins_r;   
        
        System.out.println(nCr);
    }
    
}

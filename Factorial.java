import java.util.*;
    
public class Factorial {
    public static int fact1(int num){
        int f = 1;
        for(int i=1 ; i<=num ; i++){
            f = f*i;
        }
        return f;
        }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact = fact1(n);
        System.out.println(fact);
    }
        
}

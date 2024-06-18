import java.util.*;

public class SquareNumber{
    public static void main(String [] Args){
        Scanner sc=new Scanner( System.in);
            int N=sc.nextInt();
            int sum=0;
            for(int i=1 ; i<=N ; i++){
                sum = sum + (i*i); 
        }
        System.out.println(sum);
        sc.close();
    }
}
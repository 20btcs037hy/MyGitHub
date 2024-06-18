import java.util.Scanner;

public class HCF_Two_Number {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int minimum =0;
        if(a<b){
            minimum = a;
        }else{
            minimum = b;
        }
        int answer = 0;
        for(int i=1 ; i<=minimum ; i++){
            if(a % i == 0 && b % i == 0){
                answer = i;
            }
        }
        System.out.println(answer);
    }
}

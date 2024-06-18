import java.util.Scanner;

public class Fibonacci {
    public static void main (String [] ar){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;

        for(int i=1 ; i<=n ; i++){
            if (i==1){
                System.out.println(firstNumber);
            }else if(i==2){
                System.out.println(secondNumber);
            }
            else{
                int thirdNumber = firstNumber + secondNumber;
                 System.out.println(thirdNumber);
                 firstNumber = secondNumber;
                 secondNumber = thirdNumber ; 
            }
        }
    }
}

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,temp=0,digit=0;
        temp = n;
        while(n>0){
            digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        if(temp == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }    
}

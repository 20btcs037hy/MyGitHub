import java.util.Scanner;

public class LetterOnSymbol {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();

        for(int i=0 ; i<l ; i++){
            System.out.println(s.charAt(i));
        }
    }    
}

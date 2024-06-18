import java.util.*;
public class CharacterPattern1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char letter = 'A';

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(letter);
            }
            letter++;
            if(letter>'Z'){
                letter = 'A';
            }
            System.out.println();
        }
    }        
}

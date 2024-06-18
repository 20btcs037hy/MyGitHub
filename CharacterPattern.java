import java.util.*;
public class CharacterPattern {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char StartingLetter ='A';

        for(int i=1 ; i<=n ; i++){
            char letter = StartingLetter;
            for(int j=1; j<=i ; j++){
                System.out.print (letter);
                letter++;

                if(letter >'Z'){
                    letter='A';
                }
            }
            StartingLetter++;
            System.out.println();
        }
    }
}

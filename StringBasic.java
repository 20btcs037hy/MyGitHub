import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        char arr[] ={'a','b','c','d'};
        String str = "aquib";
        String str2 = new String("ezaz");
        System.out.println(arr);
        System.out.println(str+" "+str2);
        
        String name;
        name = sc.next();
        System.out.println(name);
        System.out.println("length- "+name.length());
    }    
}

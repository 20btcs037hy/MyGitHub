public class CharAT {
    public static void main(String args[]){
        String s1="Aquib";
        String  s2="Ezaz";
        String add=s1+" "+s2;

       
        System.out.println(add);
        for(int i=0 ; i<s1.length() ; i++){
            System.out.print(add.charAt(i)+" ");
        }
        System.out.println();
    }
    
}

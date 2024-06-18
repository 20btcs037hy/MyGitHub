
public class ArrayDemo{
    public static void main(String args[]){
        
        int i=0;
        int[] marks=new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;

        while(i<3){
            System.out.println("Marks = "+marks[i]);
            i++;
        }
        i=0;
        int roll[]={1,2,3,4,5};
        while(i<5){
             System.out.println("roll = "+roll[i]);
             i++;
        }
    }
}
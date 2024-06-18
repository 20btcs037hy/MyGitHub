import java.util.*;

public class CommonElements{

    public static void main(String args[]){
        int[] Arr1={2,4,5,2,6,8,5,4};
        int[] Arr2={3,4,7,5,4,8,5,9};

        System.out.print("Commom Elemets : ");

        for(int i=0 ; i<Arr1.length ; i++){
            for(int j=0 ; j<Arr2.length ; j++){
                if(Arr1[i]==Arr2[j]){
                    System.out.print(Arr1[i]);
                    break;
                }
                
            }
        }
    }
}
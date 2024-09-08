import java.util.Arrays;

public class JavaBasics{

    public static boolean TandF(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("true");
                }
            }
            
        }
    return false;
    }
    
    public static void main(String args[]){
        int arr[] = {3,53,77,23,66,12};
        TandF(arr);
    }

}
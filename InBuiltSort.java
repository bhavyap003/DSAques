import java.util.*;
// import java.util.Collections;

public class BasicSorting{

    public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Integer arr[] = {5,4,1,3,2};
        // Array.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr(arr);
    }
}
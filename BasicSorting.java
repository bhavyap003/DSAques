import java.util.*;


public class BasicSorting{

    // 1.Bubble Sort
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j] = temp;
                }
            }
        }
    }
    
    //Bubble Sort (Optimised)
    public static void bubble_sort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int swaps=0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            if(swaps == 0)
                break;
        }
    }
    

    //PRINT THE SORTED ARRAY
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        bubbleSort(arr);
        bubble_sort(arr);
        printArr(arr);
    }
}
import java.util.*;

public class Practice{

    public static int BS(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first < last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }        
    }

    public static void printSubArrays(int numbers[]){
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k]+" ");
                    sum += numbers[k];
                    ts++;
                }
                System.out.print("Sum = "+sum);
                maxSum = Math.max(sum, maxSum);
                minSum = Math.min(sum, minSum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
        System.out.println("Minimum Subarray sum : "+minSum);
        System.out.println("Maximum Subarray sum : "+maxSum);
    }

    public static void kadanes(int numbers[]){
        int cs = 0, ms = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if (cs < 0){
                cs = 0;
            }
            cs += numbers[i];
            ms = Math.max(cs, ms);
        }
        System.out.println("Maximum sum is : "+ms);
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        kadanes(numbers);
        // int key = 29;
        // System.out.println("Index of key is : "+BS(numbers, key));
        //print
        // for(int i=0; i<numbers.length; i++){
        //     System.out.print(numbers[i]+" ");
        // }
        // System.out.println();
    }
}
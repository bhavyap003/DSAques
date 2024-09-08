import java.util.*;

public class Recursion{

    // 1.Printing in decreasing order
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }


    // 2.Printing in Increasing order
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }


    // factorial
    public static int fact1(int n){
        if(n == 0){
            return 1;
        }
        int fact = fact1(n-1) * n;
        return fact;
    }


    // 3.Calculating factorial
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }


    // sum of n numbers
    public static int sumCalc(int n){
        int sum = 0;
        if(n == 0){
            return sum;
        }
        sum = sumCalc(n-1) + n;
        return sum;
    }


    // 4.Calculating sum of n numbers
    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }


    // 5.Calculating nth term in fibonacci
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }


    // 6.Check for sorted array
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }


    // 7.First Occurence of given key
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }


    // 8.Last Occurence of given key
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }


    // 9.Calculating x^n 
    public static int power(int x, int n){ // O(n)
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);
    }


    // 10.Calculating x^n
    public static int optimizedPower(int x, int n){ // O(logn)
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }


    // 11.Tiling Problem
    public static int tilingProblem(int n){ // 2xn (floor size)
        // base case
        if(n == 0 || n == 1){
            return 1;
        }
        // vertical choice
        int fnm1 = tilingProblem(n-1);
        
        // horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;

        // return tilingProblem(n-1) + tilingProblem(n-2);
    }


    // 12.Removing duplicates in a string
    // public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
    //     if(idx == str.length()){
    //         System.out.println(newStr);
    //         return;
    //     }
    //     // kaam
    //     char currChar = str.charAt(idx);
    //     if(map[currChar - 'a'] == true){
    //         // duplicate
    //         removeDuplicates(str, idx+1, newStr, map);
    //     }else{
    //         map[currChar - 'a'] = true;
    //         removeDuplicates(str, idx+1, newStr.append(currChar), map);
    //     }
    // }


    // 13.Friends Pairing Problem
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totalWays
        int totalWays = fnm1 + pairWays;
        return totalWays;

        // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }


    public static void main(String args[]){
        // printDec(10);
        //printInc(10);
        // System.out.println();
        //System.out.println(fact1(5));
        System.out.println(sumCalc(10));
        // System.out.println(fib(10));
        // int arr1[] = {1, 2, 3, 4, 5};
        // System.out.println(isSorted(arr1, 0));
        // int arr2[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // System.out.println(firstOccurence(arr2, 5, 0));
        // System.out.println(lastOccurence(arr2, 5, 0));
        // System.out.println(power(2, 5));
        // System.out.println(optimizedPower(2, 3));

        // System.out.println(tilingProblem(4));
        // String str = "appnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean [26]);
        //System.out.println(friendsPairing(3));
    }
}





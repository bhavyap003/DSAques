import java.util.*;

public class Matrices{

    // Seach for an element in the Array
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    
    // Find the largest element from the 2D matrix
    public static int Largestsearch(int matrix[][]){
        int maxnum = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > maxnum){
                    maxnum = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element = "+maxnum);
        return maxnum;
    }

    // Find the smallest element from the 2D matrix
    public static int Smallestsearch(int matrix[][]){
        int minnum = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] < minnum){
                    minnum = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest element = "+minnum);
        return minnum;
    }

    public static void main(String args[]){
        System.out.print("Enter the elements in 3X3 aaray: ");
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix,70);
        Largestsearch(matrix);
        Smallestsearch(matrix);
    }
}
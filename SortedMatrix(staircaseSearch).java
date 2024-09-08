import java.util.*;

public class Matrices{

    // Starting with top right corner
    public static boolean staircaseSearch1(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    // Starting with bottom left corner
    public static boolean staircaseSearch2(int matrix[][], int key){
        int row = matrix.length-1, col = 0;

        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] == key){
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40,}, {15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 35;
        staircaseSearch1(matrix,key);
    }
}
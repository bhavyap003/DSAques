import java.util.*;

public class Matrices{

    public static void Transpose(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        
        while(startRow < matrix.length && startCol < matrix[0].length){
            for(int i=0; i<matrix.length; i++){
                System.out.print(matrix[i][startCol]+" ");
            }
            System.out.println();
            startCol++;
        }
    }

    public static void main(String args[]){
        int matrix[][] = {{1,21,5},{33,9,63},{17,8,90}};
        Transpose(matrix);
    }
}
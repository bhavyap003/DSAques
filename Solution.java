import java.util.*;

// Area of Square

public class Solution{
    public static void main(String args[]){
        Scanner size = new Scanner(System.in);
        int side = size.nextInt();

        int Area = side * side;

        System.out.println("Area of the Square is : " + Area);

    }
}
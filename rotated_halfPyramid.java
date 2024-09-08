public class rotated_halfPyramid{

    public static void rotated_halfPyramid(int n){
        //outer
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        rotated_halfPyramid(7);
    }
}
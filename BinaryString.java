public class BinaryString{

    // For no consecutive ones
    public static void printBinString(int n, int lastPlace, String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        //kaam
        printBinString(n-1, 0, str+"0");

        if(lastPlace == 0){
            printBinString(n-1, 1, str+"1");
        }
    }

    // For no consecutive zeros 
    public static void printBinString1(int n, int lastPlace, String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        //kaam
        if(lastPlace == 1){
            printBinString(n-1, 0, str+"0");
            printBinString(n-1, 1, str+"1");
        }else{
            printBinString(n-1, 0, str+"0");
        }
    }

    public static void main(String args[]){
        printBinString(3, 0, "");
        //printBinString1(3, 1, "");
    }
}
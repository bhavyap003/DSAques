import java.util.*;

public class LeapYear{
    public static void LeapYear(int n){
        if((n%4 == 0) && ((n%100 != 0) || ((n%100 == 0) && (n%400 == 0)))){
            System.out.println(n+ " is a leap Year");
        }
        else
            System.out.println(n+ " is not a Leap Year");
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        LeapYear(num);
    }
            
}
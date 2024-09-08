import java.util.*;

public class Reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be Reversed : ");
        int num = sc.nextInt();
        int rev = 0;
        while(num > 0){
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num /= 10;
        }
        System.out.println(rev);

    }
}
import java.util.*;

public class Bill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cost of Pencil : ");
        float Pencil = sc.nextFloat();
        System.out.println("Cost of Pen : ");
        float Pen = sc.nextFloat();
        System.out.println("Cost of Eraser : ");
        float Eraser = sc.nextFloat();

        float Total = Pencil + Pen + Eraser;
        float price = Total + (Total * (float)18/100);

        System.out.println("The Total Price : "+price);
    }
}
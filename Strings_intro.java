import java.util.*;

public class Strings{

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        String firstName = "Bhavya";
        String lastName = "Pandey";
        String fullName = firstName + " " + lastName;

        printLetters(fullName);
    }
}
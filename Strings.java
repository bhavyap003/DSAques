import java.util.*;

public class Strings{

    public static String Anagrams(String str, String newStr){
        int count = 0;
        
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<newStr.length(); j++){
                if(str.charAt(i) == newStr.charAt(j)){
                    count++;
                }
            }
        }
        if(count == str.length()){
            System.out.println("The two Strings are Anagrams of each other.");
        }
        return str;
    }
    

    public static void main(String args[]){
        String str = "warr";
        String newStr = "raw";
        System.out.println(Anagrams(str, newStr));
    }
}
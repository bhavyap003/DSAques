import java.util.*;

public class Strings{

    // Compress if appearing more than 1
    public static String compress(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    }

    // Compress if appearing more than 2
    public static String compress2(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count == 2){
                newStr += str.charAt(i);
            }
            if(count > 2){
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String args[]){
        String str = "aaabccddd";
        System.out.println(compress(str));
        System.out.println(compress2(str));
    }
}
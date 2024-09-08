import java.util.*;

public class Strings{

    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Bhavya");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        // O(26)
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
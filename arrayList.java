import java.util.*;

public class arrayList{
    
    // Question1 - O(n)
    public static boolean isMonotonic(ArrayList<Integer> list){
        boolean inc = true;
        boolean dec = true;

        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                inc = false;
            }
            if(list.get(i) < list.get(i+1)){
                dec = false;
            }
        }
        return inc || dec;
    }

    // 2 Pointer approach - O(n)
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp){
            // case 1
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }
            // case 2
            if(list.get(lp)+list.get(rp) < target){
                lp++;
            }else{
                // case 3
                rp--;
            }
        }
        return false;
    }

    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(4);
        // list.add(9);
        // list.add(10);
        // int target = 16;
        System.out.println(isMonotonic(list));
    }
    
}
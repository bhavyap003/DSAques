import java.util.*;

public class arrayList{

    // Maximum element
    public static void max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
            // max = Math.max(max, list.get(i));
        }
        System.out.println("Max element = " + max);
    }

    // Swap two numbers
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        max(list);        

        int idx1 = 1, idx2 = 3;
        swap(list, idx1, idx2);
        System.out.println(list);

    }
}
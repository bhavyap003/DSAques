import java.util.*;

public class Strings{

    public static float ShortestPath(String path){
        int x=0, y=0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            // south
            if(dir == 'S'){
                y--;
            }
            // north
            if(dir == 'N'){
                y++;
            }
            //east
            if(dir == 'E'){
                x++;
            }
            // west
            if(dir == 'W'){
                x--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]){
        String path = "NS";
        System.out.println(ShortestPath(path));
    }
}
import java. util.ArrayList;
import java. util.Collections;


public class AllDivisors {
    static ArrayList<Integer> allDivisor(int x){
        ArrayList<Integer> y= new ArrayList<>();
        for(int i=1;i*i<x;i++){
            if(x%i==0){
                y.add(i);
                y.add(x/i);
            }
        }
        Collections.sort(y);
        return y;
    }
    public static void main(String[] args) {
        System.out.println(allDivisor(100));
    }
}

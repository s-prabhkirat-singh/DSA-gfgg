import java.util.ArrayList;

public class zeroes_to_the_end{
    static ArrayList xy (int [] x){
        ArrayList<Integer> Arl = new ArrayList<>(x.length);
       
        for(int i=0;i<x.length;i++){
            if(x[i]!=0){
                Arl.add(x[i]);
            }
        }
        for(int i=Arl.size();i<x.length;i++){
            Arl.add(0);
        }
        return Arl;
}}

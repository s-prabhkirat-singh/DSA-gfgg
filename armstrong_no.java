// any no to be an armstrong no is == 153------1*1*1 +5*5*5+3*3*3=153
import java.lang.Math;
public class armstrong_no {
    static boolean armstrong(int n){
        int ans=0;
        int y=n;
        String len= String.valueOf(n);
        while(y>0){
             int x=y%10;
           x=(int)Math.pow((double)x,len.length());
            ans=ans+x;
            y=y/10;
        }
        if(ans==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(armstrong(9474));
    }
}

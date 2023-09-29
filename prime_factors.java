import java.util.ArrayList;
 
public class prime_factors {
       static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        if(n==2 || n==3){
            return true; 
        }
        if(n%2==0||n%3==0){
            return false;
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0||n%(i+2)==0){
                return false;
            }
        }
        
        return true;
    }
    static ArrayList<Integer>x(int x){
        ArrayList<Integer> y= new ArrayList<>();
        int n=x;
        for(int i=0;i*i<x;i++){
             System.out.println(i);
            if(isPrime(i)==true){
                while(n%i==0){
                    n=n/i;
                    y.add(i);
                }
            }

        }
        if(n>1){
            y.add(n);
        }
           
        return y;

    }
    public static void main(String[] args) {
        System.out.println(x(255));
    }
}

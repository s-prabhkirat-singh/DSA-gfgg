// COMPUTING POWER

public class X_TO_POWER_N{
    //---------------O(n)
    static int naive_power(int x, int n){
        if(x==0 ||x==1){
            return 1;
        }
       int temp=1;
        for(int i=0;i<n;i++){
            temp=temp*x;
        }
        return temp;
    }

    //--------------------)O(log(n))  SPACE O(LOG(N))
    static int power_eff(int x, int n){
        if(n==0){
            return 1;
        }
        int temp=power_eff(x,n/2);
        temp=temp*temp;
        if(n%2==0){
            return temp;
        }
        else{
            return temp*x;
        }

    }
    public static void main(String[] args) {
        System.out.println(naive_power(3, 5));
        System.out.println(power_eff(3, 5));
    }
}
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
        System.out.println(iterative(3, 5));
    }



/// also we have a solution of Iterative power with the time complexity of O(log n)
// and with the space complexity of O(1)--- By USING THE ITERATIVE APPROACH


static int iterative(int x, int n){
    int res=1;

    while(n>0){
        if(n%2!=0){
            res=res*x;
        }
        x=x*x;
        n=n/2;
    }
    
    return res;

}}
public class eff_trail_zero {
    static int counttrail(int n){
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res=res+(n/i);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(counttrail(100));
        double x=1.3   , y=2.3;
        double z=x+y;
        System.out.println(z);
    }
}

//Time complexity(log n)
  
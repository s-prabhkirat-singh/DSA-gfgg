import javax.sound.midi.Soundbank;

public class least_common_factor {
    // static int LCM_naive(int a, int b){
    //     //O(a*b= max(a,b))
    //     int res=Math.max(a,b);
    //     while(true){
    //     if(res%a==0 && res%b==0){
    //         return res;
    //     }
    //     res++;}

    // }


  //-----------------------------------------------------------------------
  static int gcd(int a, int b){
    if(b==0){
        return a;
    }else{
       return gcd(b,b%a);
    }
  }
  static int LCm_eff(int a, int b){
    return (a*b)/(gcd(a, b));

  }
    public static void main(String[] args) {
        // System.out.println(LCM_naive(4, 6));
        System.out.println(LCm_eff(4, 6));
    }
}

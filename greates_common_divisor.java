import java.util.*;

public class greates_common_divisor {
//  static int GCD__Naive_start(int a,int b){
//     int var=1;
//     if(a<b){
//     for(int i=2;i<=a;i++){
//         if(a%i==0 && b%i==0){
//          var=i;
//         }

//     }}
//     else{
//     for(int i=2;i<=b;i++){
//        if(a%i==0 && b%i==0){
//          var=i;
//         }

//     }
//     }
//     return var;
//  }
// static int GCD_naive_end(int a,int b){
//     // TIME COMPLEXITY IS o(MIN(A,B))
//     int rem=Math.min(a,b);
//     while(true){
//         if(a%rem==0 && b%rem==0){
//             return rem;
//         }
//         else{
//             rem--;
//         }
//     }
// }
// static int GCD_Euclid_basic(int a, int b){
//     while(a!=b){
//         if(a>b){
//             a=a-b;
//         }else
//         {
//             b=b-a;
//         }
//     }return a;
// }
static int Euclid_optimised(int a, int b){
    if(b==0){
        return a;
    }
    else{
        return Euclid_optimised(b,a%b);
    }
}
 public static void main(String[] args) {
    // System.out.println(GCD__Naive_start(32, 20));
    // System.out.println(GCD_naive_end(9,21));
    // System.out.println(GCD_Euclid_basic(10,200));
    System.out.println(Euclid_optimised(12, 15));
 }
}
 
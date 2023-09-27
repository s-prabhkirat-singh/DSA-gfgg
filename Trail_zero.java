public class Trail_zero {
    
  static int trail_zero(int x){
    int rem=0;
    for(int i=5;i<=x;i=i*5){
      rem=rem+(x/i);
    }
    return rem;
  }
   static long  fact(int n){
      if(n==0||n==1){
          return 1;
      }else{
          return n*fact(n-1);
      }
      }
      public static void main(String[] args) {
        // int count =0;
        //   long f=fact(10);
        // Ist approach


        //   while(f>0){
        //     long c=f%10;
        //     f=f/10;
        //     if(c==0){
        //         count++;
        //     }
        //   }
        //   System.out.println(count);

            // IInd approach
        
            System.out.println(trail_zero(100));

      }}
  
    


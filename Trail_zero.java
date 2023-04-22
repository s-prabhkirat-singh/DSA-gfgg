public class Trail_zero {
    


    static long  fact(int n){
      if(n==0||n==1){
          return 1;
      }else{
          return n*fact(n-1);
      }
      }
      public static void main(String[] args) {
        int count =0;
          long f=fact(10);
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
            while(f%10==0){
                count++;
                f=f/10;
            }
            System.out.println(count);







      }}
  
    


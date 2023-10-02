// Seive of eratosthenes 
// in this algorithm we will declare a boolean array which will store all the values as true, and update as required\

// we will solve the same questioin by 3 approaches
//-------------------------------1ST APPROACH--------------------------//

import java.util.Arrays;

public class pRIME_SMALLER_THAN_A_NO {
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
    //-------------------------------1ST APPROACH--------------------------//
    static void naive(int n){
        for(int i=0;i<n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    //-------------------------------2ND APPROACH--------------------------//
    static void seive(int n){
        boolean [] boolPrime = new boolean[n];
        Arrays.fill(boolPrime,0,n-1,true);
        for(int i=2;i*i<n;i++){
            if(isPrime(i)){
                for(int j=2*i;j<n;j=j+i){
                    boolPrime[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
           if(boolPrime[i]){
            System.out.println(i);
           }
        }
    }
    //-------------------------------3RD APPROACH--------------------------//
    static void seive_eff(int n){
        boolean [] boolPrime = new boolean[n];
        Arrays.fill(boolPrime,0,n-1,true);
        for(int i=2;i*i<n;i++){
            if(isPrime(i)){
                for(int j=i*i;j<n;j=j+i){
                    boolPrime[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
           if(boolPrime[i]){
            System.out.println(i);
           }
        }
    }
    public static void main(String[] args) {
        // naive(100);
        seive(999);
    }
}

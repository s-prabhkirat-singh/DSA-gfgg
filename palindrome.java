import java.util.Scanner;

public class palindrome {

    public static boolean palin(int x){
        boolean y=false;
        int z=x;
        int rev=0;
        while (x>0){
            rev=rev*10 +(x%10);
            x=x/10;

        }
     return(z==rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y=x;
        int rev=0;
        System.out.println(palin(x));

    }
}

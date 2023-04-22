import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y=x;
        int rev=0;
        while(x>0){
            rev=rev*10+(x%10);
            x=x/10;
        }
        if(rev==y){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}

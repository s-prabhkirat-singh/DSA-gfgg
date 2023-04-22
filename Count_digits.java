import java.util.Scanner;


public class Count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int count=0;
        while(x>0){
            count++;
            x=x/10;
            System.out.println(x);
        }
        System.out.println(count);

    }
}

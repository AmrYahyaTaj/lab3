/**
 * Created by learn on 03/10/22.
 */
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the 3 number: ");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        if (a<b&&b<c)
            System.out.println("increasing");
        else if (a>b&&b>c)
            System.out.println("decreasing");
        else System.out.println("neither");
    }
}

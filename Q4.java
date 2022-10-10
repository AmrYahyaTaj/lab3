/**
 * Created by learn on 03/10/22.
 */
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number: ");
        a=input.nextInt();
        if (a<0)
            b=a*-1;
        else b=a;
        if (b<10&&b>=0)
            System.out.println("1");
        else if (b<100&&b>=10)
            System.out.println("2");
        else if (b<1000&&b>=100)
            System.out.println("3");
        else if (b<10000&&b>=1000)
            System.out.println("4");
        else if (b<100000&&b>=10000)
            System.out.println("5");
        else if (b<1000000&&b>=100000)
            System.out.println("6");
        else if (b<10000000&&b>=1000000)
            System.out.println("7");
        else if (b<100000000&&b>=10000000)
            System.out.println("8");
        else if (b<1000000000&&b>=100000000)
            System.out.println("9");
        else if (b<10000000000l&&b>=1000000000)
            System.out.println("10");


    }
}


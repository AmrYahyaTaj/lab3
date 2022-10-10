/**
 * Created by learn on 03/10/22.
 */
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number: ");
        a=input.nextInt();
        if (a>0)
            System.out.println("positive.");
        else if (a<0)
            System.out.println("negative.");
        else System.out.println("zero");
    }
}

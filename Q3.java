/**
 * Created by learn on 03/10/22.
 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class Q3 {


        public static void main(String[] args) {
            int x;
            char y;
            String color;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number :");
            x = input.nextInt();
            System.out.println("Enter later from a to h :");
            y = input.next().charAt(0);
            if ((y == 'a') || (y == 'c') || (y == 'e') || (y == 'f'))
            {
                if (x % 2 == 1) {
                    color = "Black";
                    System.out.println(color);
                } else if (x % 2 == 0) {
                    color = "White";
                    System.out.println(color);
                }
            }
            else if ((y == 'b') || (y =='d' ) || (y == 'f') || (y == 'h'))
                if (x % 2 == 0) {
                    color = "Black";
                    System.out.println(color);
                } else if (x % 2 == 1) {
                    color = "White";
                    System.out.println(color);
                }

        }

}

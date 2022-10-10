/**
 * Created by learn on 03/10/22.
 */
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        int day, month;
        String season = "alia";
        Scanner in = new Scanner(System.in);
        System.out.println("enter the day and month : ");
        day = in.nextInt();
        month = in.nextInt();
        if ((month == 1) || (month == 2) || (month == 3)) {
            season = "winter";
        } else if ((month == 4) || (month == 5) || (month == 6)) {
            season = "spring";
        } else if ((month == 7) || (month == 8) || (month == 9)) {
            season = "summer";
        } else if ((month == 10) || (month == 11) || (month == 12)) {
            season = "fall";
        }
        if ((month%3==0) && (day >= 21)) {
            if (season =="winter")
                season ="spring";
            else if (season =="spring")
                season ="summer";
            else if (season =="summer")
                season ="fall";
            else if(season =="fall")
                season = "winter";
        }
        System.out.println("the season is "+season);
    }
}

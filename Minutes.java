/**
 * This program converts a number of hours, days, and years into minutes.
 * 
 */

import java.util.Scanner;

public class Minutes{
    
    public static void main(String[] args){
        
        //your code here
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter the number of hours you wish to convert into minutes");
        int hours=in.nextInt();
        double hoursIntoMinutes=hours*60;
        System.out.println(hoursIntoMinutes + " " +"minutes");
      
        System.out.print("Please enter the number of days you wish to covert into minutes");
        int days= in.nextInt();          
        double daysIntoMinutes= days*24*60;
        System.out.println(daysIntoMinutes + " "+ "minutes");
          
        
        System.out.print("Please enter the number of weeks you wish to convert into minutes");
        int weeks=in.nextInt();
        double weeksIntoMinutes=weeks*7*24*60;
        System.out.println(weeksIntoMinutes + " " + "minutes");
          
        System.out.print("Please enter the number of years you wish to convert into minutes");
        int years=in.nextInt(); 
        double yearsIntoMinutes=years*365*24*60;
        System.out.println(yearsIntoMinutes + " " + "minutes"); 
          
    }
}
 

package com.water;
import java.util.*;

public class Agilewater {

    public static void main(String[] args) {
        // write your code here
        Scanner numScanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        ///A series of yes no questions where asked in order to simplify the program
        System.out.println("Is there more than 12 programmers? (y/n)");

        String num = scanner.nextLine();
        //converted to lowercase
        String num2 = num.toLowerCase();


        System.out.println("Is there a fixed deadline? (y/n)");

        String deadline = scanner.nextLine();
        String deadline2 = deadline.toLowerCase();

        System.out.println("Do the programmers have experience inn requirements, " +
                "analysis , and testing? (y/n)");

        String exp = scanner.nextLine();
        String exp1 = exp.toLowerCase();


        System.out.println("Are there more than one location? (y/n)");

        String loc = scanner.nextLine();
        String loc1 = loc.toLowerCase();

        System.out.println("Are there stringent quality control requirements? (y/n)");

        String q = scanner.nextLine();
        String q1 = q.toLowerCase();

        System.out.println("Does the customer neeed working models early? (y/n)");

        String mod = scanner.nextLine();
        String mod1 = mod.toLowerCase();

        String val = "y";

        agileOrWaterfall(num2, deadline2, exp1, loc1, q1, mod1, val);

        //this is the function we will then call in our print statement
        System.out.println("our suggestion is : " + agileOrWaterfall(num2, deadline2, exp1, loc1, q1, mod1, val));


    }

    public static String agileOrWaterfall(String q1, String q2, String q3, String q4,
                                          String q5, String q6, String q7) {
        // set each string value equal to what is being parsed through the sting

        String aq1 = q1;
        String aq2 = q2;
        String aq3 = q3;
        String aq4 = q4;
        String aq5 = q5;
        String aq6 = q6;
        String answer = q7;

        //add all the individual strings together into a super string like a super pac
        //no spacing is needed
        String aqtotal = aq1 + aq2 + aq3 + aq4 + aq5 + aq6;
        // split the string into an array
        String aqtotalArray[] = aqtotal.split("");
        //the following are suggestions that will be returned
        String suggestionA = "Waterfall is best";
        String suggestionB = "Agile is best";
        String sugeestionC = "Your call ";

        //intialize the summing value
        int sum = 0;

        //place our array into for loop

        for (int i = 0; i < aqtotalArray.length; i++) {
            if (aqtotalArray[i].equalsIgnoreCase("Y")) {
                sum = sum + 1;
                //System.out.println(sum);
            }
        }

        //checks the value of the sum printed
        // if sum is greater than 3 prints waterfall
        System.out.println(sum);
        if (sum > 3) {
            return suggestionA;
        }
        //if sum is equal to 3 to three prints your call
        else if (sum == 3) {
            return sugeestionC;
        }
        // looking for if the sum is less than 3
        else if (sum < 3) {
            return suggestionB;
        } else {
            //just return you are not sure
            return sugeestionC;
        }


    }
}




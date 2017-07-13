/**
 * Created by Grand Circus Student on 7/12/2017.
 */

import java.util.Scanner;
public class MainClass {

    public static void main(String[] args) {

        //initialize the variables you need and create your scanner
        int userNum;
        Scanner scan = new Scanner(System.in);

        //Introduce program
        System.out.println("Learn your Squares & Cubes!");

        System.out.print("Please enter a number: ");
        userNum = scan.nextInt();
        System.out.println();

        System.out.println("\t" +"Number" + "\t" + "Squared" + "\t" + " Cubed");
        System.out.println("\t" + "=======" + "\t" + "=======" + "\t" + "=======");

        //start 'for loop' (set new int var to 0, set i <= userNum, i++)
        for (int i = 0; i <= userNum; i++) {

            System.out.println("\t" + i + "\t" + "\t" + (int)(Math.pow(i,2)) + "\t" + "\t " + (int)(Math.pow(i,3)) + "\t" );

        }

    }
}

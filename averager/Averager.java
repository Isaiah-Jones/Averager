/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averager;

/**
 * CSC 206
 * Mr. Osborne
 * @author Isaiah J Jones
 * 1/25/17
 */
//Import Scanner
import java.util.Scanner;

public class Averager {
    //Have the user input 6 units.
    //Store the 6 units.
    //Then, print the 6 and their average. 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare variables for the six units and the average
        double unit1;
        double unit2;
        double unit3;
        double unit4;
        double unit5;
        double unit6;
        double avrge;

        // Prompt the user for 6 units
        System.out.println("Input any 6 numbers");

        //Retrieve and store the 6 digits
        Scanner input = new Scanner(System.in);
        unit1 = input.nextDouble();
        unit2 = input.nextDouble();
        unit3 = input.nextDouble();
        unit4 = input.nextDouble();
        unit5 = input.nextDouble();
        unit6 = input.nextDouble();

        //Gather the units
        String allUnits = (unit1 + " " + unit2 + " " + unit3 + " " + unit4 + " " + unit5 + " " + unit6);

        // Find the average
        avrge = ((unit1 + unit2 + unit3 + unit4 + unit5 + unit6) / 6);

        //Print out the 6 units and their average
        System.out.println(allUnits + " Average:" + avrge);

    }

}

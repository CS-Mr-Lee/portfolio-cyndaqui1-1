/**
 * Name: Franklin Zhang
 * Date: 20222-02-08
 * Description: A program to solve a SAS triangle problem, with the user providing just two sides and an angle
 * 
 * P.S. Sorry Mr Lee, I actually do not understand this math, so I am unable to explain properly
 */

import java.util.*; //imports all modules from util library in java

public class Franklin_Zhang_SASTriangleSolver {

	static Scanner scanner = new Scanner(System.in);// declare a Scanner object

	/**
	 * Calculates and returns the value to solve the SAS triangle problem
	 * 
	 * @param sideOne first known value of triangle length
	 * @param sideTwo second known value of triangle length
	 * @param knownAngle value of sole known angle
	 * 
	 * @return returns the smallest angle in degrees of the triangle in double format
	 */

	public static double calculate(double sideOne, double sideTwo, double knownAngle) {


	    double smallerAngle; // declare missing variables
	    double missingSide; // declare missingSide
	    double missingAngle; // missingAngle

	    missingSide = cosineLaw(knownAngle, sideTwo, sideOne); // Find missing side with method cosineLaw, using known angle and two sides provided

	    double[] sides = {missingSide,sideOne,sideTwo}; // array of sides of triangle declared

	    double smallerSide = sides[0];
	    for (int i = 1; i < 3; i++) { // ensure smallerSide inherits the smallest element in array sides
	    	if (sides[i] < sides[i-1]) {
	    		smallerSide = sides[i];
	    	} 
	    }

	    smallerAngle = radianToDegree(sineLaw(smallerSide, knownAngle, missingSide)); // using the known angle, smaller side and missing side we solved, we find the smallest of the remaining two angles, and converts it to degrees from radian
	    knownAngle = radianToDegree(knownAngle); // converts known angle from radian to degree

	    missingAngle = 180 - smallerAngle - knownAngle; // find remaining angle by subtracting two known angles

	    double[] angles = {missingAngle,smallerAngle,knownAngle}; // declare array of angles of triangle

	    double smallestAngle = angles[0]; 

	    for (int i = 1; i < 3; i++) { // ensure smallestAngle inherits the smallest element in angles array
	    	if (angles[i] < angles[i-1]) {
	    		smallestAngle = angles[i];
	    	}
	    }

	    return smallestAngle;

	  }

	  public static void main(String[] args) {


	    double sideOne;
	    double sideTwo;
	    double knownAngle;

	    System.out.print("What is the length of one side: "); // prompt user to input a side of the triangle
	    sideOne = scanner.nextDouble();
	    scanner.nextLine();

	    System.out.print("What is the length of second side: "); // prompt user to input second side of triangle
	    sideTwo = scanner.nextDouble();
	    scanner.nextLine();

	    System.out.print("What is the measure of the known angle: "); // prompt user to input measure of known angle
	    knownAngle = scanner.nextDouble();
	  	System.out.printf("%.2f",calculate(sideOne,sideTwo,knownAngle));
	  }


	  /**
	   * @param knownAngle : the sole known angle of the triangle
	   * @param sideB : side b or 2 of triangle
	   * @param sideC : side c or 3 of triangle
	   * @return - side length a of triangle
	   */
	  private static double cosineLaw(double knownAngle,double sideB, double sideC) {
	  	return Math.sqrt(((sideB * sideB) + (sideC * sideC)) - (2 * (sideB * sideC) * Math.cos(knownAngle))); // a^2 = b^2 + c^2 - 2bc * (sinA)
	  }

	  /**
	   * @param double shorterSide: the shorter side of the triangle
	   * @param givenAngle: the sole angle given to us by user
	   * @param sideOppGivenAngle : missing angle found out with method cosineLaw
	   * @return - radian value of the smaller angle of two unknown angles of triangle
	   */
	  private static double sineLaw(double shorterSide, double givenAngle, double sideOppGivenAngle) {
	    return Math.asin(shorterSide * (Math.sin(givenAngle) / sideOppGivenAngle)); // (sin A)/a = (sin B)/b = (sin C)/c,
	  }

	  private static double radianToDegree(double rad) {
	    return Math.toDegrees(rad);
	  }
}
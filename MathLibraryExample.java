public class MathLibraryExample {
 private static int i = 7;
 private static int j = -9;
 private static double x = 72.3;
 private static double y = 0.34;
 /**
 * Helper utility used to print a String to STDOUT.
 * @param s String that will be printed to STDOUT.
 */
 private static void prt(String s) {
 System.out.println(s);
 }
 private static void prt() {
 System.out.println();
 }
 /**
 * Helper utility used to print all variables used through out all
 * example Math methods.
 */
 private static void printVariables() {
 prt("PRINT VARIABLES");
 prt("===========================================");
 prt(" (int) i = " + i);
 prt(" (int) j = " + j);
 prt(" (double) x = " + x);
 prt(" (double) y = " + y);
 prt();
 }
 /**
 * The Math library defines several useful constants.
 */
 private static void printMathConstants() {
 prt("MATH CONSTANTS");
 prt("===========================================");
 prt(" Pi is " + Math.PI);
 prt(" e is " + Math.E);
 prt();
 }
 /**
 * The absolute value of a number is equal to the number if the number is 
 * positive or zero and equal to the negative of the number if the number
 * is negative.
 */
 private static void doAbsoluteValues() {
 prt("ABSOLUTE VALUE");
 prt("===========================================");
 prt(" |" + i + "| is " + Math.abs(i));
 prt(" |" + j + "| is " + Math.abs(j));
 prt(" |" + x + "| is " + Math.abs(x));
 prt(" |" + y + "| is " + Math.abs(y));
 prt();
 }
 /**
 * Round off a floating point number to the nearest integer with round().
 * <p>
 * The "ceiling" of a number is the smallest integer greater than or equal
 * to the number. Every integer is its own ceiling.
 * <p>
 * The "floor" of a number is the largest integer less than or equal to the
 * number. Every integer is its own floor.
 */
 private static void doTruncateRounding() {
 prt("TRUNCATING AND ROUNDING FUNCTIONS");
 prt("===========================================");
 prt(" " + x + " is approximately " + Math.round(x));
 prt(" " + y + " is approximately " + Math.round(y));
 prt();
 prt(" The ceiling of " + i + " is " + Math.ceil(i));
 prt(" The ceiling of " + j + " is " + Math.ceil(j));
 prt(" The ceiling of " + x + " is " + Math.ceil(x));
 prt(" The ceiling of " + y + " is " + Math.ceil(y));
 prt();
 prt(" The floor of " + i + " is " + Math.floor(i));
 prt(" The floor of " + j + " is " + Math.floor(j));
 prt(" The floor of " + x + " is " + Math.floor(x));
 prt(" The floor of " + y + " is " + Math.floor(y));
 prt();
 }
 /**
 * Comparison operators. min() returns the smaller of the two arguments
 * (numbers) you pass it.
 * <p>
 * max() returns the the larger of the two arguments (numbers) you pass it.
 */
 private static void doComparisonOperators() {
 prt("COMPARISON OPERATORS");
 prt("===========================================");
 prt(" min(" + i + ", " + j + ") is " + Math.min(i,j));
 prt(" min(" + x + ", " + y + ") is " + Math.min(x,y));
 prt(" min(" + i + ", " + x + ") is " + Math.min(i,x));
 prt(" min(" + y + ", " + j + ") is " + Math.min(y,j));
 prt();
 prt(" max(" + i + ", " + j + ") is " + Math.max(i,j));
 prt(" max(" + x + ", " + y + ") is " + Math.max(x,y));
 prt(" max(" + i + ", " + x + ") is " + Math.max(i,x));
 prt(" max(" + y + ", " + j + ") is " + Math.max(y,j));
 prt();
 }
 /**
 * Trigonometric Methods. All arguments are given in radians.
 */
 private static void doTrigonometricMethods() {
 prt("TRIGONOMETRIC METHODS");
 prt("===========================================");
 // Convert a 45 degree angle to radians
 double angle = 45.0 * 2.0 * Math.PI/360.0;
 prt(" cos(" + angle + ") is " + Math.cos(angle));
 prt(" sin(" + angle + ") is " + Math.sin(angle));

 // Inverse Trigonometric methods. All values are returned as radians
 double value = 0.707;
 prt(" acos(" + value + ") is " + Math.acos(value));
 prt(" asin(" + value + ") is " + Math.asin(value));
 prt(" atan(" + value + ") is " + Math.atan(value));
 prt();
 }
 /**
 * Exponential and Logarithmic Methods.
 */
 private static void doExponentialLogarithmicMethods() {
 prt("EXPONENTIAL AND LOGARITHMIC METHODS");
 prt("===========================================");

 // exp(a) returns e (2.71828...) raised to the power of a.
 prt(" exp(1.0) is " + Math.exp(1.0));
 prt(" exp(10.0) is " + Math.exp(10.0));
 prt(" exp(0.0) is " + Math.exp(0.0));
 prt();
 // log(a) returns the natural logarithm (base e) of a.
 prt(" log(1.0) is " + Math.log(1.0));
 prt(" log(10.0) is " + Math.log(10.0));
 prt(" log(Math.E) is " + Math.log(Math.E));
 prt();
 }
 /**
 * Using Power Method. pow(x, y) returns the x raised to the yth power.
 */
 private static void doPower() {
 prt("POWER METHOD");
 prt("===========================================");
 prt(" pow(2.0, 2.0) is " + Math.pow(2.0,2.0));
 prt(" pow(10.0, 3.5) is " + Math.pow(10.0,3.5));
 prt(" pow(8, -1) is " + Math.pow(8,-1));
 prt();
 }
 /**
 * Using Power Method. qrt(x) returns the square root of x.
 */
 private static void doSquareRoot() {
 prt("SQUARE ROOT METHOD");
 prt("===========================================");
 for (i=0; i < 10; i++) {
 prt(" The square root of " + i + " is " + Math.sqrt(i));
 }
 prt();
 }
 /**
 * Random Numbers. Java provides a Random method that returns a
 * pseudo-random number between 0.0 and 1.0.
 */
 private static void doRandomNumbers() {
 prt("RANDOM NUMBERS");
 prt("===========================================");
 prt(" Random number: " + Math.random());
 prt(" Random number: " + Math.random());
 prt();
 }
 public static void main(String[] args) {
 prt();
 printVariables();
 printMathConstants();
 doAbsoluteValues();
 doTruncateRounding();
 doComparisonOperators();
 doTrigonometricMethods();
 doExponentialLogarithmicMethods();
 doPower();
 doSquareRoot();
 doRandomNumbers();
 }
}

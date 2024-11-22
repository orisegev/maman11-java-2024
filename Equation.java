/*
 * the equation class receives 3 real numbers a,b,c
 * that represent polynomial ax^2+bx+c=0
 * the program check and print the solutions.
 * @version 1
 */
import java.util.Scanner;
//==================================
public class Equation
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter 3 coefficients of the polynomial equation:");
        // gets the 3 real numbers.
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double discriminant = Math.pow(b,2) -4*a*c; // b^2-4ac
        // check the number of solutions.
        if(Math.pow(b,2) -4*a*c == 0)   // if b^2-4ac = 0  -> Single solution
        {   
            System.out.println("There is 1 solution. X1 = "+(-b+Math.sqrt(discriminant))/(2*a)+".");
        }
        else if(Math.pow(b,2) -4*a*c > 0)   // if b^2-4ac > 0  -> Two solution
        {  
            System.out.println("There are 2 solutions. X1 = "+ (-b+ Math.sqrt(discriminant))/(2*a)+", X2 = "+ (-b-Math.sqrt(discriminant))/(2*a) +".");
        }
        else    // if b^2-4ac < 0 -> No solution
        {
            System.out.println("There is no solution.");
        }  
    } // end of method main
} //end of class Equation
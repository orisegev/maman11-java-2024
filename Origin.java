/* the origin class receives three pairs of numbers that pressent coordinates.
 * the program print the nearest point to the origin.
 * @version 1
 */
import java.util.Scanner;
//====================================
public class Origin
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter first point coordinates:");
        // gets three parirs of coordinates.
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println ("Enter second point coordinates:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        System.out.println ("Enter third point coordinates:");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        // calculate the distance from (0,0) (d= sqrt((x1-x2)^2+(y1-y2)^2)).
        double x1y1 = Math.sqrt((Math.pow(x1,2) + Math.pow(y1,2)));
        double x2y2 = Math.sqrt((Math.pow(x2,2) + Math.pow(y2,2)));
        double x3y3 = Math.sqrt((Math.pow(x3,2) + Math.pow(y3,2)));

        if(x1y1 <= x2y2 && x1y1 <= x3y3) 
        {
            System.out.println("The nearest point to the origin is: ("+x1+","+y1+")");
        }
        else if(x2y2 <= x1y1 && x2y2 <= x3y3) 
        {
            System.out.println("The nearest point to the origin is: ("+x2+","+y2+")");
        }
        else 
        {
            System.out.println("The nearest point to the origin is: ("+x3+","+y3+")");
        }
    } // end of method main
} //end of class Origin
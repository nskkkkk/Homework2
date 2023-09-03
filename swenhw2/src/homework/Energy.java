/**
 * @author Naga Sai Krishna  , nk4689@rit.edu
 */

package homework;
import java.util.Scanner;

/**
 * The class Energy takes the input in grams and returns the prints in Joules
 * @param args command line arguments-unused
 */
public class Energy
{
    public static void main(String[]args)
    {
        float c= 299792458;
        System.out.println("Enter the mass in grams");
        Scanner scanner = new Scanner(System.in);
        double gm= scanner.nextDouble();
        double e= gm*c*c;
        System.out.println("Equivalent energy in Joules is " + e +" joules");
    }
}
// End of class Energy
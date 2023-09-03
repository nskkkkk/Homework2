/**
 * @author Naga Sai Krishna , nk4689@rit.edu
 */

package homework;
import java.util.Scanner;

/**
 * The class temperature takes the Degrees Fahrenheit from the user and converts it into degrees Kelvin
 */
public class Temperature
{
    public static void main(String[] args){
        System.out.println("Enter the value in degrees Farenheit");
        Scanner scanner = new Scanner(System.in);
        float farenheit= scanner.nextFloat();

        float kelvin=(5.0f/9)*(farenheit-32)+273;
        System.out.println(farenheit+" degrees Fahrenheit is " + kelvin + " degrees Kelvin");
    }
}
// End of class Temperature
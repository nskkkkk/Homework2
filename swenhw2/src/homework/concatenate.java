/**
 * @author Naga Sai Krishna , nk4689@rit.edu
 */


package homework;
import java.util.Scanner;

/**
 * The class concatenate combines the 3 different inputs from the user and prints them in one string
 */
public class concatenate
{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = scanner.nextLine();
        System.out.println("Enter your college ID");
        double cid=scanner.nextDouble();
        System.out.print("Enter your CGPA");
        float cgpa=scanner.nextFloat();

        String floatString = String.valueOf(cgpa);
        String doubleString = String.valueOf(cid);

        String result = name.concat(" ").concat(floatString).concat(",").concat(doubleString);
        System.out.println(result);


    }
}
// End of class concatenate
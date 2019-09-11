
import java.util.Scanner;


public class momentum {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double mass,vel,mom;
        System.out.print("Enter object mass in Kg: ");
        mass = s.nextDouble();
        System.out.print("Enter object velocity in m/s: ");
        vel = s.nextDouble();
        mom=mass*vel;
        System.out.println(String.format("Object has a momentum of %.2f Kg m/s.",mom));
    }
    
}


import java.util.Scanner;


public class PizzaCost {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double labour=1.50,oven=0.75,ingr=0.5,top=0.75;
        double toppings,tprice,size,total,base;
        System.out.print("Enter your desired pizza diameter (in inches): ");
        size=s.nextDouble();
        System.out.print("Enter desired number of toppings: ");
        toppings=s.nextDouble();
        
        base=size*ingr;
        tprice=toppings*top;
        total=base+tprice+oven+labour;
        
        System.out.println(String.format("Your total is $%.2f.",total));
        System.out.println("what p");
        
    }
    
}

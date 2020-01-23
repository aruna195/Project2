package CPSC_OOD;
import java.util.Scanner;


public class FactoryPattern {

	public FactoryPattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		System.out.println("Enter the Cake Flavor: ");
		String flavor = in.next();
		
		Cake cake1  = CakeFactory.createCake(flavor); 		
		
		if (cake1 == null)
		{
			System.out.println("The Cake Flavor ordered is not available");
			System.out.println("Available Flavors: Chocolate, Marble, Basic");
			System.out.println("Enter the Cake Flavor: ");
			String flavor1 = in.next();
			Cake cake2  = CakeFactory.createCake(flavor1); 
			if(cake2 != null)
			System.out.println(cake2.toString());
			else
				System.out.println("please try with proper input");
		
		} 
		else
		{	
			System.out.println(cake1.toString());
		}
				
	}

}

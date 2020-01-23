package CPSC_OOD;

public class FactoryPattern {

	public FactoryPattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//CakeFactory cakeFactory = new CakeFactory();
		Cake cake1  = CakeFactory.createCake(Cake.ChocolateFlavor);		
		System.out.println(cake1.toString());
		Cake cake2  = CakeFactory.createCake(Cake.MarbleFlavor);		
		System.out.println(cake2.toString());
		Cake cake3  = CakeFactory.createCake(Cake.BasicCake);		
		System.out.println(cake3.toString());
		
		
		
	}

}

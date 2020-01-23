package CPSC_OOD;

public class CakeFactory {

	public static Cake createCake(String type) {
		if(type.equalsIgnoreCase(Cake.ChocolateFlavor)) {
			return new ChocolateFlavor(type, "Regular", "Half", "Single", "BirthdayTheme");
		}
		else if(type.equalsIgnoreCase(Cake.MarbleFlavor)) {
			return new MarbleFlavor(type, "Eggless", "Full", "Double", "AnniversaryTheme");			
		} 
		else if(type.equalsIgnoreCase(Cake.BasicCake)) {
			return new BasicCake(type, "Regular", "Half", "Single", "AnimalTheme");
		}
		else {
			return null;
		}
	}
		
}

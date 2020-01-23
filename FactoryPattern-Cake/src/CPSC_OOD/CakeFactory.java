package CPSC_OOD;

public class CakeFactory {

	public static Cake createCake(String type) {
		if(type.equals(Cake.ChocolateFlavor)) {
			return new ChocolateFlavor(type,"Regular", "half", "single", "BirthdayTheme");
		}
		else if(type.equals(Cake.MarbleFlavor)) {
			return new MarbleFlavor(type, "Eggless", "half", "single", "BirthdayTheme");			
		} 
		else if(type.equals(Cake.BasicCake)) {
			return new BasicCake(type, "Regular", "half", "single", "BirthdayTheme");
		}
		else {
			return null;
		}
	}
		
}

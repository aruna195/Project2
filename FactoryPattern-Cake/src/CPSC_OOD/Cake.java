package CPSC_OOD;

public abstract class Cake {	
	
	public static final String ChocolateFlavor = "Chocolate";
	public static final String MarbleFlavor = "Marble";
	public static final String BasicCake = "Basic";
	
	public abstract String getType();
	public abstract String getSize();
	public abstract String getLayers();
	public abstract String getTheme();
	public abstract String getFlavor();
	
	
@Override
	public  String toString() {
	return  this.getFlavor()+": Type: "+this.getType()+", Size: "+ this.getSize()+", Layers: "+this.getLayers()+", Theme: "+this.getTheme();
	}

}

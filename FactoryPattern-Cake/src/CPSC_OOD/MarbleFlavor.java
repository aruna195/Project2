package CPSC_OOD;

public class MarbleFlavor extends Cake {
	
	public String cakeType;
	public String cakeSize;
	public String cakeLayers;
	public String cakeTheme;
	public String cakeFlavor;
	
	public MarbleFlavor( String cakeFlavor, String cakeType,String cakeSize, String cakeLayers, String cakeTheme) {
		this.cakeType = cakeType;
		this.cakeSize = cakeSize;
		this.cakeLayers = cakeLayers;
		this.cakeTheme = cakeTheme;
		this.cakeFlavor = cakeFlavor;
		System.out.println("The Cake Catergory:" + Cake.MarbleFlavor );
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.cakeType;
	}

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return this.cakeSize;
	}

	@Override
	public String getLayers() {
		// TODO Auto-generated method stub
		return this.cakeLayers;
	}

	@Override
	public String getTheme() {
		// TODO Auto-generated method stub
		return this.cakeTheme;
	
	}
	@Override
	public String getFlavor() {
		// TODO Auto-generated method stub
		return cakeFlavor;
	}
}
	
	
	
	

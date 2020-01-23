package CPSC_OOD;

public class BasicCake extends Cake{
	
	public String cakeType;
	public String cakeSize;
	public String cakeLayers;
	public String cakeTheme;
	public String cakeFlavor;
	
	public BasicCake(String cakeFlavor, String cakeType,String cakeSize, String cakeLayers, String cakeTheme) {
		this.cakeType = cakeType;
		this.cakeSize = cakeSize;
		this.cakeLayers = cakeLayers;
		this.cakeTheme = cakeTheme;
		this.cakeFlavor = cakeFlavor;
		
		System.out.println("The Cake Catergory:" + Cake.BasicCake );
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return cakeType;
	}

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return cakeSize;
	}

	@Override
	public String getLayers() {
		// TODO Auto-generated method stub
		return cakeLayers;
	}

	@Override
	public String getTheme() {
		// TODO Auto-generated method stub
		return cakeTheme;
	}

	@Override
	public String getFlavor() {
		// TODO Auto-generated method stub
		return cakeFlavor;
	}
}
	
	

	
	
	

	
	
	
package adapter;

public class MotorEconomico implements Motor{

	@Override
	public String encender() {
		return "Encender";
	} 

	@Override
	public String acelarar() {
		return "Acelerar";		
	}

	@Override
	public String apagar() {
		return "Apagar";
	}
	
}

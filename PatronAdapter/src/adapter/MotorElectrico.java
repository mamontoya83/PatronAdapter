package adapter;

public class MotorElectrico implements MotorModerno{

	@Override
	public String conectar() {
		return "Conectar";
	}

	@Override
	public String activar() {
		return "Activar";		
	}

	@Override
	public String moverMasRapido() {
		return "Mover mas rapido";		
	}

	@Override
	public String detener() {
		return "Detener";		
	}

	@Override
	public String desconectar() {
		return "Desconectar";	
	}

}

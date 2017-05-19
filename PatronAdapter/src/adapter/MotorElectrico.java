package adapter;

public class MotorElectrico implements MotorModerno{

	@Override
	public void conectar() {
		System.out.println("Conectar");
	}

	@Override
	public void activar() {
		System.out.println("Activar");		
	}

	@Override
	public void moverMasRapido() {
		System.out.println("Mover mas rapido");		
	}

	@Override
	public void detener() {
		System.out.println("Detener");		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectar");		
	}

}

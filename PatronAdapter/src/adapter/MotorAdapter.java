package adapter;

public class MotorAdapter implements Motor{
	MotorModerno motor;
	
	public MotorAdapter(MotorModerno motor) {
		this.motor = motor;
	}
	
	@Override
	public void encender() {
		this.motor.conectar();
		this.motor.activar();
	}

	@Override
	public void acelarar() {
		this.motor.moverMasRapido();
	}

	@Override
	public void apagar() {
		this.motor.detener();
		this.motor.desconectar();
	}
	
}

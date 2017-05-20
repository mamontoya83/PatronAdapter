package adapter;

public class MotorAdapter implements Motor{
	MotorModerno motor;
	
	public MotorAdapter(MotorModerno motor) {
		this.motor = motor;
	} 
	
	@Override
	public String encender() {
		return this.motor.conectar() + " y " + this.motor.activar();
	}

	@Override
	public String acelarar() {
		return this.motor.moverMasRapido();
	}

	@Override
	public String apagar() {
		return this.motor.detener() + " y " + this.motor.desconectar();
	}
	
}

package cajeroherencia;

public class Cajero {
	private String ubicacion;
	private double Saldo;
	public Cajero(String ubicacion, double saldo) {
		super();
		this.ubicacion = ubicacion;
		Saldo = saldo;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cliente [ubicacion=" + ubicacion + ", Saldo=" + Saldo + "]";
	}
}

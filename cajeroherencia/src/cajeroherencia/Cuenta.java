package cajeroherencia;

public class Cuenta {
	private double Saldo;
	private Cliente cliente;
	private String operaciones;
	public Cuenta(int nroCliente, double saldo, Cliente cliente, String operaciones) {
		super();
		Saldo = saldo;
		this.cliente = cliente;
		this.operaciones = operaciones;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getOperaciones() {
		return operaciones;
	}
	public void setOperaciones(String operaciones) {
		this.operaciones = operaciones;
	}
	@Override
	public String toString() {
		return "Cuenta [NroCliente=" + ", Saldo=" + Saldo + ", cliente=" + cliente + ", operaciones="
				+ operaciones + "]";
	}
	
}

package cajeroherencia;
import javax.swing.*;
public class Empleado extends Usuario {
	public Empleado(String nombre, String dni, String pin, String rol) {
		super(nombre, dni, pin, rol);
		// TODO Auto-generated constructor stub
	}
	private String puesto;
	private double sueldo;
	private String departamento;
	public Empleado(String nombre, String dni, String pin, String rol, String puesto) {
		super(nombre, dni, pin, rol);
		this.puesto = puesto;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Empleado [puesto=" + puesto + ", sueldo=" + sueldo + ", departamento=" + departamento + "]";
	}
	public boolean AgregarDinero(int monto) {
		return true;
	}
	@Override
	public void menu(Cajero cajero) {
		JOptionPane.showMessageDialog(null, "Bienvenido empleado");
	}
}

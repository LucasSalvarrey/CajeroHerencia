package cajeroherencia;
import javax.swing.*;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado=new Empleado("Matias","7654321","4321","empleado","Mantenimiento");
		Cliente yo=new Cliente ("Lucas","1234567","1234", "cliente",1000);	
		Cajero corrientes=new Cajero ("corrientes 2923",100);
		//JOptionPane.showMessageDialog(null, corrientes.toString());
		String[] rol= {"Empleado","Cliente","Salir"};
		int rolElegido=0;
		String dni="";
		String pin="";
		do {
			rolElegido=JOptionPane.showOptionDialog(null, "Elega rol", "Menu", 0, 0, null, rol, rol[0]);
			if (rolElegido!=2) {
				 dni = JOptionPane.showInputDialog("Ingrese dni");
				 pin = JOptionPane.showInputDialog("Ingrese pin");
			} 
			switch (rolElegido) {
			case 0: 
				if (empleado.IniciarSesion(dni, pin)) {
					empleado.menu(corrientes);
				} else {
					JOptionPane.showMessageDialog(null, "No pudo ingresar");
				}
				
				break;
			case 1:
				if (yo.IniciarSesion(dni, pin)) {
					yo.menu(corrientes);
				} else {
					JOptionPane.showMessageDialog(null, "No pudo ingresar");
				}
				
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Salir");
	
				break;
			}
		} while (rolElegido!=2);
	}
}
package challenge1_java;


import javax.swing.*;


public class DeseaContinuar {
		
	public void mensaje_final() {
		System.out.println("SE HA CERRADO EL PROGRAMA");
		Object mensaje_opcion= JOptionPane.showConfirmDialog(null, "¿Desea continuar?","Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		int mensaje= (Integer) mensaje_opcion;
		
		if (mensaje==0) {
			   //desea continuar
			ConversorMoneda intentarDeNuevo = new ConversorMoneda();
			intentarDeNuevo.obtener_datos();
		}		
		else if (mensaje==1) {
			//desea salirce 
			JOptionPane.showMessageDialog(null, "Programa Finalizado","Gracias ",JOptionPane.INFORMATION_MESSAGE);	 
	    }
	}		
}
	



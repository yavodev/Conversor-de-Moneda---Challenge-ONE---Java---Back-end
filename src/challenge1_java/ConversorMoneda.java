package challenge1_java;//paquete

import javax.swing.*; //interfaz

public class ConversorMoneda {

	public void obtener_datos() {

		// ingresar tipo moneda
		Object[] opciones_moneda = { "De Pesos a Dólar", "De Pesos a Euros", "De Pesos a Libras Esterlinas",
				"De Pesos a Yen Japonés", "De Pesos a Won sur-coreano", "De Dólar a Pesos", "De Euros a Pesos",
				"De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sur-coreano a Pesos" };
		
		Object opciones_elegir_moneda = JOptionPane.showInputDialog(null, "Seleccione un opción de conversión", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, opciones_moneda, opciones_moneda[0]);
		System.out.println(opciones_elegir_moneda);
		String opcionMoneda_elegida = (String) opciones_elegir_moneda;

		// por si no elige ninguna opcion de conversion
		if (opciones_elegir_moneda == null) {
			DeseaContinuar mensajeFinal = new DeseaContinuar();
			mensajeFinal.mensaje_final();
			// por si escoge no seguir se sale del programa
			System.exit(0);
		}

		try {
			// ingresar valor monetario
			String opcion_cantidad_dinero = JOptionPane.showInputDialog(
					"Ingrese la cantidad de dinero que desea convertir \n Opción escogida: " + opcionMoneda_elegida);
			double opcion_elegida_cantidadDinero = Double.parseDouble( opcion_cantidad_dinero);
			
			// operación conversión
			ConversorMoneda operacion = new ConversorMoneda();
			operacion.resultado_conversion(opcionMoneda_elegida, opcion_elegida_cantidadDinero);
		}
		// por si se ingresa un valor no permitido
		catch (NumberFormatException | NullPointerException exception) {
			JOptionPane.showMessageDialog(null, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
			DeseaContinuar intentarDeNuevo = new DeseaContinuar();
			intentarDeNuevo.mensaje_final(); // .iniciar();
			
			//Desarollo intentarDeNuevo = new Desarollo();
			//intentarDeNuevo.iniciar(); 

		}

	}

	public void resultado_conversion(String tipoConvercion, double cantidadDinero) {

		// String datos_api[];//guarda los daots que se envia a la API
		// datos_api= new String[4];
		
		double resultado_conversion = 0;
		
		//String pasar_De = "", pasar_a = "";

		switch (tipoConvercion) {
		case "De Pesos a Dólar":
			//resultado_conversion = (cantidadDinero/4761.59);
			resultado_conversion = Math.round((cantidadDinero / 4761.59) * 100) / 100d; 
			break;

		case "De Pesos a Euros":
			resultado_conversion = Math.round((cantidadDinero / 5031.61) * 100) / 100d;
			break;

		case "De Pesos a Libras Esterlinas":
			resultado_conversion = Math.round((cantidadDinero / 5645.96) * 100) / 100d;
			break;

		case "De Pesos a Yen Japonés":
			resultado_conversion = Math.round((cantidadDinero / 34.8432) * 100) / 100d;
			break;

		case "De Pesos a Won sur-coreano":
			resultado_conversion = Math.round((cantidadDinero / 3.62237) * 100) / 100d;
			break;

		case "De Dólar a Pesos":
			resultado_conversion = Math.round((cantidadDinero * 4761.59) * 100) / 100d;
			break;

		case "De Euros a Pesos":
			resultado_conversion = Math.round((cantidadDinero * 5031.61) * 100) / 100d;
			break;

		case "De Libras Esterlinas a Pesos":
			resultado_conversion = Math.round((cantidadDinero * 5645.96) * 100) / 100d;
			break;

		case "De Yen Japonés a Pesos":
			resultado_conversion = Math.round((cantidadDinero * 34.8432) * 100) / 100d;
			break;

		case "De Won sur-coreano a Pesos":
			resultado_conversion = Math.round((cantidadDinero * 3.62237) * 100) / 100d;
			break;

		default:
			break;
		}

		// mostrar conversión
		JOptionPane.showMessageDialog(null,
				"El valor de la conversión  " + tipoConvercion + " es : $" + resultado_conversion); //valor_formateado

		// mensaje final

		DeseaContinuar mensajeFinal = new DeseaContinuar();
		mensajeFinal.mensaje_final();

	}

	public void iniciar() {
	}
}

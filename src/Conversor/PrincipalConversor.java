package Conversor;

import javax.swing.JOptionPane;

public class PrincipalConversor {

	public static void main(String[] args) {

		ConversorTipos currency = new ConversorTipos();

		while (true) {

			Object[] input = { "Conversion" };

			String seleccionMenu = (JOptionPane.showInputDialog(null,
					"Señor Usuario por favor seleccione de nuestras opciones:", "ConversApp", JOptionPane.PLAIN_MESSAGE,
					null, input, "")).toString();

			try {
				switch (seleccionMenu) {
				case "Conversion":
					currency.Money();
					System.out.println("Opcion Conversión");
					break;

				}

				int confirmacion = JOptionPane.showConfirmDialog(null, "¿Deseas Realizar Otro tipo de Conversion?",
						"otro text", JOptionPane.YES_NO_OPTION);
				if (confirmacion == 1) {
					System.out.println("Cerrado");
					break;
				}

			} catch (NullPointerException exception) {
				System.out.println("Excepcion main - opción nula ");
			}
		}

		JOptionPane.showMessageDialog(null, "Programa Finalizado");
	}

}

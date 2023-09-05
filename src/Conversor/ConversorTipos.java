package Conversor;

import javax.swing.JOptionPane;

public class ConversorTipos {

	public void Money() {
		Object[] seleccion = { "USD a COP", "COP a USD", "EUR a COP", "COP a EUR", "LBR a COP", "COP a LBR" };
		String seleccionado = (JOptionPane.showInputDialog(null, "Seleccione el Tipo de moneda a Convertir",
				"ConversApp", JOptionPane.PLAIN_MESSAGE, null, seleccion, "")).toString();
		String TipoDemonedaInicial = seleccionado.substring(0, 3);

		try {
			String valorInicial = JOptionPane.showInputDialog("Ingrese el valor en " + TipoDemonedaInicial);

			double Cuantia = Double.parseDouble(valorInicial);

			double Result;

			switch (seleccionado) {

			case "USD a COP":
				Result = Cuantia * 4056;
				conversionMoneda(Result, seleccionado.substring(6));
				break;
			case "COP a USD":
				Result= Cuantia / 4056;
				conversionMoneda(Result, seleccionado.substring(6));
				break;
			case "EUR a COP":
				Result = Cuantia* 4378;
				conversionMoneda(Result, seleccionado.substring(6));
				break;
			case "COP a EUR":
				Result = Cuantia / 4378;
				conversionMoneda(Result, seleccionado.substring(6));
				break;
			case "LBR a COP":
				Result = Cuantia * 5122;
				conversionMoneda(Result, seleccionado.substring(6));
				break;
			case "COP a LBR":
				Result = Cuantia / 5122;
				conversionMoneda(Result , seleccionado.substring(6));
				break;

			}

		} catch (NumberFormatException ex) {
			System.out.println("Error de valor");
			JOptionPane.showMessageDialog(null, "Valor No Valido");
			Money();
		}

	}

	public void conversionMoneda(double valorA, String valorB) {

		valorA = (double) Math.round(valorA * 100d) / 100;

		JOptionPane.showMessageDialog(null, "El resultado de tu conversión es : " +valorA + " " + valorB);

	}

}

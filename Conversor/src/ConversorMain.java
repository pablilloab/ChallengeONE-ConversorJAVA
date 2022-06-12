import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorMain {
	public static void main(String[] args) {
		
		//https://javadesde0.com/tag/que-es-joptionpane/
		//http://edu4java.com/es/index.html
		//https://mkyong.com/swing/java-swing-joptionpane-showoptiondialog-example/
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		int continuar = 0;
		
		//Definicion monedas
		double dolar = 0.0082;
		double euro = 0.0078;
		double libraEsterlina = 0.0066;
		double yen = 1.10;
		double won = 10.45;
		
		
		double resultado = 0;
		double montoConvertir = 0;		
		JOptionPane.showMessageDialog(null, "Bienvenidos al Conversor", "Conversor", JOptionPane.INFORMATION_MESSAGE, null);	
		
		String[] conversion = new String[10];
		conversion[0] = "Peso AR a Dolar";
		conversion[1] = "Peso AR a Euro";
		conversion[2] = "Peso AR a Libra Esterlina";
		conversion[3] = "Peso AR a Yen";
		conversion[4] = "Peso AR a Won";
		
		conversion[5] = "Dolar a Peso AR";
		conversion[6] = "Euro a Peso AR";
		conversion[7] = "Libra Esterlina a Peso AR";
		conversion[8] = "Yen a Peso AR";
		conversion[9] = "Won a Peso AR";
		
		while (continuar == 0) {
			Object opcion = JOptionPane.showInputDialog(null, "Que conversion te gustaria hacer?", "Tipos de Conversion", JOptionPane.QUESTION_MESSAGE, null, conversion, "Peso AR a Dolar");
			
			montoConvertir = Double.parseDouble(JOptionPane.showInputDialog("Monto a convertir"));
			
			
			if (opcion == "Peso AR a Dolar") {
				
				resultado = dolar * montoConvertir;
				JOptionPane.showMessageDialog(null, "Tenes: " + df.format(resultado) + " Dolares", "Resultado", JOptionPane.INFORMATION_MESSAGE, null);
			}		
			if (opcion == "Peso AR a Euro") {
				resultado = euro * montoConvertir;
				JOptionPane.showMessageDialog(null, "Tenes: " + df.format(resultado) + " Euros", "Resultado", JOptionPane.INFORMATION_MESSAGE, null);			
			}
			if (opcion == "Peso AR a Libra Esterlina") {
				resultado = libraEsterlina * montoConvertir;
				JOptionPane.showMessageDialog(null, "Tenes: " + df.format(resultado) + " Libras Esterlinas", "Resultado", JOptionPane.INFORMATION_MESSAGE, null);			
			}
			if (opcion == "Peso AR a Yen") {
				resultado = yen * montoConvertir;
				JOptionPane.showMessageDialog(null, "Tenes: " + df.format(resultado) + " Yenes", "Resultado", JOptionPane.INFORMATION_MESSAGE, null);			
			}
			if (opcion == "Peso AR a Won") {
				resultado = won * montoConvertir;
				JOptionPane.showMessageDialog(null, "Tenes: " + df.format(resultado) + " Wones", "Resultado", JOptionPane.INFORMATION_MESSAGE, null);			
			}
			
			
			if (opcion == "Dolar a Peso AR") {
				
				resultado = montoConvertir / dolar;
				JOptionPane.showMessageDialog(null, "Tenes: " + df.format(resultado) + " Pesos", "Resultado", JOptionPane.INFORMATION_MESSAGE, null);
			}		
			if (opcion == "Euro a Peso AR") {
				resultado =montoConvertir / euro;
				JOptionPane.showMessageDialog(null, "Tenes: " + df.format(resultado) + " Pesos", "Resultado", JOptionPane.INFORMATION_MESSAGE, null);			
			}
			if (opcion == "Libra Esterlina a Peso AR") {
				resultado = montoConvertir / libraEsterlina;
				JOptionPane.showMessageDialog(null, "Tenes: " + df.format(resultado) + " Pesos", "Resultado", JOptionPane.INFORMATION_MESSAGE, null);			
			}
			if (opcion == "Yen a Peso AR") {
				resultado = montoConvertir / yen;
				JOptionPane.showMessageDialog(null, "Tenes: " + df.format(resultado) + " Pesos", "Resultado", JOptionPane.INFORMATION_MESSAGE, null);			
			}
			if (opcion == "Won a Peso AR") {
				resultado = montoConvertir / won;
				JOptionPane.showMessageDialog(null, "Tenes: " + df.format(resultado) + " Pesos", "Resultado", JOptionPane.INFORMATION_MESSAGE, null);			
			}	
			
			
			continuar = JOptionPane.showConfirmDialog(null,"Desea continuar");
			
		}

		JOptionPane.showMessageDialog(null, "Nos vemos luego!!", "Conversor", JOptionPane.INFORMATION_MESSAGE, null);
		
	}
}

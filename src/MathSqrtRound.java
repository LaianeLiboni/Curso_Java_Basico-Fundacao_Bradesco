public class MathSqrtRound {

	public static void main(String arg[]) {
	

	double num = 90;
	
	/* C�lculo e apresenta��o da raiz quadrada de um n�mero real utilizando a classe Math */
	System.out.println("sqrt: Raiz quadrada de "+ num + " = " + Math.sqrt(num));
	
	/* C�lculo da raiz quadrada de um n�mero real com arredondamento utilizando a classe Math */
	System.out.println("round: O valor arredondado da raiz quadrada de "+ num + "  = " + Math.round(Math.sqrt(num)));
	}
}
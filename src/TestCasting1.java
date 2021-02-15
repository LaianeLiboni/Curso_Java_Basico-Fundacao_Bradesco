
public class TestCasting1 {
	
	public static void main(String args []) {
		
		//Exemplo 1
		byte a = 1;
		byte b = 3;
		
		/* Linha errada, pois a opera��o adi��o sofre casting implicita */
		//byte c = a + b;
		//Corre��o do casting explicito
		
		byte c = (byte) (a + b);
		System.out.println(c);
		
		//Exemplo 2
		int ia = 1;
		long lb = 3;
		
		//Perda de Precis�o - causa erro
		//int ic = ia + lb; //linha errada -> Casting
		//Corre��o o casting explicito
		int ic = ia + (int) lb;
		System.out.println(ic);
	}
}
public class Funcionario{
	
	public static void main (String [] args){
		String [][] nome = new String [2][2];
		
		nome[0][0] = "Marina";
		nome [0][1] = "Fernanda";
		nome [1][0] = "Adriana";
		nome [1][1] = "Ana";
		
		for(int i = 0; i < nome.length; i++){
			for(int c = 0;  c < nome[1].length; c++){
				System.out.println(i+" e " +c +" = " + nome[i][c]+ "\t");
			}
			System.out.println("\n");
		}
	}
}

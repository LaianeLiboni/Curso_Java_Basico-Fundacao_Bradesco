import java.util.*;
 /* IMPORTANTE: 
Defini��o da classe java.util.* 
para utiliza��o do m�todo Arrays.sort */
public class Ordenacao {
 /* OBJETIVO: 
Classifica��o dos elementos n�mericos de um array, utilizando o m�todo Arrays.sort da classe java.util.* */ 
/* M�todo principal */
	public static void main(String[] args) {
 /* Defini��o dos valores num�ricos de um array Unidimensional */
	String idx[] = {"A", "E", "C", "B", "D"};
 /* Apresenta��o dos valores de um array ANTES da classifica��o */ 
	System.out.println("Valores de um array para ORDENAR/CLASSIFICAR:");
 /*for (int valor : idx) {
System.out.println(valor + "\t");
 }*/ 
/* sobre a sintaxe => for(int valor : idx) {} 
A vari�vel valor, declarada internamente na estrutura do for deve ser definida com o mesmo tipo que os dados do array (idx), neste caso est� como int. Ela faz parte do loop e a informa��o armazenada em valor ser� o elemento atual do pr�prio array. A express�o l�gica � o pr�prio array envolvido no loop. 
A sintaxe comum do la�o for �: for (inicializa��o;condi��o;incremento ou decremento){conteudo;} */
 /* Execu��o do m�todo sort para classifica��o/ordena��o do array */
Arrays.sort(idx);
 /* Impress�o com quebra de 2 linhas vazias */
 System.out.println(" "); System.out.println(" ");
 /* Apresenta��o dos valores num�ricos ORDENADOS/CLASSIFICADOS de um array utilizando o m�todo sort */
System.out.println("Valores de um array ORDENADO/CLASSIFICADO:");
 /*for (int valor : idx) { System.out.print(valor + "\t"); }*/
/* Impress�o com quebra de 2 linhas vazias */
 System.out.println(" ");
 System.out.println(" ");
 }
 }

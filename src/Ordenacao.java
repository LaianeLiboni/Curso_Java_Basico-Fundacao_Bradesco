import java.util.*;
 /* IMPORTANTE: 
Definição da classe java.util.* 
para utilização do método Arrays.sort */
public class Ordenacao {
 /* OBJETIVO: 
Classificação dos elementos númericos de um array, utilizando o método Arrays.sort da classe java.util.* */ 
/* Método principal */
	public static void main(String[] args) {
 /* Definição dos valores numéricos de um array Unidimensional */
	String idx[] = {"A", "E", "C", "B", "D"};
 /* Apresentação dos valores de um array ANTES da classificação */ 
	System.out.println("Valores de um array para ORDENAR/CLASSIFICAR:");
 /*for (int valor : idx) {
System.out.println(valor + "\t");
 }*/ 
/* sobre a sintaxe => for(int valor : idx) {} 
A variável valor, declarada internamente na estrutura do for deve ser definida com o mesmo tipo que os dados do array (idx), neste caso está como int. Ela faz parte do loop e a informação armazenada em valor será o elemento atual do próprio array. A expressão lógica é o próprio array envolvido no loop. 
A sintaxe comum do laço for é: for (inicialização;condição;incremento ou decremento){conteudo;} */
 /* Execução do método sort para classificação/ordenação do array */
Arrays.sort(idx);
 /* Impressão com quebra de 2 linhas vazias */
 System.out.println(" "); System.out.println(" ");
 /* Apresentação dos valores numéricos ORDENADOS/CLASSIFICADOS de um array utilizando o método sort */
System.out.println("Valores de um array ORDENADO/CLASSIFICADO:");
 /*for (int valor : idx) { System.out.print(valor + "\t"); }*/
/* Impressão com quebra de 2 linhas vazias */
 System.out.println(" ");
 System.out.println(" ");
 }
 }

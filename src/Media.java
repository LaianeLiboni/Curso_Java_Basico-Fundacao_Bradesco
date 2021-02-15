public class Media {
 
    public static void main(String[] args) {
        String[] cursos;
        
        cursos = new String[2];
        cursos[0] = "Sistemas";
        cursos[1] = "Internet";
        
        double[][] notas = new double[2][4];
        notas[0][0] = 8.0;
        notas[0][1] = 7.5;
        notas[0][2] = 9.0;
        notas[0][3] = 8.5;
        notas[1][0] = 9.5;
        notas[1][1] = 8.5;
        notas[1][2] = 8.0;
        notas[1][3] = 9.0;
        
        /* Definicao da variavel fracionaria media para armazenamento da media */
        double media = 0.0;
 
        /* PROCESSAMENTO DE DADOS */
        System.out.println("MEDIAS:"); 
 
       
        for(int l=0; l<notas.length; l++ ) { 
            for(int c=0; c<notas[l].length; c++ ) {
                media = media + notas[l][c];
            }	
            media = media/4;    
 
            /* SAIDA DE DADOS */
            /* Apresentacao do resultado apos o processamento com concatenacao de string e variaveis */
            System.out.println(cursos[l] + " = " + media);
            media=0;
        }
        System.out.println("\n"); 
    }   
}
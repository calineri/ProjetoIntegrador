/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testa;

/**
 *
 * @author celso.alineri
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo grafo = new Grafo(23);  
/*
    	grafo.setAresta(1, 2);
    	grafo.setAresta(2, 3);
    	grafo.setAresta(2, 4);
    	grafo.setAresta(2, 5);
    	grafo.setAresta(3, 4);
    	
    	grafo.setAresta(3, 5);
    	grafo.removeAresta(3, 5);
    	    	
    	grafo.mostra();
    	
    	System.out.println("\n\n");
    	
    	System.out.println("fonte : "+grafo.fonte(1));
    	System.out.println("Grau Entrada : "+ grafo.grauEntrada(0));
    	System.out.println("Grau Saida : "+ grafo.grauSaida(0));
    	System.out.println("Tamanho Grafo : "+ grafo.tamanho());
    	System.out.println("Caminho : "+ grafo.existeCaminho(0, 3));
    	System.out.println("Get Aresta: "+ grafo.getAresta(0, 4));
    	*/
    	System.out.println("\n\n");
        
		
    	// inicializa os pontos a serem calculados a heuristica
        Grafo pontoInicial = new Grafo (3.2 , 3.9); // se quiser da pra ser apenas int's
        Grafo pontoFinal =  new Grafo (5.1 , 5.9);// se quiser da pra ser apenas int's
    	
/*      Adiciona as esquinas(pontos) do mapa baseado em plano cartesiano
        acho que essa funcao que entraria em alguma hora da busca
        para ser verificado a heuristica
*/       
    	grafo.addPonto('A', 3.2 , 3.9); 
    	grafo.addPonto('B', 4.6 , 4.6);
    	
    	grafo.addPonto('C', 3.9 , 6.8); 
    	grafo.addPonto('D', 5.1 , 5.9);
    	
    	grafo.addPonto('E', 7 , 4); 
    	grafo.addPonto('F', 7 , 6);
    	
    	grafo.addPonto('G', 5.7 , 8); 
    	grafo.addPonto('H', 7.3 , 8.9);
    	
    	grafo.addPonto('I', 6.2 , 10); 
    	grafo.addPonto('J', 6.6 , 12.8);
    	
    	grafo.addPonto('K', 8.6 , 13.9); 
    	grafo.addPonto('L', 9.7 , 11 );
    	
    	grafo.addPonto('M', 11.2 , 10.9); 
    	grafo.addPonto('N', 10.3 , 13.8);
    	
    	grafo.addPonto('O', 11.8 , 15.1); 
    	grafo.addPonto('P', 11.7 , 17.6);
    	
    	grafo.addPonto('Q', 13.1 , 14.1);
    	grafo.addPonto('R', 17.2 , 14.2);
    	
    	grafo.addPonto('S', 13.3 , 8.8); 
    	grafo.addPonto('T', 14.4 , 4);
 	
    	double h = grafo.heuristica(pontoInicial, pontoFinal); // passando 4 double's
    	//grafo.heuristica(3.2 , 3.9     ,    5.1 , 5.9); // // passando 4 double's
    	
    	
    	//System.out.println("DEBUG : "+ pontoInicial+"      "+pontoFinal);
    	
    	// printando os pontos no mapa
    	grafo.printaMap();
    	System.out.println("\n\n");
    	grafo.printaHeusristicas();
    	
    	
    	
    	
 /*    	Printando as distancias da heuristica, elas vao ficar alocadas sempre
    	na posicao do objetivo final(ponto final); porque estou tentando fazer 
    	algo dinamico mais pra frente. (Sei que por hr daria pra fazer apenas)
    	em um vetor listaDistancias.this.V ao inves de matriz.
 */
    	//grafo.printaHeusristicas();
    }
    
}

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
public class Grafo {

	private int V;
	private int A;
	private int[][] adj;
	
	private double[][] listaDistancia;
	private char[][] pontosMapas;
	private int px;
	private int py;
	
	private int p1;
	private int p2;

	public Grafo(int v) {
		this.V = v;
		this.A = 0;
		this.adj = new int[V][V];
		this.pontosMapas = new char[V][V];

	}

	public Grafo(double x,double y) {
		px = (int)x;
		py = (int)y;

	}

	
	
	
	
   public double heuristica(Grafo p1, Grafo p2) {	
		 this.listaDistancia = new double[V][V];
		 double distancia = Math.sqrt(Math.pow((p1.py-p2.px), 2) + Math.pow((p2.py-p1.px), 2));
		 return this.listaDistancia[p2.px][p2.py] = distancia;
		 // distancia  A ate Q = 14,2
		 // distancia  A ate B = 1,0
    }
	

	
/*	
	public double heuristica(double px, double py, double kx, double ky) {	
		this.listaDistancia = new double[V][V];
		double distancia = Math.sqrt(Math.pow((this.px - ky), 2)+ Math.pow((this.py - kx), 2));
		return this.listaDistancia[(int)kx][(int)ky] = distancia; // (int)kx (int)ky
		// distancia  A ate Q = 19,2
		// distancia  B ate B = 6,5

	}
*/
	
	public void addPonto(char idV, double x,double y ) {
		this.p1 = (int)x;
		this.p2 = (int)y;
		
		this.pontosMapas[(int)y][(int)x] = idV;
	}
	



	public int getAresta(int v, int w) {
		return adj[v][w];

	}

	public void setAresta(int v, int w) {
		if (this.adj[v][w] == 0) {
			this.adj[v][w] = 1;
			this.A++;
		}
	}

	public void removeAresta(int v, int w) {
		if (this.adj[v][w] == 1) {
			this.adj[v][w] = 0;
			this.A--;
		}
	}

	public boolean fonte(int v) {

		int fonte = 0;
		for (int i = 0; i < this.V; i++) {
			fonte += this.adj[i][v];
		}
		if (fonte == 0) {
			return true;
		}
		return false;
	}

	public int grauEntrada(int v) {

		int grau = 0;
		for (int i = 0; i < this.V; i++) {
			grau += this.adj[i][v];
		}
		return grau;

	}

	public int grauSaida(int v) {

		int saida = 0;
		for (int i = 0; i < this.V; i++) {
			saida += this.adj[v][i];
		}
		return saida;
	}

	public int tamanho() {
		return this.V + this.A;
	}

	public boolean existeCaminho(int s, int t) {

		boolean[] visitados = new boolean[this.V];
		buscaProfundidade(s, visitados);

		return visitados[t];
	}

	public void buscaProfundidade(int v, boolean visitados[]) {

		visitados[v] = true;

		for (int w = 0; w < this.V; w++) {
			if ((this.adj[v][w] == 1) && (visitados[w] == false)) {
				buscaProfundidade(w, visitados);

			}
		}

	}

	public void mostra() {

		for (int v = 0; v < this.V; v++) {
			System.out.print(v + ":");
			for (int w = 0; w < this.V; w++) {
				if (this.adj[v][w] == 1) {
					System.out.print(" " + w);
				}
			}
			System.out.println();
		}
	}

	public void printaMap() {
		
		for(int n = 0; n < this.V; n++) {
			System.out.printf("%3d" , n);
		}
		System.out.println();
		
		
		for (int i = 0; i < this.V; i++) {
			System.out.print(i+" ");
			for (int j = 0; j < this.V; j++) {
		
				System.out.printf("[" + this.pontosMapas[i][j] + "]");
			}
			
			System.out.println();
			
		}

	}
	
	
	public void printaHeusristicas() {
		for (int i = 0; i < this.V; i++) {
			for (int j = 0; j < this.V; j++) {
				System.out.printf("[%.1f]" , this.listaDistancia[i][j]);
			}
			System.out.println();
		}

	}

}

/*	public double heuristica2(int v1, int v2) {

		this.listaDistancia = new double[V][V];

		double distancia = Math.sqrt(Math.pow((v1 - v2), 2));
		this.listaDistancia[v1][v2] = distancia;
		return this.listaDistancia[v1][v2];
	}
*/	

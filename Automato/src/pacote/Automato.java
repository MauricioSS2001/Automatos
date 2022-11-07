package pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Automato {

    //Instanciacao de vetor dinamico
    ArrayList<Boolean> estados = new ArrayList<Boolean>();
    ArrayList<Character> transicao = new ArrayList<Character>();
    Scanner sc = new Scanner(System.in);
	
	public void estados(int qtd_estados, String cadeia, int estado_inicial) {
	    
	    // Prenchimento de vetor com valores false
	    for(int x=0;x<qtd_estados;x++) {
	        estados.add(false);
	    }
	    
	    // Definicacao de valor true para o estado iniciial escolhido
	    estados.set(estado_inicial, true);
	    
	    // Define o elemento necessario para realizar a transicao de estados
	    for(int z=0;z<qtd_estados;z++) {
	        System.out.printf("Digite o elemento necessario para transicao do estado %d: " , z+1);
	        transicao.add(sc.next().charAt(0));
	    }
	    
	    //System.out.printf("Elementos na cadeia: %d", cadeia.length());
	    // Se o simbolo for valido, liga o estado
	    for(int y=0;y<cadeia.length();y++) {
	        //System.out.println("Entrou no metodo 3");
	        if(y<estados.size()) {
	          if (cadeia.charAt(y) == transicao.get(y)) {
	            estados.set(y, true);
	          }  
	        }
	        
	    }
	    
	}
	

	
}


package pacote;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		// Instanciacoes
		Automato aut = new Automato();
		Regras rgs = new Regras();
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> alfabeto = new ArrayList<Character>();
		
		// Variaveis
		String cadeia;
		boolean regra = false, teste_alfabeto;       // Verificador de cadeias validas
		int opcao_regra= 0, elementos;              // Opcoes do Menu
		char dg1, dg2;                             // Prmeiro e segundo digito da regra de subcadeia com dois digitos
		int estados, estado_inicial;                              // Numero de estados do AFN
		
		// Numero de estados do AFN
		System.out.print("Digite o numero de estados do AFN: ");
		estados = sc.nextInt();
		
		// Define o estado inicial do Automato
		System.out.print("Digite o estado inicial: ");
		estado_inicial = sc.nextInt();
		
		// Defini��o do numero de elementos da lista(alfabeto)
		System.out.print("Digite o numero de elementos do alfabeto: ");
		elementos = sc.nextInt();
		
		// Prenchimento da lista(alfabeto)
		for(int x=0; x<elementos;x++) {
		    System.out.print("\nDigite o elemento a ser adicionado no alfabeto: ");
		    alfabeto.add(sc.next().charAt(0)); 
		}
		
		// Menu
		System.out.println("=== Menu ===");
		System.out.println("1. Regra de haver subcadeia com dois digitos");
		System.out.println("2. Regra de elementos pares");
		System.out.println("3. Regra de elementos impares");
		System.out.print("\nDigite a regra que voce deseja: ");
		opcao_regra = sc.nextInt();   // Selecao de opcao do Menu
		
		// Menu > Funcionamento
		switch(opcao_regra) {
		    case 1:
    		    System.out.print("Digite o primeiro digito da subcadeia: ");
    		    dg1 = sc.next().charAt(0);
    		    System.out.print("Digite o segundo digito da subcadeia: ");
                dg2 = sc.next().charAt(0);
		    
    		    System.out.println("\nDigite a cadeia a ser lida: ");
    		    cadeia = sc.next();
    		    teste_alfabeto = testa_cadeia(cadeia, alfabeto, elementos);
    		    while(teste_alfabeto == false) {
    		        System.out.print("Cadeia invalida, digite novamente: ");
    		        cadeia = sc.next();
    		        teste_alfabeto = testa_cadeia(cadeia, alfabeto, elementos);
    		    }
    		    regra = rgs.regra_dois_digitos(cadeia, dg1, dg2);
    		    while(regra == false) {
    		        System.out.println("\nCadeia invalida, digite a cadeia novamente: ");
    		        cadeia = sc.next();
    		        regra = rgs.regra_dois_digitos(cadeia, dg1, dg2);
    		    }    
    		    aut.estados(estados, cadeia, estado_inicial);
    		    break;
    		    
		    case 2:
		        System.out.print("Digite o elemento (ha numero de elementos par?): ");
		        dg1 = sc.next().charAt(0);
		        System.out.println("\nDigite a cadeia a ser lida: ");
                cadeia = sc.next();
                teste_alfabeto = testa_cadeia(cadeia, alfabeto, elementos);
                while(teste_alfabeto == false) {
                    System.out.print("Cadeia invalida, digite novamente: ");
                    cadeia = sc.next();
                    teste_alfabeto = testa_cadeia(cadeia, alfabeto, elementos);
                }
                
		        regra = rgs.regra_ndigitos_pares(cadeia, dg1);
		        while(regra == false) {
                    System.out.println("\nCadeia invalida, digite a cadeia novamente: ");
                    cadeia = sc.next();
                    regra = rgs.regra_ndigitos_pares(cadeia, dg1);
                }
		        aut.estados(estados, cadeia, estado_inicial);
		        break;
		        
		    case 3:
		        System.out.print("Digite o elemento (ha numero de elementos impar?): ");
                dg1 = sc.next().charAt(0);
                System.out.println("\nDigite a cadeia a ser lida: ");
                cadeia = sc.next();
                teste_alfabeto = testa_cadeia(cadeia, alfabeto, elementos);
                while(teste_alfabeto == false) {
                    System.out.print("Cadeia invalida, digite novamente: ");
                    cadeia = sc.next();
                    teste_alfabeto = testa_cadeia(cadeia, alfabeto, elementos);
                }
                
                regra = rgs.regra_ndigitos_impares(cadeia, dg1);
                while(regra == false) {
                    System.out.println("\nCadeia invalida, digite a cadeia novamente: ");
                    cadeia = sc.next();
                    regra = rgs.regra_ndigitos_impares(cadeia, dg1);
                }
                aut.estados(estados, cadeia, estado_inicial);
                break;
		}
		
		
		sc.close();
	}
	
	public static boolean testa_cadeia(String cadeia, ArrayList<Character> alfabeto, int elementos) {
	    int controle = 0;
	    for(int x=0; x<elementos;x++) {
	        for(int y=0; y<elementos; y++) {
	            if(cadeia.charAt(x) == alfabeto.get(y)){
	                controle = controle + 1;
	            }
	        }
	    }
	    if(controle == elementos) {
	        return true;
	    }
	    else {
	        return false;
	    }
	    
	}

}

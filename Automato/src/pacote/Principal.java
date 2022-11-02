package pacote;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		// Instanciacoes
		Automato aut = new Automato();
		Regras rgs = new Regras();
		Scanner sc = new Scanner(System.in);
		
		// Variaveis
		String cadeia;
		boolean regra = false;    // Verificador de cadeias validas
		int opcao_regra= 0;       // Opção do Menu
		char dg1, dg2;            // Prmeiro e segundo digito da regra de subcadeia com dois digitos
		
		// Menu
		System.out.println("=== Menu ===");
		System.out.println("1. Regra de haver subcadeia com dois digitos");
		System.out.println("2. Regra de elementos pares");
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
    		    regra = rgs.regra_dois_digitos(cadeia, dg1, dg2);
    		    while(regra == false) {
    		        System.out.println("\nCadeia invalida, digite a cadeia novamente: ");
    		        cadeia = sc.next();
    		        regra = rgs.regra_dois_digitos(cadeia, dg1, dg2);
    		    }    
    		    aut.estados(cadeia);
    		    break;
    		    
		    case 2:
		        System.out.print("Digite o elemento (ha numero de elementos par?): ");
		        dg1 = sc.next().charAt(0);
		        System.out.println("\nDigite a cadeia a ser lida: ");
                cadeia = sc.next();
                
		        regra = rgs.regra_ndigitos_pares(cadeia, dg1);
		        while(regra == false) {
                    System.out.println("\nCadeia invalida, digite a cadeia novamente: ");
                    cadeia = sc.next();
                    regra = rgs.regra_ndigitos_pares(cadeia, dg1);
                }
		        aut.estados(cadeia);
		        break;
		        
		}
		
		
		sc.close();
	}

}

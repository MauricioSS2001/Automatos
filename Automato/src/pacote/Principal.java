package pacote;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		// Instânciações
		Automato aut = new Automato();
		Regras rgs = new Regras();
		Scanner sc = new Scanner(System.in);
		
		//Variáveis
		String cadeia;
		boolean regra = false;
		int opcao_regra= 0;
		
		System.out.println("=== Menu ===");
		System.out.println("1. Regra de haver subcadeia com dois digitos");
		System.out.print("\nDigite a regra que você deseja: ");
		opcao_regra = sc.nextInt();
		
		switch(opcao_regra) {
		    case 1:
		    System.out.println("\nDigite a cadeia a ser lida: ");
		    cadeia = sc.next();
		    regra = rgs.regra_dois_digitos(cadeia);
		    while(regra == false) {
		        System.out.println("\nCadeia invalida, digite a cadeia novamente: ");
		        cadeia = sc.next();
		        regra = rgs.regra_dois_digitos(cadeia);
		    }    
		    aut.estados(cadeia);
		    break;
		}
		
		
		sc.close();
	}

}

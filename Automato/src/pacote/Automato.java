package pacote;

public class Automato {
	public boolean q1 = false;
	public boolean q2 = false;
	public boolean q3 = false;
	
	
	public void estados(String cadeia) {
		//System.out.println("você entrou no método");
		char teste;
		for(int x=0; x<cadeia.length();x++) {
			teste = cadeia.charAt(x);
			if(teste == '1') {
				System.out.println("Estado 2 ativado");
				q2 = true;
			}
			else if(teste == '0') {
				q1 = true;
				System.out.println("Estado 1 ativado");
			}
		}
	}
	
}


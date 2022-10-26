package pacote;

public class Regras {

    public boolean regra_dois_digitos(String cadeia) {
        char validacao;
        boolean valida = false;
        for(int x=0;x<cadeia.length()-1;x++) {
            validacao = cadeia.charAt(x);
            if(validacao == '1' && cadeia.charAt(x+1) == '0') {
                valida = true;
            }
            
        }
        if(valida == true) {
            return true;
        }
        else {
            return false;
        }
    }
}

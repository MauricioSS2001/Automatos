package pacote;

public class Regras {

    public boolean regra_dois_digitos(String cadeia, char dg1, char dg2) {
        char validacao;
        boolean valida = false;
        for(int x=0;x<cadeia.length()-1;x++) {
            validacao = cadeia.charAt(x);
            if(validacao == dg1 && cadeia.charAt(x+1) == dg2) {
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
    
    public boolean regra_ndigitos_pares(String cadeia, char dg1) {
        int elementos = 0;
        for(int x=0;x<cadeia.length();x++) {
            if(cadeia.charAt(x) == dg1) {
                elementos = elementos + 1;
            }
        }
        if(elementos != 0 && elementos%2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean regra_ndigitos_impares(String cadeia, char dg1) {
        int elementos = 0;
        for(int x=0;x<cadeia.length();x++) {
            if(cadeia.charAt(x) == dg1) {
                elementos = elementos + 1;
            }
        }
        if(elementos != 0 && elementos%2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

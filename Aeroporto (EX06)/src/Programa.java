import br.edu.up.Telas.MenuAeroporto;
import br.edu.up.Modelos.*;

public class Programa {
    public static void main(String[] args){
        MenuAeroporto menu = new MenuAeroporto();
        int opcao;
        int opcao2;

        do {
            opcao = menu.exibirMenu();
            switch (opcao){
                case 1: 
                Pessoa pessoa = menu.registrarPessoa();
                opcao2 = menu.tipoPessoa();
                if(opcao2 == 1){
                    Passageiro passageiro = menu.registrarPassageiro(nome, rg, );
                } else {
                    Tripulacao tripulacao = menu.registrarTripulacao();
                }
            }
        }

        menu.exibirMenu();
        System.out.println("Rato");
    }
}

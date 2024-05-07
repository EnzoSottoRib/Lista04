import br.edu.up.*;
import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Estacionamento;
import br.edu.up.telas.MenuEstacionamento;

public class Programa {
    public static void main(String[] args){
        Estacionamento estacionamento = new Estacionamento();
        MenuEstacionamento menu = new MenuEstacionamento();
        int opcao;

        do {
            opcao = menu.exibirMenu();
            switch (opcao){
                case 1:
                    if (estacionamento.getVagasLivres() > 0){
                        Carro carro = menu.lerDadosCarro();
                        estacionamento.ocuparVaga(carro);
                        System.out.println("Carro adicionado!");
                    } else {
                        System.out.println("Todas as vagas estão ocupadas!");
                    }break;
                case 2:
                    String placaRemover = menu.lerPlaca();
                    System.out.println(estacionamento.desocuparVaga(placaRemover));
                    break;
                case 3:
                    System.out.println(estacionamento.emitirRelatorio());
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
                default: 
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);
    }
}

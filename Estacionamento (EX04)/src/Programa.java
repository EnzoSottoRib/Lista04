import br.edu.up.*;

public class Programa {
    public static void main(String[] args){
        Estacionamento estacionamento = new Estacionamento(10);
        Menu menu = new Menu();
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
                    System.out.println("Digite a placa do carro: ");
                    String placaRemover = 
                    estacionamento.desocuparVaga(placa);
            }
        }
    }
}

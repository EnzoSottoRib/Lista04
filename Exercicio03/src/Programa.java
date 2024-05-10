import br.edu.up.Ano;
import br.edu.up.MenuCompromissos;

public class Programa {
    public static void main(String[] args) throws Exception {

        Ano ano2024 = new Ano(2024, true);
        MenuCompromissos menu = new MenuCompromissos(ano2024);
        menu.exibirMenu();
        
    }
}

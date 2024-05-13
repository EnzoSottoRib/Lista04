<<<<<<< HEAD:Exercicio08/src/br/edu/up/Controle/Comercial.java
package br.edu.up.Controle;
import java.util.Scanner;

public class Comercial extends Contato {

    Scanner leitor = new Scanner(System.in);

    public Comercial(String Cnpj) {
        super(Codigo, Cnpj, Cnpj);
=======
package br.edu.up.modelos;

public class Comercial extends Contato {

    private String cnpj;

    public Comercial(int Codigo, String Nome, String Telefone) {
        super(Codigo, Nome, Telefone);
>>>>>>> bc95d46a08d3e32aab7ec2c2047028c123581021:Exercicio08/src/br/edu/up/modelos/Comercial.java
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

<<<<<<< HEAD:Exercicio08/src/br/edu/up/Controle/Comercial.java
    public void criarContatoComercial(){
        Comercial comercial = new Comercial(Cnpj);
        System.out.printf("Digite o CNPJ de seu contato: ");
        Cnpj = leitor.nextLine();
    }

    
=======
>>>>>>> bc95d46a08d3e32aab7ec2c2047028c123581021:Exercicio08/src/br/edu/up/modelos/Comercial.java
}

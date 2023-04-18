package b_Dominio;

public class Admin extends Pessoa{
    public String senha;

    public Admin(String nome, String CPF) {
        super(nome, CPF);
        this.senha = senha;// o atributo senha tera mais sentido quando co projeto for seralizado
    }
}

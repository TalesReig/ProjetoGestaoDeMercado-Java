package b_Dominio;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    public double ValorDaConta;
    public ArrayList<Produto> pedidos;

    public Cliente(String nome, String CPF) {
        super(nome, CPF);
        this.ValorDaConta = ValorDaConta;
        this.pedidos = new ArrayList<>();
    }
    
    
}

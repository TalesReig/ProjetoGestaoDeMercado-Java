package c_Infra;

import b_Dominio.Produto;
import java.util.ArrayList;

public class RepositorioDeProduto {
    ArrayList<Produto> produtos = new ArrayList();
    
    public void inserir(Produto p){
        produtos.add(p);
    }
    
    public void Excluir(Produto p){
        produtos.remove(p);
    }
        
    public ArrayList<Produto> SelecionarTodos(){
        return produtos;
    }
    
    public void AdcionarAoCarrinho(Produto p){
        int id = produtos.indexOf(p);
        p.quantidade = produtos.get(id).quantidade-1;
    }
    
    public void RemoverDoCarrinho(String nome){
        int i = 0;
        for (Produto produto : produtos) {
            if(produtos.get(i).getNome() == nome){
                int id = produtos.indexOf(produto);
                produto.quantidade = produtos.get(id).quantidade+1;
            }
            i++;
        }
    }
}

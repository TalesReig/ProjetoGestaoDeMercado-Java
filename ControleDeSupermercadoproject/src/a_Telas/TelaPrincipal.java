
package a_Telas;

import a_Telas.Compartilhado.PainelInferior;
import a_Telas.Compartilhado.PainelLateral;
import a_Telas.Compartilhado.PainelLateralCliente;
import a_Telas.Compartilhado.PainelSuperior;
import b_Dominio.Produto;
import c_Infra.RepositorioDeProduto;
import java.awt.BorderLayout;

public class TelaPrincipal extends javax.swing.JFrame {
    public static PainelSuperior ps;
    public static PainelLateral pl;
    public static PainelLateralCliente plC;
    public static PainelInferior pi;
    public static PainelDeProdutosADM pProdutoAdm;
    public static PainelDeProdutosCliente pProdutoClientes;
    public static CadastroDeProdutos pCadastroP;
    public static PainelDoCarrinho pCarrinho; 
    public static PainelDeLogin pLogin;
    public static Dashboard Dashboard;
    public RepositorioDeProduto repositorio = new RepositorioDeProduto();
    
    public TelaPrincipal() {
        initComponents();
        
        this.setLayout(new BorderLayout());
        
        repositorio = new RepositorioDeProduto();
        pLogin = new PainelDeLogin(repositorio);
        AdicionandoAlgunsProdutos();
        this.add(pLogin, BorderLayout.CENTER);
        this.pack();
    }

    public void AdicionandoAlgunsProdutos(){
        Produto p1 = new Produto("Arroz", 20, 100);
        Produto p2 = new Produto("Feijão", 15, 150);
        Produto p3 = new Produto("Frango", 18, 250);
        Produto p4 = new Produto("Pizza", 14, 200);
        Produto p5 = new Produto("Lasanha", 13, 100);
        Produto p6 = new Produto("Açucar", 20, 200);
        
        repositorio.inserir(p1);
        repositorio.inserir(p2);
        repositorio.inserir(p3);
        repositorio.inserir(p4);
        repositorio.inserir(p5);
        repositorio.inserir(p6);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImages(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

package a_Telas.Compartilhado;

import static a_Telas.Compartilhado.PainelLateral.adm;
import a_Telas.Dashboard;
import a_Telas.PainelDeProdutosADM;
import a_Telas.PainelDeProdutosCliente;
import a_Telas.PainelDoCarrinho;
import a_Telas.TelaPrincipal;
import b_Dominio.Admin;
import b_Dominio.Cliente;
import c_Infra.RepositorioDeProduto;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PainelLateralCliente extends javax.swing.JPanel {

    public static Cliente cliente;
    
    public static PainelSuperior ps;
    public static PainelLateral pl;
    public static PainelInferior pi;
    public static PainelDeProdutosADM pproduto;
    public RepositorioDeProduto repositorio;
    
    public PainelLateralCliente(RepositorioDeProduto repositorio, Cliente cliente) {
        initComponents();
        this.repositorio = repositorio;
        this.cliente = cliente;
        txt_Usuario.setText(cliente.nome);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Usuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_DashBoard = new javax.swing.JLabel();
        btn_Produtos = new javax.swing.JLabel();
        btnCarrinho = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Usuario.setBackground(new java.awt.Color(0, 0, 0));
        txt_Usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(0, 204, 204));
        txt_Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_Usuario.setText("<Usuario>");
        jPanel1.add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 171, 164, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/male_user_50px.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 91, -1, 62));

        btn_DashBoard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_DashBoard.setForeground(new java.awt.Color(255, 255, 255));
        btn_DashBoard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_DashBoard.setText("DashBoard");
        btn_DashBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DashBoardMouseClicked(evt);
            }
        });
        jPanel1.add(btn_DashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 242, 176, -1));

        btn_Produtos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Produtos.setForeground(new java.awt.Color(255, 255, 255));
        btn_Produtos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Produtos.setText("Produtos");
        btn_Produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ProdutosMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 176, -1));

        btnCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        btnCarrinho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCarrinho.setText("Carrinho");
        btnCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarrinhoMouseClicked(evt);
            }
        });
        jPanel1.add(btnCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 318, 176, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DashBoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DashBoardMouseClicked
        TelaPrincipal.plC = new PainelLateralCliente(repositorio, cliente);
        TelaPrincipal.ps = new PainelSuperior(repositorio, cliente);
        TelaPrincipal.pi = new PainelInferior();
        TelaPrincipal.Dashboard = new Dashboard();

        //obtendo o frame e limpando
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();

        //inserindo os painéis no frame
        janela.add(TelaPrincipal.ps, BorderLayout.NORTH);
        janela.add(TelaPrincipal.pi, BorderLayout.SOUTH);
        janela.add(TelaPrincipal.plC, BorderLayout.WEST);
        janela.add(TelaPrincipal.Dashboard, BorderLayout.CENTER);

        janela.pack();
        janela.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_DashBoardMouseClicked

    private void btn_ProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProdutosMouseClicked
        TelaPrincipal.plC = new PainelLateralCliente(repositorio, cliente);
        TelaPrincipal.ps = new PainelSuperior(repositorio, cliente);
        TelaPrincipal.pi = new PainelInferior();
        TelaPrincipal.pProdutoClientes = new PainelDeProdutosCliente(repositorio, cliente);

        //obtendo o frame e limpando
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();

        //inserindo os painéis no frame
        janela.add(TelaPrincipal.ps, BorderLayout.NORTH);
        janela.add(TelaPrincipal.pi, BorderLayout.SOUTH);
        janela.add(TelaPrincipal.plC, BorderLayout.WEST);
        janela.add(TelaPrincipal.pProdutoClientes, BorderLayout.CENTER);

        janela.pack();
        janela.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_ProdutosMouseClicked

    private void btnCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarrinhoMouseClicked
        TelaPrincipal.plC = new PainelLateralCliente(repositorio, cliente);
        TelaPrincipal.ps = new PainelSuperior(repositorio, cliente);
        TelaPrincipal.pi = new PainelInferior();
        TelaPrincipal.pCarrinho = new PainelDoCarrinho(repositorio, cliente);

        //obtendo o frame e limpando
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();

        //inserindo os painéis no frame
        janela.add(TelaPrincipal.ps, BorderLayout.NORTH);
        janela.add(TelaPrincipal.pi, BorderLayout.SOUTH);
        janela.add(TelaPrincipal.plC, BorderLayout.WEST);
        janela.add(TelaPrincipal.pCarrinho, BorderLayout.CENTER);

        janela.pack();
        janela.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCarrinhoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCarrinho;
    private javax.swing.JLabel btn_DashBoard;
    private javax.swing.JLabel btn_Produtos;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_Usuario;
    // End of variables declaration//GEN-END:variables
}

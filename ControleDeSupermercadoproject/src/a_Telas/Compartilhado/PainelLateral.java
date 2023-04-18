/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package a_Telas.Compartilhado;

import a_Telas.Dashboard;
import a_Telas.PainelDeProdutosADM;
import a_Telas.TelaPrincipal;
import b_Dominio.Admin;
import b_Dominio.Cliente;
import c_Infra.RepositorioDeProduto;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Tales Reig
 */
public class PainelLateral extends javax.swing.JPanel {

    public static Cliente cliente;
    public static Admin adm;
    
    public static PainelSuperior ps;
    public static PainelLateral pl;
    public static PainelInferior pi;
    public static PainelDeProdutosADM pproduto;
    public RepositorioDeProduto repositorio;
    
    public PainelLateral(RepositorioDeProduto repositorio,Admin adm) {
        initComponents();
        this.repositorio = repositorio;
        this.adm = adm;
        txt_Usuario.setText(adm.nome);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Usuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_DashBoard = new javax.swing.JLabel();
        btn_Produtos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        txt_Usuario.setBackground(new java.awt.Color(0, 0, 0));
        txt_Usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(0, 204, 204));
        txt_Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_Usuario.setText("<Usuario>");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/male_user_50px.png"))); // NOI18N

        btn_DashBoard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_DashBoard.setForeground(new java.awt.Color(255, 255, 255));
        btn_DashBoard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_DashBoard.setText("DashBoard");
        btn_DashBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DashBoardMouseClicked(evt);
            }
        });

        btn_Produtos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Produtos.setForeground(new java.awt.Color(255, 255, 255));
        btn_Produtos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Produtos.setText("Produtos");
        btn_Produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ProdutosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(62, 62, 62))
            .addComponent(btn_DashBoard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Produtos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Usuario)
                .addGap(46, 46, 46)
                .addComponent(btn_DashBoard)
                .addGap(18, 18, 18)
                .addComponent(btn_Produtos)
                .addContainerGap(237, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DashBoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DashBoardMouseClicked
        TelaPrincipal.pl = new PainelLateral(repositorio, adm);
        TelaPrincipal.ps = new PainelSuperior(repositorio, adm);
        TelaPrincipal.pi = new PainelInferior();
        TelaPrincipal.Dashboard = new Dashboard();

        //obtendo o frame e limpando
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();

        //inserindo os painéis no frame
        janela.add(TelaPrincipal.ps, BorderLayout.NORTH);
        janela.add(TelaPrincipal.pi, BorderLayout.SOUTH);
        janela.add(TelaPrincipal.pl, BorderLayout.WEST);
        janela.add(TelaPrincipal.Dashboard, BorderLayout.CENTER);

        janela.pack();
        janela.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_DashBoardMouseClicked

    private void btn_ProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProdutosMouseClicked
        TelaPrincipal.pl = new PainelLateral(repositorio, adm);
        TelaPrincipal.ps = new PainelSuperior(repositorio, adm);
        TelaPrincipal.pi = new PainelInferior();
        TelaPrincipal.pProdutoAdm = new PainelDeProdutosADM(repositorio, adm);

        //obtendo o frame e limpando
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();

        //inserindo os painéis no frame
        janela.add(TelaPrincipal.ps, BorderLayout.NORTH);
        janela.add(TelaPrincipal.pi, BorderLayout.SOUTH);
        janela.add(TelaPrincipal.pl, BorderLayout.WEST);
        janela.add(TelaPrincipal.pProdutoAdm, BorderLayout.CENTER);

        janela.pack();
        janela.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_ProdutosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_DashBoard;
    private javax.swing.JLabel btn_Produtos;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel txt_Usuario;
    // End of variables declaration//GEN-END:variables
}

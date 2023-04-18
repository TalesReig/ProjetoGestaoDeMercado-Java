/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package a_Telas.Compartilhado;

import a_Telas.PainelDeLogin;
import static a_Telas.TelaPrincipal.pLogin;
import b_Dominio.Pessoa;
import c_Infra.RepositorioDeProduto;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class PainelSuperior extends javax.swing.JPanel {

    public  RepositorioDeProduto repositorio;
    public static Pessoa cliente;
            
    public PainelSuperior(RepositorioDeProduto repositorio, Pessoa cliente) {
        initComponents();
        this.repositorio = repositorio;
        this.cliente = cliente;
        txt_Usuario.setText(cliente.nome);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("I");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-logout-arredondado-para-baixo-50.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/male_user_50px.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Olá");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 40, -1, -1));

        txt_Usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_Usuario.setText("<Usuario>");
        add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 40, 90, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mercado Descontão");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        pLogin = new PainelDeLogin(repositorio);
        
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();

        
        janela.add(pLogin, BorderLayout.CENTER);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel txt_Usuario;
    // End of variables declaration//GEN-END:variables
}

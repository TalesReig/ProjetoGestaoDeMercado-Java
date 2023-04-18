package a_Telas;

import a_Telas.Compartilhado.PainelInferior;
import a_Telas.Compartilhado.PainelLateral;
import a_Telas.Compartilhado.PainelLateralCliente;
import a_Telas.Compartilhado.PainelSuperior;
import b_Dominio.Admin;
import b_Dominio.Cliente;
import c_Infra.RepositorioDeProduto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

public class PainelDeLogin extends javax.swing.JPanel {
    
    public static Cliente cliente;
    public static Admin adm;
    public static PainelSuperior ps;
    public static PainelLateral pl;
    public static PainelInferior pi;
    public static PainelDeProdutosADM pproduto;
    public RepositorioDeProduto repositorio;
    
    public PainelDeLogin(RepositorioDeProduto repositorio) {
        initComponents();
        txt_nome.setCaretColor(Color.WHITE);
        txt_cpf.setCaretColor(Color.WHITE);
        this.repositorio = repositorio;
        ConfigurarTelaInicial();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txt_nome = new javax.swing.JTextField();
        rb_adm = new javax.swing.JRadioButton();
        rb_cliente = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        passord_senha = new javax.swing.JPasswordField();
        separator_senha = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        label_senha = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_SingUp = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        txt_cpf = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(null);

        txt_nome.setBackground(new java.awt.Color(51, 51, 51));
        txt_nome.setForeground(new java.awt.Color(255, 255, 255));
        txt_nome.setBorder(null);

        rb_adm.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rb_adm);
        rb_adm.setForeground(java.awt.Color.white);
        rb_adm.setText("Adminstrador");
        rb_adm.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_admStateChanged(evt);
            }
        });

        rb_cliente.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rb_cliente);
        rb_cliente.setForeground(java.awt.Color.white);
        rb_cliente.setText("Cliente");
        rb_cliente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_clienteStateChanged(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        passord_senha.setBackground(new java.awt.Color(51, 51, 51));
        passord_senha.setForeground(new java.awt.Color(255, 255, 255));
        passord_senha.setBorder(null);

        separator_senha.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CPF:");

        label_senha.setForeground(new java.awt.Color(255, 255, 255));
        label_senha.setText("Senha:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Modo:");

        btn_SingUp.setBackground(new java.awt.Color(0, 204, 204));
        btn_SingUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_SingUp.setForeground(new java.awt.Color(255, 255, 255));
        btn_SingUp.setText("Sing Up");
        btn_SingUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SingUpActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Já conhece nosso App Descontão ?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 280, 10));

        txt_cpf.setBackground(new java.awt.Color(51, 51, 51));
        txt_cpf.setBorder(null);
        txt_cpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txt_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cpf))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3)
                    .addComponent(separator_senha)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_senha)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_adm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_cliente))
                            .addComponent(passord_senha)))
                    .addComponent(btn_SingUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(4, 4, 4)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_adm)
                    .addComponent(rb_cliente)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(passord_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_senha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_SingUp)
                .addContainerGap(100, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SingUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SingUpActionPerformed
        String nome = txt_nome.getText();
        String cpf = txt_cpf.getText();
        JPasswordField senha = passord_senha;
        
        try{
            if((rb_adm.isSelected() == true || rb_cliente.isSelected()== true) && nome.isEmpty()==false && txt_cpf.getText().equals("   .   .   -  ")== false){
                if(rb_adm.isSelected()){
                        InicializandoTelaADM(nome,cpf);
                    }else{
                         InicializandoTelaCliente(nome,cpf);
                    }
            }else{
                throw new Exception();
            }
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Nome e CPF são campos obrigatórios!", "Login No Sistema!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_SingUpActionPerformed

    private void rb_admStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_admStateChanged
        if(rb_adm.isSelected()){
            label_senha.setVisible(true);
            separator_senha.setVisible(true);
            passord_senha.setVisible(true);
        }else{
            label_senha.setVisible(false);
            separator_senha.setVisible(false);
            passord_senha.setVisible(false);
        }
    }//GEN-LAST:event_rb_admStateChanged

    private void rb_clienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_clienteStateChanged
        if(rb_cliente.isSelected()){
            label_senha.setVisible(false);
            separator_senha.setVisible(false);
            passord_senha.setVisible(false);
        }else{
            label_senha.setVisible(true);
            separator_senha.setVisible(true);
            passord_senha.setVisible(true);
        }
    }//GEN-LAST:event_rb_clienteStateChanged
    
    private void ConfigurarTelaInicial(){
        label_senha.setVisible(false);
        separator_senha.setVisible(false);
        passord_senha.setVisible(false);
    }
    
    private void InicializandoTelaADM(String nome,String cpf){
        adm = new Admin(nome,cpf);

        //declarando painéis 
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
    }
    
    private void InicializandoTelaCliente(String nome, String cpf){
        cliente = new Cliente(nome,cpf);
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
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SingUp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel label_senha;
    private javax.swing.JPasswordField passord_senha;
    private javax.swing.JRadioButton rb_adm;
    private javax.swing.JRadioButton rb_cliente;
    private javax.swing.JSeparator separator_senha;
    private javax.swing.JFormattedTextField txt_cpf;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}

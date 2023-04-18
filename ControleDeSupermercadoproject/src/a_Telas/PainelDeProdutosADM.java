package a_Telas;

import a_Telas.Compartilhado.PainelInferior;
import a_Telas.Compartilhado.PainelLateral;
import a_Telas.Compartilhado.PainelSuperior;
import b_Dominio.Admin;
import b_Dominio.Produto;
import c_Infra.RepositorioDeProduto;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class PainelDeProdutosADM extends javax.swing.JPanel {


    public RepositorioDeProduto repositorio;
    public Produto produto;
    public static Admin adm;
    public ArrayList<Produto> produtos = new ArrayList<>();
    public PainelDeProdutosADM telaprodutos;
    public String selecionado = null;
    
    public DefaultTableModel modelProdutos;
    
    
    public PainelDeProdutosADM(RepositorioDeProduto repositorio, Admin adm) {
        initComponents();
        this.repositorio = repositorio;
        produtos = repositorio.SelecionarTodos();
        this.adm = adm;
        this.modelProdutos = (DefaultTableModel)this.tb_Produtos.getModel();
        if(produtos.size() != 0){
            carregarTabela();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Produtos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_editar = new javax.swing.JLabel();
        btn_Inserir = new javax.swing.JLabel();
        btn_visualizar = new javax.swing.JLabel();
        btn_excluir = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(990, 600));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_Produtos.setBackground(new java.awt.Color(255, 255, 255));
        tb_Produtos.setForeground(new java.awt.Color(0, 0, 0));
        tb_Produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOME", "PREÇO", "QUANTIDADE"
            }
        ));
        tb_Produtos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb_Produtos.setGridColor(new java.awt.Color(0, 0, 0));
        tb_Produtos.setMaximumSize(new java.awt.Dimension(2147483647, 300));
        tb_Produtos.setRowHeight(30);
        tb_Produtos.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tb_Produtos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tb_Produtos);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 960, 380));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Produtos");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 960, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        btn_editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("Editar");
        btn_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editarMouseClicked(evt);
            }
        });

        btn_Inserir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Inserir.setForeground(new java.awt.Color(255, 255, 255));
        btn_Inserir.setText("Inserir");
        btn_Inserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_InserirMouseClicked(evt);
            }
        });

        btn_visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search_26px.png"))); // NOI18N
        btn_visualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_visualizarMouseClicked(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_excluir.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluir.setText("Excluir");
        btn_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_excluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_Inserir)
                .addGap(18, 18, 18)
                .addComponent(btn_editar)
                .addGap(18, 18, 18)
                .addComponent(btn_excluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 737, Short.MAX_VALUE)
                .addComponent(btn_visualizar)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_visualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addComponent(btn_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Inserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 960, 70));

        add(jPanel4, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_excluirMouseClicked
        switch(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o produto", "Exclusão de produtos", JOptionPane.YES_NO_OPTION))
        {
            case 0:
            String temp;
            int column = 0;
            int row = this.tb_Produtos.getSelectedRow();
            temp = (String) this.tb_Produtos.getModel().getValueAt(row, column);
            Produto produto = null;

            produtos =  repositorio.SelecionarTodos();

            try{
                for(int i = 0; i < produtos.size(); i++){
                    if(temp == produtos.get(i).getNome())
                    {
                        this.modelProdutos.removeRow(i);
                        produto = (Produto) produtos.remove(i);
                        repositorio.Excluir(produto);
                        carregarTabela();
                    }
                }
                carregarTabela();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Selecione um Produto da tabela!", "Exclusão de Produtos!", JOptionPane.ERROR_MESSAGE);
            }
            break;
            case 1:

            break;
        }
    }//GEN-LAST:event_btn_excluirMouseClicked

    private void btn_visualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_visualizarMouseClicked

    }//GEN-LAST:event_btn_visualizarMouseClicked

    private void btn_InserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InserirMouseClicked
        TelaPrincipal.pl = new PainelLateral(repositorio, adm);
        TelaPrincipal.ps = new PainelSuperior(repositorio, adm);
        TelaPrincipal.pi = new PainelInferior();
        TelaPrincipal.pCadastroP = new CadastroDeProdutos(repositorio);

        //obtendo o frame e limpando
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();

        //inserindo os painéis no frame
        janela.add(TelaPrincipal.ps, BorderLayout.NORTH);
        janela.add(TelaPrincipal.pi, BorderLayout.SOUTH);
        janela.add(TelaPrincipal.pl, BorderLayout.WEST);
        janela.add(TelaPrincipal.pCadastroP, BorderLayout.CENTER);

        janela.pack();
        janela.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_InserirMouseClicked

    private void btn_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseClicked
        String temp;
        int column = 0;
        int row = this.tb_Produtos.getSelectedRow();
        temp = (String) this.tb_Produtos.getModel().getValueAt(row, column);
        Produto produto = null;

        produtos =  repositorio.SelecionarTodos();

        try{
            for(int i = 0; i < produtos.size(); i++){
                if(temp == produtos.get(i).getNome()){
                    produto = (Produto)produtos.get(i);
                }
            }
            carregarTabela();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Selecione um Produto da tabela!", "Exclusão de Produtos!", JOptionPane.ERROR_MESSAGE);
        }

        TelaPrincipal.pl = new PainelLateral(repositorio, adm);
        TelaPrincipal.ps = new PainelSuperior(repositorio, adm);
        TelaPrincipal.pi = new PainelInferior();
        TelaPrincipal.pCadastroP = new CadastroDeProdutos(repositorio,produto,"Editar");

        //obtendo o frame e limpando
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();

        //inserindo os painéis no frame
        janela.add(TelaPrincipal.ps, BorderLayout.NORTH);
        janela.add(TelaPrincipal.pi, BorderLayout.SOUTH);
        janela.add(TelaPrincipal.pl, BorderLayout.WEST);
        janela.add(TelaPrincipal.pCadastroP, BorderLayout.CENTER);

        janela.pack();
        janela.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_editarMouseClicked
    
    public void carregarTabela(){
        produtos = repositorio.SelecionarTodos();
        ((DefaultTableModel) tb_Produtos.getModel()).setRowCount(0);
        
        for(int i = 0; i < produtos.size(); i++){
            this.modelProdutos.insertRow(i,new Object[]{produtos.get(i).getNome(),produtos.get(i).getPreco(),produtos.get(i).getQuantidade()});
        }
    
        this.tb_Produtos.setModel(modelProdutos);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Inserir;
    private javax.swing.JLabel btn_editar;
    private javax.swing.JLabel btn_excluir;
    private javax.swing.JLabel btn_visualizar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_Produtos;
    // End of variables declaration//GEN-END:variables
}

package a_Telas;

import b_Dominio.Produto;
import b_Dominio.Cliente;
import c_Infra.RepositorioDeProduto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PainelDeProdutosCliente extends javax.swing.JPanel {

    public RepositorioDeProduto repositorio;
    public Produto produto;
    public ArrayList<Produto> produtos = new ArrayList<>();
    public PainelDeProdutosADM telaprodutos;
    public String selecionado = null;
    public static Cliente cliente;
    public DefaultTableModel modelProdutos;
    
    public PainelDeProdutosCliente(RepositorioDeProduto repositorio, Cliente cliente) {
        initComponents();
        this.repositorio = repositorio;
        this.cliente = cliente;
        produtos = repositorio.SelecionarTodos();
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
        btn_AdcCarrinho = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 960, 400));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Produtos");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 960, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        btn_AdcCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_AdcCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        btn_AdcCarrinho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_AdcCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-adicionar-o-carrinho-de-compras-30.png"))); // NOI18N
        btn_AdcCarrinho.setText("Adicionar ao Carrinho");
        btn_AdcCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AdcCarrinhoMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search_26px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn_AdcCarrinho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 714, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_AdcCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 960, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AdcCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AdcCarrinhoMouseClicked
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
                    if(produto.quantidade != 0){
                        repositorio.AdcionarAoCarrinho(produto); 
                        cliente.pedidos.add(produto); 
                        carregarTabela();
                    }else{
                        JOptionPane.showMessageDialog(null, "Produto sem estoque disponível!", "Adcionando ao carrinho!", JOptionPane.ERROR_MESSAGE);
                    }
                }       
            }

        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, "Selecione um Produto da tabela!", "Adcionando no carrinho!", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_btn_AdcCarrinhoMouseClicked

    public void carregarTabela(){
        
        produtos = repositorio.SelecionarTodos();
        ((DefaultTableModel) tb_Produtos.getModel()).setRowCount(0);
        
        for(int i = 0; i < produtos.size(); i++){
            this.modelProdutos.insertRow(i,new Object[]{produtos.get(i).getNome(),produtos.get(i).getPreco(),produtos.get(i).getQuantidade()});
        }
        this.tb_Produtos.setModel(modelProdutos);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_AdcCarrinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_Produtos;
    // End of variables declaration//GEN-END:variables
}

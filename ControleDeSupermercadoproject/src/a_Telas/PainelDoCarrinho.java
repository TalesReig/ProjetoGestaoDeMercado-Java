package a_Telas;

import static a_Telas.PainelDeProdutosCliente.cliente;
import b_Dominio.Cliente;
import b_Dominio.Produto;
import c_Infra.RepositorioDeProduto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PainelDoCarrinho extends javax.swing.JPanel {
    
    double valor = 0;
    public Cliente cliente;
    public DefaultTableModel modelProdutos;
    public RepositorioDeProduto repositorio;
    public ArrayList<Produto> produtos = new ArrayList<>();
    
    public PainelDoCarrinho(RepositorioDeProduto repositorio,Cliente cliente) {
        initComponents();
        
        this.cliente = cliente;
        produtos = cliente.pedidos;
        this.repositorio = repositorio;
        this.modelProdutos = (DefaultTableModel)this.tb_Produtos.getModel();
        
        if(!produtos.isEmpty()){
            carregarInformacoesDaTela();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tb_Produtos = new javax.swing.JTable();
        btn_remover = new javax.swing.JButton();
        btn_finalizarCompra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Carrinho De Compras");
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 960, -1));

        jPanel23.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 960, 70));

        tb_Produtos.setBackground(new java.awt.Color(255, 255, 255));
        tb_Produtos.setForeground(new java.awt.Color(0, 0, 0));
        tb_Produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NOME", "PREÇO"
            }
        ));
        tb_Produtos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb_Produtos.setGridColor(new java.awt.Color(0, 0, 0));
        tb_Produtos.setMaximumSize(new java.awt.Dimension(2147483647, 300));
        tb_Produtos.setRowHeight(30);
        tb_Produtos.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tb_Produtos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane12.setViewportView(tb_Produtos);

        add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 960, 290));

        btn_remover.setBackground(new java.awt.Color(0, 204, 204));
        btn_remover.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_remover.setForeground(new java.awt.Color(255, 255, 255));
        btn_remover.setText("Remover Item Do Pedido");
        btn_remover.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });
        add(btn_remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 240, -1));

        btn_finalizarCompra.setBackground(new java.awt.Color(0, 204, 204));
        btn_finalizarCompra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_finalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        btn_finalizarCompra.setText("Finalizar Compra");
        btn_finalizarCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_finalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarCompraActionPerformed(evt);
            }
        });
        add(btn_finalizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 240, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Valor Total:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        txt_valor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_valor.setForeground(new java.awt.Color(0, 0, 0));
        txt_valor.setText("<Valor R$>");
        add(txt_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 543, 240, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
        
        String temp;
        int column = 0;
        int row = this.tb_Produtos.getSelectedRow();  
        temp = (String) this.tb_Produtos.getModel().getValueAt(row, column); 
        Produto produto = null;

        produtos =  cliente.pedidos;

        try{
            for(int i = 0; i < produtos.size(); i++){
                if(temp == produtos.get(i).getNome())
                {  
                    this.modelProdutos.removeRow(i);
                    repositorio.RemoverDoCarrinho(produtos.get(i).getNome()); 
                    cliente.pedidos.remove(i); 
                    break;
                }    
            }
           carregarInformacoesDaTela();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Selecione um Produto da tabela!", "Exclusão de Produtos!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_removerActionPerformed

    private void btn_finalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarCompraActionPerformed
        System.out.println("\n\n\nMercado Descontão:");
        
        System.out.println("\nProdutos Adquiridos:\n");
        for (Produto pedido : cliente.pedidos) {
            System.out.println("Produto: "+pedido.nome +" Preço:"+ pedido.preco+"R$.");
        }
        System.out.println("\n"+cliente.nome);
        System.out.println("Sua compra custou um total de: "+valor+"R$");
        
        
        cliente.pedidos.clear();
        
    }//GEN-LAST:event_btn_finalizarCompraActionPerformed

    public void carregarInformacoesDaTela(){
        
        produtos = cliente.pedidos;
        ((DefaultTableModel) tb_Produtos.getModel()).setRowCount(0);
        valor = 0;
        
        for(int i = 0; i < produtos.size(); i++){
            this.modelProdutos.insertRow(i,new Object[]{produtos.get(i).getNome(),produtos.get(i).getPreco(),produtos.get(i).getQuantidade()});
            valor = valor + produtos.get(i).getPreco();
        }
        this.tb_Produtos.setModel(modelProdutos);
        txt_valor.setText(String.valueOf(valor));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_finalizarCompra;
    private javax.swing.JButton btn_remover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tb_Produtos;
    private javax.swing.JLabel txt_valor;
    // End of variables declaration//GEN-END:variables
}

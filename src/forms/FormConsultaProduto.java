/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import dao.ProdutoDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author matheus
 */
public class FormConsultaProduto extends javax.swing.JFrame {

    /**
     * Creates new form FormConsultaProduto
     */
    
    // Tabela deve ter acesso global na classe.
    private DefaultTableModel modelo;
    public FormConsultaProduto() {
        initComponents();
        // Criando o modelo de tabela.
        modelo = (DefaultTableModel)tbProduto.getModel();
        // Removendo as linhas das tabelas.
        for(int i=tbProduto.getRowCount() -1; i>=0; i--){
            modelo.removeRow(i);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        cbListarTodos = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Consulta de Produtos em Estoque");
        setFocusable(false);
        setResizable(false);

        jLabel1.setText("Código:");

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icBuscar.png"))); // NOI18N
        btBuscar.setText("Buscar Produto");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        tbProduto.setBorder(null);
        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Fornecedor", "Estoque", "Vl. Unitário", "Dt. Fabricação", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProduto.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbProduto.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbProduto);
        if (tbProduto.getColumnModel().getColumnCount() > 0) {
            tbProduto.getColumnModel().getColumn(0).setPreferredWidth(75);
            tbProduto.getColumnModel().getColumn(1).setPreferredWidth(275);
            tbProduto.getColumnModel().getColumn(2).setPreferredWidth(276);
            tbProduto.getColumnModel().getColumn(3).setPreferredWidth(80);
            tbProduto.getColumnModel().getColumn(4).setPreferredWidth(80);
            tbProduto.getColumnModel().getColumn(5).setPreferredWidth(115);
            tbProduto.getColumnModel().getColumn(6).setPreferredWidth(300);
        }

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icAtualizar.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icExcluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icSair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        cbListarTodos.setText("Listar Todos");
        cbListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1207, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbListarTodos)))
                        .addGap(27, 27, 27)
                        .addComponent(btBuscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbListarTodos)))
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btExcluir)
                    .addComponent(btEditar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1229, 572));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        /* Buscando os produtos*/
        ProdutoDAO dao;
        // Limpando a tabela.
        for(int i=modelo.getRowCount()-1; i>=0; i--){
            modelo.removeRow(i);
        }
        // Verificando se o usuário quer listar todos os produtos.
        if(cbListarTodos.isSelected()){
            try {
                // Abrindo conexão com o banco de dados.
                dao = new ProdutoDAO();
                
                // Criando uma lista para receber a lista retornada pelo banco de dados.
                List<Produto> lista = dao.todosProdutos();
                
                // Criando formatador de datas.
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                
                // Percorrendo a lista e alimentando a tabela.
                lista.forEach((p) -> {
                    modelo.addRow(new Object[]{p.getCodigo(), p.getNome(), p.getFornecedor(), p.getEstoque(), p.getVlUnitario(),
                        p.getDataFabricacao(), p.getDescricao()});
                });
                
                // Habilitando os botões para editar/exlcuir um registro.
                btEditar.setEnabled(true);
                btExcluir.setEnabled(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar produto!\n" + ex, "ERRO - BUSCAR PRODUTO", ERROR_MESSAGE);
            }
        }
        else{

            try {
                
                // Abrindo conexão com o banco de dados.
                dao = new ProdutoDAO();
                
                // Buscando o produto.
                Produto p = dao.procurarProduto(tfCodigo.getText().toUpperCase());   
                
                // Criando formatador de datas.
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                
                // Alimentando a tabela com o produto encontrado.
                modelo.addRow(new Object[]{p.getCodigo(), p.getNome(), p.getFornecedor(), p.getEstoque(),
                p.getVlUnitario(), df.format(p.getDataFabricacao()), p.getDescricao()});    
                
                // Habilitando os botões para editar/exlcuir um registro.
                btEditar.setEnabled(true);
                btExcluir.setEnabled(true);
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar produto!\n" + ex, "ERRO - BUSCAR PRODUTO", ERROR_MESSAGE);
            }             
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void cbListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListarTodosActionPerformed
        if(cbListarTodos.isSelected()){
            tfCodigo.setText("");
            tfCodigo.setEnabled(false);
        }
        else{
            tfCodigo.setEnabled(true);
        }   
    }//GEN-LAST:event_cbListarTodosActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        /* Editando o produto */
        ProdutoDAO dao;
        Produto p;
        
        try {
            
            // Buscando o produto a ser atualizado.
            dao = new ProdutoDAO();
            
            // Capturando o produto da linha selecionada pelo usuário.
            p = dao.procurarProduto(modelo.getValueAt(tbProduto.getSelectedRow(), tbProduto.getColumn("Código").getModelIndex()).toString());

            // Chamando a tela de cadastro de produtos já com as informações do produto selecionado.
            FormProduto fp = new FormProduto(p);
            fp.setVisible(true);
            
            btEditar.setEnabled(false);
            btExcluir.setEnabled(false);
            
        } catch (Exception ex) {
            Logger.getLogger(FormConsultaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        /* Exlcuindo um produto */
        ProdutoDAO dao;
        
        // Capturando o campo código da linha selecionada na tabela.
        String codigo = (modelo.getValueAt(tbProduto.getSelectedRow(), tbProduto.getColumn("Código").getModelIndex())).toString();
        
        try {
            // Abrindo conexão com o banco de dados.
            dao = new ProdutoDAO();
            
            // Buscando o produto a ser excluído.
            Produto p = dao.procurarProduto(codigo);
            
            // Abrindo conexão com o banco de dados.
            dao = new ProdutoDAO();
            
            // Excluindo o registro selecionado na tabela.
            dao.excluir(p);
            
            // Mensagem de sucesso.
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!", "SUCESSO - EXCLUSÃO", INFORMATION_MESSAGE);
   
            // Removendo a linha excluída.
            modelo.removeRow(tbProduto.getSelectedRow());

            // Desabilitando os botões de exclusão/edição.
            btExcluir.setEnabled(false);
            btEditar.setEnabled(false); 
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados. \n" + ex, "ERRO - EXCLUSÃO", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormConsultaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JCheckBox cbListarTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProduto;
    private javax.swing.JTextField tfCodigo;
    // End of variables declaration//GEN-END:variables
}
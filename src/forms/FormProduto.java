/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import dao.ProdutoDAO;
import java.awt.Component;
import static java.lang.Integer.parseInt;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JTextField;
import model.Produto;

/**
 *
 * @author matheus
 */
public class FormProduto extends javax.swing.JFrame {

    /**
     * Creates new form FormProduto
     */
    public FormProduto() {
        initComponents();
    }
    
    public FormProduto(Produto p){
        initComponents();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        tfCodigo.setText(p.getCodigo());
        tfNome.setText(p.getNome());
        tfFornecedor.setText(p.getFornecedor());
        ftfDtFabricacao.setText(df.format(p.getDataFabricacao()));
        tfEstoque.setText(String.valueOf(p.getEstoque()));
        ftfVlUnitario.setText(String.valueOf(p.getVlUnitario()));
        taDescricao.append(p.getDescricao());
        btAtualizar.setEnabled(true);
        btCadastrar.setEnabled(false);
        tfCodigo.setEnabled(false);
        tfCodigo.setEditable(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btCadastrar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btCancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfEstoque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ftfVlUnitario = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        ftfDtFabricacao = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        tfFornecedor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icCadlivro.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setMaximumSize(new java.awt.Dimension(90, 70));
        btCadastrar.setMinimumSize(new java.awt.Dimension(90, 70));
        btCadastrar.setOpaque(true);
        btCadastrar.setPreferredSize(new java.awt.Dimension(90, 70));
        btCadastrar.setRolloverEnabled(false);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btCadastrar);

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icAtualizar.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAtualizar.setEnabled(false);
        btAtualizar.setFocusable(false);
        btAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAtualizar.setMaximumSize(new java.awt.Dimension(90, 70));
        btAtualizar.setMinimumSize(new java.awt.Dimension(90, 70));
        btAtualizar.setOpaque(true);
        btAtualizar.setPreferredSize(new java.awt.Dimension(90, 70));
        btAtualizar.setRolloverEnabled(false);
        btAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btAtualizar);
        jToolBar1.add(jSeparator1);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCancelar.setFocusable(false);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setMaximumSize(new java.awt.Dimension(90, 70));
        btCancelar.setMinimumSize(new java.awt.Dimension(90, 70));
        btCancelar.setOpaque(true);
        btCancelar.setPreferredSize(new java.awt.Dimension(90, 70));
        btCancelar.setRolloverEnabled(false);
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(btCancelar);
        jToolBar1.add(jSeparator2);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icSair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMaximumSize(new java.awt.Dimension(90, 70));
        btSair.setMinimumSize(new java.awt.Dimension(90, 70));
        btSair.setOpaque(true);
        btSair.setPreferredSize(new java.awt.Dimension(90, 70));
        btSair.setRolloverEnabled(false);
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jToolBar1.add(btSair);

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Fornecedor:");

        jLabel4.setText("Quantidade em Estoque:");

        jLabel5.setText("Vl. Uni:($.$$)");

        jLabel6.setText("Dt. Fabricação:");

        try {
            ftfDtFabricacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Descrição:");

        taDescricao.setColumns(20);
        taDescricao.setRows(5);
        jScrollPane1.setViewportView(taDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNome)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfFornecedor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftfVlUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftfDtFabricacao, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(ftfVlUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(ftfDtFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(617, 380));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        /* Tratando a data de fabricação */
        Date dataFabricacao = new Date();
        try {
            // Criando o formato a ser capturado de data.
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            // Convertendo a string capturada em um tipo Date.
            dataFabricacao = df.parse(ftfDtFabricacao.getText());
            
        } catch (ParseException ex) {
            System.out.println("ERRO" + ex);
        }
        
        // Capturando os dados dos campos e criando um objeto produto com eles.
        Produto produto = new Produto(tfCodigo.getText(), tfNome.getText(), tfFornecedor.getText(), 
                parseInt(tfEstoque.getText()), Float.parseFloat(ftfVlUnitario.getText()), dataFabricacao, taDescricao.getText());
        
        /* Gravando no banco */
        ProdutoDAO dao;
        try {
            dao = new ProdutoDAO();
            dao.salvar(produto);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o produto!\n" + ex, "ERRO - PRODUTO", ERROR_MESSAGE);
        }
        
        /* Limpando a Tela */
        for(int i=0; i<getContentPane().getComponentCount(); i++){
            Component c = getContentPane().getComponent(i);
            if(c instanceof JTextField){
                ((JTextField)c).setText("");
            }
            else if(c instanceof JFormattedTextField){
                ((JFormattedTextField)c).setText("");
            }
        }
        taDescricao.setText("");
        
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        /* Limpando a Tela */
        for(int i=0; i<getContentPane().getComponentCount(); i++){
            Component c = getContentPane().getComponent(i);
            if(c instanceof JTextField){
                ((JTextField)c).setText("");
            }
            else if(c instanceof JFormattedTextField){
                ((JFormattedTextField)c).setText("");
            }
        }
        taDescricao.setText("");
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        /* Tratando a data de fabricação */
        Produto produto = new Produto();
        ProdutoDAO dao;
        Date dataFabricacao;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            
            // Convertendo a string capturada em um tipo Date.
            dataFabricacao = df.parse(ftfDtFabricacao.getText());
            
        } catch (ParseException ex) {
            System.out.println("ERRO" + ex);
        }
        
        try {
            /* Buscando o produto no banco para atualização */
            // Capturando os dados dos campos e criando um objeto produto com eles.
            dao = new ProdutoDAO();
            produto = dao.procurarProduto(tfCodigo.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o produto!\n" + ex, "ERRO - PRODUTO", ERROR_MESSAGE);
        }
        
        produto.setNome(tfNome.getText());
        produto.setDescricao(taDescricao.getText());
        produto.setFornecedor(tfFornecedor.getText());
        produto.setEstoque(parseInt(tfEstoque.getText()));
        produto.setVlUnitario(Float.parseFloat(ftfVlUnitario.getText()));
        try {
            produto.setDataFabricacao(df.parse(ftfDtFabricacao.getText()));
        } catch (ParseException ex) {
            System.out.println("ERRO" + ex);
        }
        
        /* Gravando no banco */
        try {
            dao = new ProdutoDAO();
            dao.atualizar(produto);
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!", "SUCESSO - PRODUTO", INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o produto!\n" + ex, "ERRO - PRODUTO", ERROR_MESSAGE);
        }
        
        /* Limpando a Tela */
        for(int i=0; i<getContentPane().getComponentCount(); i++){
            Component c = getContentPane().getComponent(i);
            if(c instanceof JTextField){
                ((JTextField)c).setText("");
            }
            else if(c instanceof JFormattedTextField){
                ((JFormattedTextField)c).setText("");
            }
        }
        taDescricao.setText("");
    }//GEN-LAST:event_btAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSair;
    private javax.swing.JFormattedTextField ftfDtFabricacao;
    private javax.swing.JFormattedTextField ftfVlUnitario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEstoque;
    private javax.swing.JTextField tfFornecedor;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
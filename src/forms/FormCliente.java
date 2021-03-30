/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import dao.ClienteDAO;
import enums.CidadesES;
import enums.EstadosBrasil;
import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import model.Cliente;
import model.Endereco;

/**
 *
 * @author matheus
 */
public class FormCliente extends javax.swing.JFrame {

    /**
     * Creates new form FormCliente
     */
    public FormCliente() {
        initComponents();
        // Limpando as combo box.
        cbEstado.removeAllItems();
        cbCidade.removeAllItems();
        // Desabilitando o botão de atualizar.
        btAtualizar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEstadoCivil = new javax.swing.ButtonGroup();
        tfNome = new javax.swing.JTextField();
        ftfCpf = new javax.swing.JFormattedTextField();
        btBuscar = new javax.swing.JButton();
        jtpAbas = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        ftfTelefone = new javax.swing.JFormattedTextField();
        tfEmail = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jrbSolteiro = new javax.swing.JRadioButton();
        jrbCasado = new javax.swing.JRadioButton();
        jrbDivorciado = new javax.swing.JRadioButton();
        jrbUnEstavel = new javax.swing.JRadioButton();
        jrbViuvo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tfLogradouro = new javax.swing.JTextField();
        tfComplemento = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        cbCidade = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ftfCep = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        try {
            ftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icBuscar.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jtpAbas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        try {
            ftfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        bgEstadoCivil.add(jrbSolteiro);
        jrbSolteiro.setText("Solteiro");
        jrbSolteiro.setActionCommand("Solteiro");

        bgEstadoCivil.add(jrbCasado);
        jrbCasado.setText("Casado");
        jrbCasado.setActionCommand("Casado");

        bgEstadoCivil.add(jrbDivorciado);
        jrbDivorciado.setText("Divorciado");
        jrbDivorciado.setActionCommand("Divorciado");

        bgEstadoCivil.add(jrbUnEstavel);
        jrbUnEstavel.setText("União Estável");
        jrbUnEstavel.setActionCommand("União Estável");

        bgEstadoCivil.add(jrbViuvo);
        jrbViuvo.setText("Viúvo");
        jrbViuvo.setActionCommand("Viúvo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jrbSolteiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbCasado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbDivorciado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbUnEstavel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbViuvo)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbSolteiro)
                    .addComponent(jrbCasado)
                    .addComponent(jrbDivorciado)
                    .addComponent(jrbUnEstavel)
                    .addComponent(jrbViuvo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Estado Civil:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("E-mail:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jtpAbas.addTab("Dados Pessoais", jPanel2);

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        cbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Logradouro:");

        jLabel7.setText("Complemento:");

        try {
            ftfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setText("CEP:");

        jLabel9.setText("Estado:");

        jLabel10.setText("Cidade:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(tfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(ftfCep))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jtpAbas.addTab("Endereço Completo", jPanel1);

        jLabel1.setText("CPF:");

        jLabel2.setText("Nome Completo:");

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icIncluirCliente.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icAtualizar2.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icLimpar.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icSair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtpAbas)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(ftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBuscar)
                                .addGap(27, 27, 27))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addGap(27, 27, 27)
                .addComponent(jtpAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btAtualizar)
                    .addComponent(btLimpar)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(646, 426));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // Capturando dados dos campos.
        Endereco e = new Endereco(tfLogradouro.getText(), tfComplemento.getText(), cbCidade.getSelectedItem().toString(),
        cbEstado.getSelectedItem().toString(), ftfCep.getText());
        
        // Capturando dados dos campos.
        Cliente cliente = new Cliente(tfNome.getText(), ftfCpf.getText(), bgEstadoCivil.getSelection().getActionCommand(),
        ftfTelefone.getText(), tfEmail.getText(), e);
        
        ClienteDAO dao;
        try {
            // Abrindo conexão para cadastro.
            dao = new ClienteDAO();
            // Cadastrando o cliente.
            dao.salvar(cliente);
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "SUCESSO", INFORMATION_MESSAGE);
            // Limpando os componentes da janela.
            for(int i=0; i<getContentPane().getComponentCount(); i++){
                Component c = getContentPane().getComponent(i);
                if(c instanceof JTextField){
                    ((JTextField)c).setText("");
                }
                else if(c instanceof JFormattedTextField){
                    ((JFormattedTextField)c).setText("");
                }
                else if(c instanceof JTabbedPane){
                    ftfTelefone.setText("");
                    bgEstadoCivil.clearSelection();
                    tfEmail.setText("");
                    tfLogradouro.setText("");
                    tfComplemento.setText("");
                    cbCidade.setSelectedIndex(-1);
                    cbEstado.setSelectedIndex(0);
                    ftfCep.setText("");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco.\n" + ex, "ERRO", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // Verificando se o campo CPF está vazio.
        if(ftfCpf.getText().equals("   .   .   -  ")){
            JOptionPane.showMessageDialog(null, "Favor informar o CPF à ser buscado!", "ERRO", ERROR_MESSAGE);
        }
        else{
            Cliente cliente = new Cliente();
            ClienteDAO dao;
            try {
                // Abrindo conexão para busca do cliente.
                dao = new ClienteDAO();
                // Buscando o cliente.
                cliente = dao.procurarCliente(ftfCpf.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro no banco de dados.\n"+ex, "ERRO", ERROR_MESSAGE);
            }
            ftfCpf.setText(cliente.getCpf());
            tfNome.setText(cliente.getNome());
            tfEmail.setText(cliente.getEmail());
            ftfTelefone.setText(cliente.getTelefone());
            tfComplemento.setText(cliente.getEndereco().getComplemento());
            tfLogradouro.setText(cliente.getEndereco().getLogradouro());
            ftfCep.setText(cliente.getEndereco().getCep());
            
            // Comparando o estado civil gravado no banco e selecionando o radiobutton apropriado.
            switch(cliente.getEstCivil()){
                case "Solteiro":
                    jrbSolteiro.setSelected(true);
                    break;
                case "Casado":
                    jrbSolteiro.setSelected(true);
                    break;
                case "União Estável":
                    jrbUnEstavel.setSelected(true);
                    break;
                case "Viúvo":
                    jrbViuvo.setSelected(true);
                    break;
                case "Divorciado":
                    jrbDivorciado.setSelected(true);
                    break;
            }
            
            // Setando o estado correspondente na combobox.
            for(int i=0; i<cbEstado.getItemCount(); i++){
                if(cbEstado.getItemAt(i).equals("ES")){
                    cbEstado.setSelectedIndex(i);
                    break;
                }   
            }            
            
            // Setando o estado correspondente na combobox.
            for(int i=0; i<cbCidade.getItemCount(); i++){
                if(cliente.getEndereco().getCidade().equals(cbCidade.getItemAt(i))){
                    cbCidade.setSelectedIndex(i);
                    break;
                }
            }
            
            // Habilitando o botão atualizar.
            btAtualizar.setEnabled(true);
            
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        EstadosBrasil[] listaEstados = EstadosBrasil.values();
        cbCidade.addItem("Selecione...");
        cbEstado.addItem("Selecione...");
        
        // Adicionando os estados do brasil a combobox correspondente.
        for (EstadosBrasil estadosBR : listaEstados) {
            cbEstado.addItem(estadosBR.getSigla());
        }
        
        // Adicionando as cidades do ES ao mesmo ser selecionado na sua respectiva combobox.
        switch(cbEstado.getSelectedItem().toString()){    
            case "ES":
                CidadesES[] cidades = CidadesES.values();
                for(CidadesES c : cidades){
                    cbCidade.addItem(c.getNome());
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        ClienteDAO dao;
        try {
            
            // Abrindo conexão para buscar o cliente.
            dao = new ClienteDAO();
            // Buscando o cliente.
            Cliente cliente = dao.procurarCliente(ftfCpf.getText());
            
            // Criando um novo endereço, caso o mesmo tenha sido alterado.
            Endereco e = new Endereco(tfLogradouro.getText(), tfComplemento.getText(), cbCidade.getSelectedItem().toString(),
            cbEstado.getSelectedItem().toString(), ftfCep.getText());
            // Setando as alterações campo a campo para não perder a referência do ID do cliente.
            cliente.setNome(tfNome.getText());
            cliente.setCpf(ftfCpf.getText());
            cliente.setEstCivil(bgEstadoCivil.getSelection().getActionCommand());
            cliente.setTelefone(ftfTelefone.getText()); 
            cliente.setEmail(tfEmail.getText());
            cliente.setEndereco(e);
            
            // Abrindo conexão para atualizar o cliente.
            dao = new ClienteDAO();
            // Atualizando o cliente.
            dao.atualizar(cliente);
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!", "SUCESSO", INFORMATION_MESSAGE);
            for(int i=0; i<getContentPane().getComponentCount(); i++){
                Component c = getContentPane().getComponent(i);
                if(c instanceof JTextField){
                    ((JTextField)c).setText("");
                }
                else if(c instanceof JFormattedTextField){
                    ((JFormattedTextField)c).setText("");
                }
                else if(c instanceof JTabbedPane){
                    ftfTelefone.setText("");
                    bgEstadoCivil.clearSelection();
                    tfEmail.setText("");
                    tfLogradouro.setText("");
                    tfComplemento.setText("");
                    cbCidade.setSelectedIndex(-1);
                    cbEstado.setSelectedIndex(0);
                    ftfCep.setText("");
                }
                btAtualizar.setEnabled(false);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco.\n" + ex, "ERRO", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
    // Limpando os campos do componente.    
    for(int i=0; i<getContentPane().getComponentCount(); i++){
        Component c = getContentPane().getComponent(i);
        if(c instanceof JTextField){
            ((JTextField)c).setText("");
        }
        else if(c instanceof JFormattedTextField){
            ((JFormattedTextField)c).setText("");
        }
        else if(c instanceof JTabbedPane){
            ftfTelefone.setText("");
            bgEstadoCivil.clearSelection();
            tfEmail.setText("");
            tfLogradouro.setText("");
            tfComplemento.setText("");
            cbCidade.setSelectedIndex(-1);
            cbEstado.setSelectedIndex(0);
            ftfCep.setText("");
        }
        btAtualizar.setEnabled(false);
    }
    }//GEN-LAST:event_btLimparActionPerformed

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
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEstadoCivil;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JFormattedTextField ftfCep;
    private javax.swing.JFormattedTextField ftfCpf;
    private javax.swing.JFormattedTextField ftfTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jrbCasado;
    private javax.swing.JRadioButton jrbDivorciado;
    private javax.swing.JRadioButton jrbSolteiro;
    private javax.swing.JRadioButton jrbUnEstavel;
    private javax.swing.JRadioButton jrbViuvo;
    private javax.swing.JTabbedPane jtpAbas;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
